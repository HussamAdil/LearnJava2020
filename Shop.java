public class Shop  {

    public static void main(String[] args) {
        Laptop laptop = new Laptop() ;
        // comment
        laptop.pay();
     }

}
class Laptop implements Pay {
    int price = 1000 ;
    int deliveryCost = 5;

    @Override
    public  void pay() {
        System.out.println( price + deliveryCost);
    }

}