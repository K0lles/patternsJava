package Bridge;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourCheeses extends Pizza{
    public FourCheeses() {
        super("four cheeses", 12.50, Arrays.asList("cheese one", "cheese another"));
    }
}
