package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Car {
    String make;

    public Car(String make) {
        this.make = make;
    }
}
