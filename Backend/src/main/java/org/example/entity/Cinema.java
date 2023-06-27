package org.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "cinema",schema = "filmticket")
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 128, nullable = false)
    private String name;

    @Column(name = "location", length = 128, nullable = false)
    private String location;

    //TODO:different with fore
    @Column(name = "description", length = 2048)
    private String description;

    @Column(name = "image", length = 16384)
    private String image;

    @Column(name = "rating", length = 8, nullable = false)
    private Double rating;

    @Column(name = "phone", length = 64, nullable = false)
    private String phone;

    @OneToMany(mappedBy = "cinema",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Screening> screenings;

    @OneToMany(mappedBy = "cinema",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Hall> halls;

    @ManyToMany(mappedBy = "cinemas")
    @JsonIgnore
    private List<Film> films;

}