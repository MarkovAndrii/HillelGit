package lesson29.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "accounts", schema = "lesson29")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "client_id")
    private int clientId;
    private String number;
    private float value;
}
