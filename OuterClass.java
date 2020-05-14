public class OuterClass {
        public int num = 20 ;
        public static  int num2 = 50 ;

    static class StaticInner {


        public StaticInner()
        {
            System.out.println("from static inner ");
        }
        public void justPrint()
        {
            System.out.println("from static inner ");
        }
    }
    public  class NonStaticInner{
       public NonStaticInner()
       {
           System.out.println(num2);
           System.out.println("from non static inner ");
       }

    }
}
