package observer.order;

public class Payment implements Observer{
    private String order;
    private int price;
    private String userName;
    public Payment(Order orderData){
        orderData.registerObserver(this);
    }


    @Override
    public void update(String order, int price, String userName) {
        this.order = order;
        this.price = price;
        this.userName = userName;
        payment();
    }

    private void payment(){
        System.out.println("결제가 완료되었습니다.");
        System.out.println("order = " + order);
        System.out.println("price = " + price);
        System.out.println("userName = " + userName);
    };
}
