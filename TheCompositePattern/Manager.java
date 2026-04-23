package TheCompositePattern;

public class Manager implements Payee {
    private String name;
    public Manager(String name) { 
    	this.name = name; 
    }

    @Override
    public void payExpenses(int amount) {
        System.out.println("Manager " + name + " has been paid $" + amount);
    }
}
