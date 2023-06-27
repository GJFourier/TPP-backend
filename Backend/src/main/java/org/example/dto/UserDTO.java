package org.example.dto;

import lombok.Getter;
import lombok.Setter;
import org.example.entity.User;

@Getter
@Setter
public class UserDTO {
    private Long id;
    private String name;
    private String description;
    private String avatarUrl;
    public UserDTO(User user){
        this.id = user.getId();
        this.name = user.getName();
        this.description = user.getDescription();
        this.avatarUrl = user.getAvatar();
    }
}
