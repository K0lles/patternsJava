package Strategy;

public class WalkAlgorithm extends IAlgorithm{
    @Override
    public void makeRoute(String yourLocation, String destination) {
        System.out.println("Founded way for walking from "+ yourLocation + " to " + destination);
    }
}
