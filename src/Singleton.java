public class Singleton {
    private static Singleton instance;
    private int tables;

    private Singleton() {
        this.tables = 0;
    }

    public void createTable() {
        this.tables++;
    }

    public void deleteTable() {
        if (tables > 0) {
            this.tables--;
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public int getTables() {
        return tables;
    }
}
