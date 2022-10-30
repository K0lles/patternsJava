package FlyWeight;

import java.util.HashMap;
import java.util.List;

public class FlyweightFactory {
    private HashMap<String, Flyweight> flyweights = new HashMap<>();

    public String getKey(Shared shared) {
        return shared.getCompany() + ", " + shared.getPosition();
    }

    public FlyweightFactory(List<Shared> sharedList) {
        for (Shared shared : sharedList) {
            flyweights.put(this.getKey(shared), new Flyweight(shared));
        }
    }

    public Flyweight getFlyweight(Shared shared) {
        String key = this.getKey(shared);
        if (this.flyweights.get(key) != null) {
            System.out.println("There is no such key as " + shared.getCompany() + ", " + shared.getPosition());
            this.flyweights.put(key, new Flyweight(shared));
        }
        return this.flyweights.get(key);
    }

    public void listFlyweight() {
        System.out.println("Amount: " + this.flyweights.size());
        for (Flyweight flyweight : this.flyweights.values()) {
            System.out.println(flyweight.getData());
        }
    }

    public static void addSpecialistToDatabase(FlyweightFactory ff,
                                               String name,
                                               String passport,
                                               String company,
                                               String position) {
        Flyweight flyweight = ff.getFlyweight(new Shared(company, position));
        flyweight.process(new Unique(name, passport));
    }
}
