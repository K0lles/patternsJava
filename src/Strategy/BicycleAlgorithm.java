package Strategy;

public class BicycleAlgorithm extends IAlgorithm{
    @Override
    public void makeRoute(String yourLocation, String destination) {
        System.out.println("Founded way for bicycle from "+ yourLocation + " to " + destination);
    }
}
