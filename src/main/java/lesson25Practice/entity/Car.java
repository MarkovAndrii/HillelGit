package lesson25Practice.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "cars")
@Getter
@Setter
@ToString
@NamedNativeQueries({
        @NamedNativeQuery(name = "getAll", query = "SELECT * FROM cars;", resultClass = Car.class),
        @NamedNativeQuery(name = "getByModel", query = "SELECT * FROM cars WHERE model = :model", resultClass = Car.class)
})
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String model;
    @Column(name = "vin_code")
    private String vinCode;
    private String type;
    @Column(name = "car_info_id")
    private Integer carInfoId;


}
