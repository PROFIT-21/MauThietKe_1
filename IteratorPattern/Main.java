package IteratorPattern;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addItem("Laptop", true);
        inventory.addItem("Phone", false);
        inventory.addItem("Mouse", true);
        inventory.addItem("Keyboard", false);

        Iterator<Item> iterator = inventory.getStockIterator();

        System.out.println("Items in stock:");
        while (iterator.hasNext()) {
            Item item = iterator.next();
            System.out.println("- " + item.getName());
        }
    }
}