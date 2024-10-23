package goods.ducks;

import goods.GoodsItem;

public class RubberDuck extends GoodsItem {

    private String color; //только в классе
    private String size; //package private - пакет, наследники, пакеты protected - класс и наследник
    Eyes eyes;

    public RubberDuck(String color, String size, double price) {
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public String getColor(){
        return color;
    }

    public String getSize(){
        return size;
    }

    public void printInfo(){
        System.out.printf("Duck color: %s\nDuck size: %s\nDuck price: %f\n", color, size, price);
    }

    public void addToCart(int quantity){
        System.out.printf("Added %d %s ducks to cart\n", quantity, color);
    }

}
