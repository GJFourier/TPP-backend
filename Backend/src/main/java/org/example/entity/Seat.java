package org.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "seat", schema = "filmticket")
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "seat_row", length = 8, nullable = false)
    private Integer seatRow;

    @Column(name = "seat_column", length = 8, nullable = false)
    private Integer seatColumn;

    @Column(name = "is_sold", length = 8, nullable = false)
    private Boolean isSold;

    @ManyToOne
    @JoinColumn(name = "hall_id", referencedColumnName = "id", nullable = false)
    @JsonIgnore
    private Hall hall;

    @ManyToOne
    @JoinColumn(name = "screening_id", referencedColumnName = "id", nullable = false)
    @JsonIgnore
    private Screening screening;

    @OneToOne(mappedBy = "seat")
    @JsonIgnore
    private OrderItem orderItem;
//    @ManyToOne
//    @JoinColumn(name = "order_id", referencedColumnName = "id")
//    @JsonIgnore
//    private Order order;
}