package observer.order;

public class Notification implements Observer{

    public Notification (Order order){
        order.registerObserver(this);
    };
    @Override
    public void update(String order, int price, String userName) {
        System.out.println("알람 입니다. 주문이 완료되었습니다.");
        System.out.println("order = " + order);
        System.out.println("price = " + price);
        System.out.println("userName = " + userName);
    }
}
