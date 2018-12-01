package lt.markussohn.feedme.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Product implements Statistical {

    private Long id;

    private Double carbohydrates;

    private Double protein;

    private Double fat;

    private Double cost;

    private Double calories;

}
