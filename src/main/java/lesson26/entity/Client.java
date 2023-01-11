package lesson26.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "clients")
@Getter
@Setter
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private Long phone;
    private String about;
    private int age;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "passport_id", unique = true, nullable = false)
    private Passport passport;
    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY) //or FetchType.EAGER
    private Set<House> houses;
    @ManyToMany
    @JoinTable(
            name = "client_role",
            joinColumns = {@JoinColumn(name = "client_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")}
    )
    private Set<Role> roles;
}
