package AbstractFactory;

public abstract class AbstractPizzaMargarita {
    private String institution;

    public AbstractPizzaMargarita(String institution) {
        this.institution = institution;
    }

    public String getInstitution() {
        return institution;
    }

    public abstract void create();
}
