package TheCompositePattern;

public class Salesperson implements Payee {
    private String name;
    public Salesperson(String name) { 
    	this.name = name; 
    }

    @Override
    public void payExpenses(int amount) {
        System.out.println("Salesperson " + name + " has been paid $" + amount);
    }
}
