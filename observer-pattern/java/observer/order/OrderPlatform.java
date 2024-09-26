package observer.order;

public class OrderPlatform {
    public static void main(String[] args) {
        Order order = new Order();
        Payment payment = new Payment(order);
        Point point = new Point(order);
        Notification notification = new Notification(order);
        Inventory inventory = new Inventory(order);



        order.orderRequest("커피", 3000, "홍길동");

        if(inventory.getQuantity() != 99){
            throw new IllegalArgumentException("재고 차감 오류" + inventory.getQuantity());
        }
    }
}

/**
 * 옵저버 패턴 사용 예시
 */
