public class App {


    public static void main(String[] args) {
       Employee em = new Employee("Hussam" , 5000);
        Account ac =new Account(em);

            // exception
            ExceptionCatcher ec = new ExceptionCatcher();
            // ec.div(15,3);


            // Factorial example
        Factorial factorial = new Factorial();

        // tweet example

        Tweet t = new Tweet("Hussam","Java ");
        t.reply("omer","node.js");
        t.retweet("ali" , "vue.js");

        // plugin
        WebApp webApp = new WebApp();
        PdfPlugin pdfPlugin = new PdfPlugin();
        webApp.load(pdfPlugin);
        webApp.run(pdfPlugin);
        webApp.close(pdfPlugin);

        // Anonymous class

        // via variable
        Plugin anonymousClass = new Plugin(){

            @Override
            public void loadPlugin() {
                System.out.println("loaded from anonymous class using variable ");
            }

            @Override
            public void runPlugin() {
                System.out.println("done from anonymous class using variable ");
            }

            @Override
            public void closePlugin() {
                System.out.println("closed from anonymous class using variable ");
            }
        };
         webApp.run(anonymousClass);
        webApp.load(anonymousClass);
        webApp.close(anonymousClass);
        // direct anonymous class
         webApp.run( new Plugin(){

            @Override
            public void loadPlugin() {
                System.out.println("loaded from anonymous class direct ");
            }

            @Override
            public void runPlugin() {
                System.out.println("done from anonymous class direct");
            }

            @Override
            public void closePlugin() {
                System.out.println("closed from anonymous class direct");
            }
        });


        webApp.load( new Plugin(){

            @Override
            public void loadPlugin() {
                System.out.println("loaded from anonymous class direct");
            }

            @Override
            public void runPlugin() {
                System.out.println("done from anonymous  class direct");
            }

            @Override
            public void closePlugin() {
                System.out.println("closed from class direct");
            }
        });
        webApp.close( new Plugin(){


            @Override
            public void loadPlugin() {
                System.out.println("loaded from anonymous class direct");
            }

            @Override
            public void runPlugin() {
                System.out.println("done from anonymous  class direct");
            }

            @Override
            public void closePlugin() {
                System.out.println("closed from class direct");
            }
        });
    }

    // Outer & inner class
    OuterClass outerClass = new OuterClass();
    OuterClass.StaticInner si = new OuterClass.StaticInner();

 }
