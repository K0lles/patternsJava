package AbstractFactory;

public class CafeFactory extends AbstractFactory{
    @Override
    public AbstractPizzaFourCheeses getFourCheesesPizza() {
        return new CafePizzaFourCheeses();
    }

    @Override
    public AbstractPizzaMargarita getMargaritaPizza() {
        return new CafePizzaMargarita();
    }
}
