package ObjectPool;

import java.util.ArrayList;
import java.util.List;

public class ObjectPool {
    private List<Connection> connectionList = new ArrayList<>();

    public ObjectPool() {
        connectionList.add(new Connection("firstConnection"));
        connectionList.add(new Connection("secondConnection"));
        connectionList.add(new Connection("thirdConnection"));
    }

    public Connection getConnection() {
        for (Connection connection: connectionList
             ) {
            if (connection.getStatus().equals("waiting")) {
                connection.setStatus("in progress");
                return  connection;
            }
        }
        return null;
    }

    public void finishConnection(Connection connection) {
        connection.setStatus("waiting");
    }
}
