package lesson24.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Status {
    private int id;
    private String alias;
    private String description;

    public Status(String alias, String description) {
        this.alias = alias;
        this.description = description;
    }
}
