package FlyWeight;

public class Shared {
    private String company;
    private String position;

    public Shared(String company, String position) {
        this.company = company;
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }
}
