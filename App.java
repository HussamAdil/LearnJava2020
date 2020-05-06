public class App {
    public static void main(String[] args) {
       Employee em = new Employee("Hussam" , 5000);
        Account ac =new Account(em);
        System.out.println(ac.getNet());
/*
*  when invoked the constructor
 */
        Counter co = new Counter();
        System.out.println(co.getInstanceCount());

        Counter co1 = new Counter();
        System.out.println(co1.getInstanceCount());
    }
}
