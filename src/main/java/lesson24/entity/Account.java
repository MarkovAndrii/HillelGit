package lesson24.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Account {
    private int id;
    private int clientId;
    private String number;
    private float value;

    public Account(int clientId, String number, float value) {
        this.clientId = clientId;
        this.number = number;
        this.value = value;
    }
}
