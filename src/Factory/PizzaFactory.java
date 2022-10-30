package Factory;

import java.util.HashMap;
import java.util.Map;

public class PizzaFactory {

     public static Pizza createPizza(IPizza pizza) {
         Map<IPizza, Pizza> dictionary = new HashMap<IPizza, Pizza>() {{
             put(IPizza.FOUR_CHEESES, new PizzaFourCheeses());
             put(IPizza.MARGARITA, new PizzaMargarita());
             put(IPizza.CLASSIC, new PizzaClassic());
         }};

         return dictionary.get(pizza);
    }
}
