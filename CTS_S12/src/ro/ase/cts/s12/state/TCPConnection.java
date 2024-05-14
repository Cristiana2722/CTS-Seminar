package ro.ase.cts.s12.state;

// Context class
public class TCPConnection {
    private TCPState currentState;

    public TCPConnection() {
        currentState = new TCPClosedState();
    }

    public void setState(TCPState state) {
        this.currentState = state;
    }

    public void open() {
        currentState.open(this);
    }

    public void close() {
        currentState.close(this);
    }

    public void acknowledge() {
        currentState.acknowledge(this);
    }
}

// State interface
interface TCPState {
    void open(TCPConnection connection);
    void close(TCPConnection connection);
    void acknowledge(TCPConnection connection);
}

// Concrete state classes
class TCPOpenState implements TCPState {

    @Override
    public void open(TCPConnection connection) {
        System.out.println("Connection is already open.");
    }

    @Override
    public void close(TCPConnection connection) {
        System.out.println("Closing connection.");
        connection.setState(new TCPClosedState());
    }

    @Override
    public void acknowledge(TCPConnection connection) {
        System.out.println("Acknowledging data.");
    }
}

class TCPClosedState implements TCPState {

    @Override
    public void open(TCPConnection connection) {
        System.out.println("Opening connection.");
        connection.setState(new TCPOpenState());
    }

    @Override
    public void close(TCPConnection connection) {
        System.out.println("Connection is already closed.");
    }

    @Override
    public void acknowledge(TCPConnection connection) {
        System.out.println("Cannot acknowledge data. Connection is closed.");
    }
}

// Client code
class Main {
    public static void main(String[] args) {
        TCPConnection connection = new TCPConnection();

        connection.open();
        connection.acknowledge();
        connection.close();
        connection.acknowledge();
    }
}