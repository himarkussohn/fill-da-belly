package lt.markussohn.feedme.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class DailyMealPlan implements Statistical {

    private Long id;

    private List<Recipe> meals;

    private Double calories;

    private Double cost;
}
