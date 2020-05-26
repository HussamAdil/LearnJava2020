
public class Counter {
    public static int instanceCount;

    public Counter() {
        instanceCount++;
    }

    public int getInstanceCount() {
        return instanceCount;
    }


}
