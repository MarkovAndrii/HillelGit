package lesson25.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "clients")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Client {
    @Id
//    @Column(name = "new_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private Long phone;
    private String about;
    private int age;
}
