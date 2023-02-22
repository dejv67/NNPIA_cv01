package cz.upce.fei.cv01.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Task {

    @Id
    private Long id;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private Date creationDate;

    @Column
    private Date updateDate;

    @ManyToOne
    @JoinColumn(name="author_id", nullable = false)
    @ToString.Exclude
    private AppUser author;
}
