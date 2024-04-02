package ro.ase.cts.prototype;

public class SalesReport implements Report {
    private String format;
    private String data;
    public SalesReport() throws InterruptedException {
        System.out.println("Generating sales report ...");
        Thread.sleep(2000);
        System.out.println("Sales report generated.");
        this.format = "";
        this.data = "";
    }

    @Override
    public void generateReport() {
        System.out.println("Report with format " + format + " and data [" + data + "] generated.");
    }

    @Override
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public Report clone() {
        SalesReport copy = null;
        try {
            copy = new SalesReport();
            copy.data = this.data;
            copy.format = this.format;
            return copy;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}