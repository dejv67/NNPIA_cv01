package cz.upce.fei.cv01.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;


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
}
