package homework4;

import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<Item> items;
    private double totalPrice;

    public Cart() {
        this.items = new ArrayList<>();
        this.totalPrice = 0;
    }

    public void addItem(Item item) {
        items.add(item);
        totalPrice += item.getPrice();
    }

    public void removeItem(Item item) {
        items.remove(item);
        totalPrice -= item.getPrice();
    }

    public List<Item> getItems() {
        return items;
    }
}
