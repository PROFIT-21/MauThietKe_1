package IteratorPattern;
import java.util.ArrayList;
import java.util.List;
public class Inventory {
    private List<Item> items = new ArrayList<>();

    public void addItem(String name, boolean inStock) {
        items.add(new Item(name, inStock));
    }

    public Iterator<Item> getStockIterator() {
        return new StockIterator(items);
    }
}