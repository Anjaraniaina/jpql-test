package school.apihei.demo.model;

import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200)
    private String name;

    @ManyToOne
    @JoinColumn(name = "groups_id")
    private Groups group;



}
