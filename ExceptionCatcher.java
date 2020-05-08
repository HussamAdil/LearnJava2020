import java.util.InputMismatchException;

public class ExceptionCatcher {
public void div(int a ,int b) {
    try {
        if (b == 0) {
            throw new ArithmeticException(" you can't div by zero ");
        }
        System.out.println(a / b);
    }catch (ArithmeticException e )
    {
        System.out.println(e.getMessage());
    }
}
}
