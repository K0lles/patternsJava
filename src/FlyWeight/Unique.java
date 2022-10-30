package FlyWeight;

public class Unique {
    private String name;
    private String passport;

    public Unique(String name) {
        this.name = name;
    }

    public Unique(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public String getPassport() {
        return passport;
    }
}
