package lt.markussohn.feedme.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Ingredient {

    private Long id;

    private Product product;

    private Recipe recipe;

    private Double quantity;
}
