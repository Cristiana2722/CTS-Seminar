package ro.ase.cts.s09.decorator;

interface DataService {
    String fetchData();
}
public class DataServiceConcrete implements DataService {
    @Override
    public String fetchData() {
        return "Data";
    }
}

class LoggingDecorator implements DataService {
    private DataService wrappee; // neaparat privat

    public LoggingDecorator(DataService wrappee) { // nu e neaparat sa il avem in constructor
        this.wrappee = wrappee;
    }

    @Override
    public String fetchData() {
        System.out.println("Fetching data...");
        return wrappee.fetchData();
    }
}

class Main1 {
    public static void main(String[] args) {
        // Usage
        DataService myDataService = new LoggingDecorator(new DataServiceConcrete());
        System.out.println(myDataService.fetchData());

        // Create the actual data service object
        DataService realDataService = new DataServiceConcrete();

        // Decorate the realDataService with LoggingDecorator
        DataService loggedDataService = new LoggingDecorator(realDataService);

        // Use the decorated service to fetch data
        String data = loggedDataService.fetchData();
        System.out.println("Data Retrieved: " + data);
    }
}
