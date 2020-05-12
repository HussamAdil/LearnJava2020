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

    }
}
