class Engine {
    private double cylinderSize;
    private double cylinderAmount;
    private double horsePower;

    public Engine(double cylinderSize, double cylinderAmount, double horsePower) {
        this.cylinderSize = cylinderSize;
        this.cylinderAmount = cylinderAmount;
        this.horsePower = horsePower;
    }

    public double getCylinderSize() {
        return cylinderSize;
    }

    public void setCylinderSize(double cylinderSize) {
        this.cylinderSize = cylinderSize;
    }

    public double getCylinderAmount() {
        return cylinderAmount;
    }

    public void setCylinderAmount(double cylinderAmount) {
        this.cylinderAmount = cylinderAmount;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }
}

abstract class Car {
    private Engine engine;
    private int race;
    private int sitAmount;
    private String version;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getRace() {
        return race;
    }

    public void setRace(int race) {
        this.race = race;
    }

    public int getSitAmount() {
        return sitAmount;
    }

    public void setSitAmount(int sitAmount) {
        this.sitAmount = sitAmount;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public abstract int Ride();
    public abstract Car clone();
}

public class Prototype extends Car {
    private Engine engine;
    private int race;
    private int sitAmount;
    private String version;

    public Prototype(Engine engine, int sitAmount, String version) {
        this.engine = engine;
        this.sitAmount = sitAmount;
        this.version = version;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getRace() {
        return race;
    }

    public int getSitAmount() {
        return sitAmount;
    }

    public void setSitAmount(int sitAmount) {
        this.sitAmount = sitAmount;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public int Ride() {
        this.race += 1000;
        return this.race;
    }

    @Override
    public Car clone() {
        return new Prototype(new Engine(this.engine.getCylinderSize(), this.engine.getCylinderAmount(), this.engine.getHorsePower()),
                this.sitAmount, this.version);
    }
}
