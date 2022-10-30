package ObjectPool;

public class Connection {
    private String name;
    private String status;

    public Connection(String name) {
        this.name = name;
        this.status = "waiting";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Connection " + name;
    }
}
