package Strategy;

public class Navigator {
    public String currentLocation;
    public IAlgorithm algorithm;

    public Navigator(String currentLocation, IAlgorithm algorithm) {
        this.currentLocation = currentLocation;
        this.algorithm = algorithm;
    }

    public void findRoute(String destination) {
        this.algorithm.makeRoute(this.currentLocation, destination);
        this.currentLocation = destination;
    }
}
