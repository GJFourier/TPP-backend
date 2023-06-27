package org.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "screening", schema = "filmticket")
public class Screening {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "start_time", length = 64, nullable = false)
    private Date startTime;

    @Column(name = "end_time", length = 64, nullable = false)
    private Date endTime;

    @Column(name = "price", length = 8, nullable = false)
    private Double price;

    @OneToMany(mappedBy = "screening",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Seat> seats;

//    @OneToOne(mappedBy = "screening",cascade=CascadeType.ALL)
//    @JsonIgnore
//    private Order order;

    @ManyToOne
    @JoinColumn(name = "film_id", referencedColumnName = "id")
    private Film film;

    @ManyToOne
    @JoinColumn(name = "cinema_id", referencedColumnName = "id")
    @JsonIgnore
    private Cinema cinema;

    @ManyToOne
    @JoinColumn(name = "hall_id", referencedColumnName = "id")
    @JsonIgnore
    private Hall hall;
}
