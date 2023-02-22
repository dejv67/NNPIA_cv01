package cz.upce.fei.cv01.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Role {

    @Id
    private Long id;

    @Column
    private String name;

    @ManyToMany
    @JoinTable(
            name = "app_user_role",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "app_user_id")
    )
    @ToString.Exclude // It will prevent to infinity loop in Lombok ToString generation because field from each class points to themselves
    private List<AppUser> users = Collections.emptyList();
}
