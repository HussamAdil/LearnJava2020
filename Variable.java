public class Variable {
    public static void main(String[] arrgs)
    {
        String customerName = "Hussam Adil";
        int orderNo = 101;
        int productPrice = 100 ;
        double discout = 25.0;
        System.out.println("Dear Customer : " + customerName);
        System.out.println("Your Order :   " + orderNo);
        //give the customer some discount
        if(productPrice <= 5000 )
        {
            double totalPrice = productPrice-discout;
            System.out.println("Total Price = " + totalPrice );
        }else
        {
            System.out.println(productPrice);
        }
     }
}
