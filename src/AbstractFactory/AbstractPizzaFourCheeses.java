package AbstractFactory;

public abstract class AbstractPizzaFourCheeses {
    private String institution;

    public AbstractPizzaFourCheeses(String institution) {
        this.institution = institution;
    }

    public String getInstitution() {
        return institution;
    }

    public abstract void create();
}
