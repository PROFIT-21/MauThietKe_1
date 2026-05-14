package IteratorPattern;
import java.util.List;
public class StockIterator implements Iterator<Item> {
    private List<Item> items;
    private int position = 0;

    public StockIterator(List<Item> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        // Tìm kiếm phần tử tiếp theo có trong kho
        while (position < items.size()) {
            Item item = items.get(position);
            if (item.isInStock()) {
                return true;
            }
            position++;
        }
        return false;
    }

    @Override
    public Item next() {
        return items.get(position++);
    }
}
