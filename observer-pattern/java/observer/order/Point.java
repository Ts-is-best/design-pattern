package observer.order;

public class Point implements Observer{
    private int point;
    private String userName;
    private String order;

    public Point(Order orderData){
        orderData.registerObserver(this);
    }

    @Override
    public void update(String order, int price, String userName) {
        this.point = price;
        this.userName = userName;
        this.order = order;

        usePoint();
    }

    private void usePoint(
    ){
        System.out.println("포인트가 사용되었습니다.");
        System.out.println("order = " + order);
        System.out.println("price = " + point);
        System.out.println("userName = " + userName);
    };
}
