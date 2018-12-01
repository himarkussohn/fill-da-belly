package lt.markussohn.feedme.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Recipe implements Statistical {

    private Long id;

    private Double servings;

    private Double cost;

    private Double calories;

    private List<Ingredient> ingredients;

    private MealType type;
}
