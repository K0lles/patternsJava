package Bridge;

public class TreeOven {
    private String type;

    public TreeOven() {
        this.type = "electrical";
    }

    public void getBaked(Pizza pizza) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        pizza.setBaked(true);
        System.out.println("Baked!!!!!");
    }

    public String getType() {
        return type;
    }
}
