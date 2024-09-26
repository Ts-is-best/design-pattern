package observer.order;

public class Inventory implements Observer {
    private int quantity = 100;


    public Inventory (Order order){
        order.registerObserver(this);
    }


    @Override
    public void update(String order, int price, String userName) {
        this.quantity -= 1;

        checkInventory();
    }

    public void checkInventory(){
        System.out.println("재고가 차감되었습니다.");
        System.out.println("quantity = " + quantity);
    };

    public int getQuantity(){
        return quantity;
    };
}
