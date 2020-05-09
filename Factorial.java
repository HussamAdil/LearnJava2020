public class Factorial {
    public int getFactorial(int val)
    {
         if (val == 1)
            return  1 ;
        else
          return   val * getFactorial(val - 1);
    }
}
