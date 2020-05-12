public class PdfPlugin  implements Plugin {

    @Override
    public void loadPlugin() {
        System.out.println("loaded");
    }

    @Override
    public void runPlugin() {
    System.out.println("done");
    }

    @Override
    public void closePlugin() {
        System.out.println("closed");
    }
}
