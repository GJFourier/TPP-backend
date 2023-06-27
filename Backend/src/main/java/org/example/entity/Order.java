package org.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "orders",schema = "filmticket")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JsonIgnore
    private User user;

    @Column(name = "total_price", length = 16, nullable = false)
    private Double totalPrice;

    @Column(name = "purchase_time", length = 32, nullable = false)
    private Date purchaseTime;

    @ManyToOne
    @JoinColumn(name = "screening_id",referencedColumnName = "id",nullable = false)
    private Screening screening;

//    @OneToMany
//    private List<Seat> seats;

    @OneToMany(mappedBy = "order",cascade=CascadeType.ALL)
    private List<OrderItem> orderItems;
}
