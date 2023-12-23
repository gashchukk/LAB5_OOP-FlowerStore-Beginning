package flower.store;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public void setQuantity(int newQuantity) {
        this.quantity = Math.max(newQuantity, 1);
    }

    public double getPrice() {
        return flower.getPrice() * quantity;
    }
}
