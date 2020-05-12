public class WebApp {
    public void load(Plugin p)
    {
        p.loadPlugin();
    }
    public void run(Plugin p)
    {
        p.runPlugin();
    }
    public void close(Plugin p)
    {
        p.closePlugin();
    }
}
