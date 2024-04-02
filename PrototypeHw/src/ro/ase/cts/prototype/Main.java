package ro.ase.cts.prototype;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ReportGenerator reportGenerator = new ReportGenerator();
        Report salesReport = reportGenerator.generateReport("Data", "PDF", "Sales");
        salesReport = reportGenerator.generateReport("Data", "PDF", "Sales");
    }
}
