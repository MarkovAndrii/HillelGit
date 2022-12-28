package lesson25Practice.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "owners")
@Getter
@Setter
@ToString
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String surname;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(name = "car_id")
    private Integer carId;
    @Embedded
    private Info info;
}
