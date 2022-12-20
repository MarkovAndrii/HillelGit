package lesson24.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class Client {
    private int id;
    private String name;
    private String email;
    private long phone;
    private String about;
    private int age;

    public Client(String name, String email, long phone, String about) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.about = about;
    }
}
