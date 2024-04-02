package ro.ase.cts.prototype;

import java.util.HashMap;
import java.util.Map;

public class ReportGenerator {
    private Map<String, Report> reports = new HashMap<>();
    public ReportGenerator() {
    }
    public Report generateReport(String data, String format, String type) throws InterruptedException {
        Report reportToGenerate = reports.get(type);
        if (reportToGenerate == null)
        {
            System.out.println("Object needs to be created.");
            reportToGenerate = new SalesReport();
            reportToGenerate.setData(data);
            reportToGenerate.setFormat(format);
            this.reports.put(type, reportToGenerate);
        }
        return reportToGenerate.clone();
    }
}
