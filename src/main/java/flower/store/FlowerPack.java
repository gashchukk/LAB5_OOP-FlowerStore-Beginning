package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public void setQuantity(int quantity) {
        this.quantity = quantity < 1 ? 1 : quantity;
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}
