package lt.markussohn.feedme.web.controller;

import lt.markussohn.feedme.model.DailyMealPlan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = {"/", "/home"})
    public DailyMealPlan getHomePageContent() {
        return new DailyMealPlan();
    }
}
