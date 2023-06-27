package org.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "user", schema = "filmticket")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", length = 128, nullable = false)
    private String username;

    @Column(name = "name", length = 128)
    private String name;

    @Column(name = "email", length = 128)
    private String email;

    @Column(name = "phone", length = 128)
    private String phone;

    @Column(name = "avatar", length = 128)
    private String avatar;

    @Column(name = "description", length = 65535)
    private String description;

    @OneToOne(mappedBy = "user")
    @JsonIgnore
    private UserAuth userAuth;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Order> orders;
}
