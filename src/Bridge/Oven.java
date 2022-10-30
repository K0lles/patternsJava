package Bridge;

public class Oven extends OvenImplementator{
    private String type;

    public Oven() {
        this.type = "oven";
    }

    public void getBaked(Pizza pizza) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        pizza.setBaked(true);
        System.out.println("Baked!!");
    }

    public String getType() {
        return type;
    }
}
