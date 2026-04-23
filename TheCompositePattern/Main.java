package TheCompositePattern;

public class Main {
    public static void main(String[] args) {
        Payee boss = new Manager("Alice");
        Payee staff1 = new Salesperson("Bob");

        SalesTeam subTeam = new SalesTeam();
        subTeam.addPayees(new Salesperson("Charlie"), new Salesperson("David"));

        SalesTeam bigTeam = new SalesTeam();
        bigTeam.addPayees(boss, staff1, subTeam);

        System.out.println("--- Paying Expenses ---");
        bigTeam.payExpenses(100);
    }
}