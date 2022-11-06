import AbstractFactory.Application;
import AbstractFactory.CafeFactory;
import AbstractFactory.RestaurantFactory;
import Bridge.FourCheeses;
import Bridge.Margarita;
import Bridge.Oven;
import Bridge.TreeOven;
import Builder.AbstractBuilder;
import Builder.FourCheeseBuilder;
import Builder.MargaritaBuilder;
import ChainResponsibility.Action;
import ChainResponsibility.Administrator;
import ChainResponsibility.StockManager;
import Command.*;
import Composite.Box;
import Composite.IItem;
import Decorator.FacebookDecorator;
import Decorator.Notifier;
import Decorator.PhoneDecorator;
import Facade.Customer;
import Facade.ManagerOfStock;
import Facade.Product;
import Facade.Stock;
import Factory.IPizza;
import Factory.Pizza;
import Factory.PizzaFactory;
import FlyWeight.FlyweightFactory;
import FlyWeight.Shared;
import Iterator.LinkedList;
import Iterator.LinkedListIterator;
import Iterator.Node;
import Mediator.*;
import Memento.Notepad;
import Memento.NotepadManager;
import ObjectPool.ObjectPool;
import ObjectPool.Connection;
import Observer.Chief;
import Proxy.SimpleSite;
import Proxy.SiteProxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main.Observer();
    }

    public static void Singleton() {
        System.out.println("Singleton");
        Singleton connection = Singleton.getInstance();
        connection.createTable();
        connection.createTable();
        System.out.println(connection.getTables());
        Singleton connectionSecond = Singleton.getInstance();
        System.out.println(connectionSecond.getTables());
        System.out.println("\n\n\n\n");
        System.out.println("End Singleton");
    }

    public static void Prototype() {
        System.out.println("Prototype");
        Engine engineSimple = new Engine(3.0, 4, 250);
        Car audi_rs3 = new Prototype(engineSimple, 5, "RS3");
        Car audi_rs7 = audi_rs3.clone();
        System.out.println(audi_rs3.getSitAmount());
        System.out.println(audi_rs3.getEngine().getCylinderAmount());
        System.out.println("\n");
        System.out.println(audi_rs7.getSitAmount());
        System.out.println(audi_rs7.getEngine().getCylinderAmount());
        System.out.println("\n\n");

        audi_rs7.getEngine().setCylinderSize(5.0);
        audi_rs7.getEngine().setHorsePower(400);

        System.out.println(audi_rs3.getEngine().getCylinderAmount());
        System.out.println(audi_rs7.getSitAmount());
        System.out.println(audi_rs7.getEngine().getCylinderSize());
        System.out.println(audi_rs7.getEngine().getHorsePower());
        System.out.println("End Prototype");
    }

    public static void Builder() {
        AbstractBuilder margaritaWorker = new MargaritaBuilder();
        AbstractBuilder fourCheeseWorker = new FourCheeseBuilder();

        System.out.println(margaritaWorker.getPizza());
        System.out.println(fourCheeseWorker.getPizza());
    }

    public static void Factory() {
        for (IPizza pizza : IPizza.values()) {
            Pizza createdPizza = PizzaFactory.createPizza(pizza);
            System.out.println("Pizza is " + pizza + " and it's price is " + createdPizza.getPrice());
        }
    }

    public static void AbstractFactory() {
        Application cafe = new Application(new CafeFactory());
        cafe.getFourCheesesPizza();
        cafe.getMargaritaPizza();

        Application restaurant = new Application(new RestaurantFactory());
        restaurant.getFourCheesesPizza();
        restaurant.getMargaritaPizza();
    }

    public static void ObjectPool() {
        ObjectPool pool = new ObjectPool();

        Connection connection = pool.getConnection();
        System.out.println(connection);

        Connection connection1 = pool.getConnection();
        System.out.println(connection1);

        Connection connection2 = pool.getConnection();
        System.out.println(connection2);

        Connection connection3 = pool.getConnection();
        System.out.println(connection3);

        pool.finishConnection(connection2);
        Connection connection4 = pool.getConnection();
        System.out.println(connection4);

    }

    public static void Adapter() {
        Adapter.Pizza pizza1 = new Adapter.Pizza("margarita", 12.50);
        Adapter.Adapter adapter = new Adapter.Adapter(pizza1);

        System.out.println(pizza1.geInfo());
        System.out.println(adapter.getInfo());
    }

    public static void Bridge(){
        FourCheeses pizza1 = new FourCheeses();
        Margarita pizza2 = new Margarita();

        Oven oven = new Oven();
        TreeOven treeOven = new TreeOven();
        oven.getBaked(pizza1);
        treeOven.getBaked(pizza2);
    }

    public static void Composite() {
        Box box = new Box("Box");
        Box boxSmall = new Box("Small box");
        Box boxSmallest = new Box("The smallest box");

        Composite.Pizza margarita = new Composite.Pizza("margarita", 15.50);
        Composite.Pizza fourCheeses = new Composite.Pizza("four cheese", 16.00);
        Composite.Pizza paperoni = new Composite.Pizza("paperoni", 14.50);

        List<IItem> listSmallest = Arrays.asList(paperoni, margarita);
        boxSmallest.addItem(listSmallest);
        List<IItem> listSmall = Arrays.asList(paperoni, paperoni, boxSmallest);
        boxSmall.addItem(listSmall);
        List<IItem> list = Arrays.asList(margarita, margarita, fourCheeses, boxSmall);
        box.addItem(list);
        System.out.println(boxSmallest.getPrice());
        System.out.println(boxSmall.getPrice());
        System.out.println(box.getPrice());
    }

    public static void Decorator() {
        Notifier notifierAboutLunch = new Notifier("There are pizza discounts today!");
        FacebookDecorator facebookNotifier = new FacebookDecorator(notifierAboutLunch);
        PhoneDecorator phoneNotifier = new PhoneDecorator(notifierAboutLunch);

        System.out.println(notifierAboutLunch.sendNotification());
        System.out.println(facebookNotifier.sendNotification());
        System.out.println(phoneNotifier.sendNotification());
    }

    public static void Facade() {
        Product screwdriver = new Product("screwdriver", 14.99);
        Product nail = new Product("nail", 0.99);
        Stock.addProductToStock(screwdriver);
        Stock.addProductToStock(nail);
        List<Product> products = Arrays.asList(screwdriver, nail);

        Customer customer = new Customer("Marina", products);
        List<Product> finalProducts = customer.orderProducts();
        System.out.println(finalProducts);
    }

    public static void Flyweight() {
        List<Shared> sharedList = new ArrayList<>(Arrays.asList(new Shared("Google", "Senior"),
                                                                new Shared("Yahoo", "Junior"),
                                                                new Shared("Microsoft", "QA"),
                                                                new Shared("Apple", "Product manager")));
        FlyweightFactory flyweightFactory = new FlyweightFactory(sharedList);
        flyweightFactory.listFlyweight();
        System.out.println("-------------------------");
        FlyweightFactory.addSpecialistToDatabase(flyweightFactory, "Banjo", "754687", "Google", "Senior");
        FlyweightFactory.addSpecialistToDatabase(flyweightFactory, "Maja", "875465", "Yahoo", "Junior");
        FlyweightFactory.addSpecialistToDatabase(flyweightFactory, "Linda", "756452", "Yahoo", "Junior");
        flyweightFactory.listFlyweight();
    }

    public static void Proxy() {
        SiteProxy proxy = new SiteProxy(new SimpleSite());

        System.out.println(proxy.getPage("home"));
        System.out.println(proxy.getPage("about"));
        System.out.println(proxy.getPage("about"));
        System.out.println(proxy.getPage("home"));
    }

    public static void ChainResponsibility() {
        StockManager stockManager = new StockManager(null);
        Administrator administrator = new Administrator(stockManager);
        administrator.serve(Action.MAKE_ORDER);
        System.out.println("\n");
        administrator.serve(Action.QUESTION);
    }

    public static void Command() {
        Image image = new Image();
        Text text = new Text();
        Program program = new Program();
        program.addCommands(new SaveTextCommand(text));
        program.addCommands(new ZipImageCommand(image));
        program.executeCommands();
    }

    public static void Iterator() {
        LinkedList linkedList = new LinkedList(new Node(5));
        linkedList.add(new Node(7));
        linkedList.add(new Node(9));
        linkedList.add(new Node(11));
        LinkedListIterator iterator = new LinkedListIterator(linkedList);
        iterator.iterate();
    }

    public static void Mediator() {
        RestaurantMediator restaurant = new RestaurantMediator();
        Waiter waiter = new Waiter("Kolya", restaurant);
        Barman barman = new Barman("Andrey", restaurant);
        Order foodFirstOrder = new Order(OrderType.FOOD);
        Order foodSecondOrder = new Order(OrderType.FOOD);
        Order drinkFirstOrder = new Order(OrderType.DRINK);
        Order drinkSecondOrder = new Order(OrderType.DRINK);
        restaurant.execute(foodFirstOrder, Mediator.Action.GET_ORDER);
        restaurant.execute(foodSecondOrder, Mediator.Action.GET_ORDER);
        restaurant.execute(drinkFirstOrder, Mediator.Action.GET_ORDER);
        restaurant.execute(drinkSecondOrder, Mediator.Action.GET_ORDER);
        restaurant.execute(foodFirstOrder, Mediator.Action.FINISH_ORDER);
        restaurant.execute(foodSecondOrder, Mediator.Action.FINISH_ORDER);
        restaurant.execute(drinkFirstOrder, Mediator.Action.FINISH_ORDER);
        restaurant.execute(drinkSecondOrder, Mediator.Action.FINISH_ORDER);
    }

    public static void Memento() {
        NotepadManager notepadManager = new NotepadManager();
        Notepad notepad = new Notepad("file.txt");
        notepad.write("Hello World! \n");
        notepadManager.save(notepad);
        notepad.write("Goodbye! \n");
        notepadManager.save(notepad);
        notepad.write("Yeah\n");

        System.out.println(notepad.content);
        notepadManager.undo(notepad);
        System.out.println(notepad.content);
    }

    public static void Observer() {
        Chief chief = new Chief();
        Observer.Customer marina = new Observer.Customer("Marina", chief);
        Observer.Customer andrij = new Observer.Customer("Andrij", chief);
        Observer.Customer john = new Observer.Customer("John", chief);

        marina.addOrder(new Observer.Order(Observer.OrderType.MARGARITA));
        andrij.addOrder(new Observer.Order(Observer.OrderType.FOUR_CHEESES));
        john.addOrder(new Observer.Order(Observer.OrderType.FOUR_CHEESES));

        chief.makingOrder();
        chief.makingOrder();
        chief.makingOrder();
    }
}