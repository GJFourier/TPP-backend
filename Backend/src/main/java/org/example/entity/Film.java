package org.example.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "film",schema = "filmticket")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "is_later", nullable = false)
    private Boolean isLater;

    @Column(name = "name", length = 128, nullable = false)
    private String name;

    @Column(name = "description", length = 2048)
    private String description;

    @Column(name = "image", length = 16384)
    private String image;

    @Column(name = "release_date", length = 64, nullable = false)
    private String releaseDate;

    @Column(name = "duration", length = 8, nullable = false)
    private Integer duration;

    @Column(name = "region", length = 64, nullable = false)
    private String region;

    @Column(name = "rating", length = 8, nullable = false)
    private Double rating;

    @OneToMany(mappedBy = "film",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Screening> screening;

    @ManyToMany
    @JsonIgnore
    @JoinTable(name = "film_cinema", schema = "filmticket",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "cinema_id"))
    private List<Cinema> cinemas;

    @ManyToMany
    @JoinTable(name = "film_tag", schema = "filmticket",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"))
    private List<Tag> tags;

    @ManyToMany
    @JoinTable(name = "film_director", schema = "filmticket",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "director_id"))
    private List<Director> directors;

    @ManyToMany
    @JoinTable(name = "film_actor", schema = "filmticket",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id"))
    private List<Actor> actors;
}
