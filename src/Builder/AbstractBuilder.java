package Builder;

import java.util.List;

public abstract class AbstractBuilder {
    public abstract void setDough();

    public abstract void setCheese();

    public abstract void setMeat();

    public abstract Pizza getPizza();
}
