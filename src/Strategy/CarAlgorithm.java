package Strategy;

public class CarAlgorithm extends IAlgorithm{
    @Override
    public void makeRoute(String yourLocation, String destination) {
        System.out.println("Founded way for car from "+ yourLocation + " to " + destination);
    }
}
