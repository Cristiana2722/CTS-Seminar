package ro.ase.cts.s09.facade.HR;

public class Main {
    public static void main(String[] args) {
        FinancialSystemFacade financialSystem = new FinancialSystemFacade(new AccountingSystem(), new PayrollSystem(), new InvestmentSystem());
        financialSystem.processSalaryPayments();
        financialSystem.manageInvestments();
    }
}
