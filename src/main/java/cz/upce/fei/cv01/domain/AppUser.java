package cz.upce.fei.cv01.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collections;
import java.util.Date;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
public class AppUser {

    @Id
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private Boolean active;

    @Column
    private Date creationDate;

    @Column
    private Date updateDate;

    @OneToMany(mappedBy = "author")
    private List<Task> tasks = Collections.emptyList();

    @ManyToMany(mappedBy = "users")
    private List<Role> roles = Collections.emptyList();
}
