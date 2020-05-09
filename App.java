public class App {
    public static void main(String[] args) {
       Employee em = new Employee("Hussam" , 5000);
        Account ac =new Account(em);

            // exception
            ExceptionCatcher ec = new ExceptionCatcher();
            // ec.div(15,3);


            // Factorial
        Factorial factorial = new Factorial();

        System.out.println(factorial.getFactorial(8));
    }
}
