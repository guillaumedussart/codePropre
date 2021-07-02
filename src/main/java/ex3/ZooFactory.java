package ex3;

public class ZooFactory {
    public ZooFactory() {
    }

    private static class ZooFactoryHolder {
        private static ZooFactory single;

        static {
            single = new ZooFactory();
        }
    }

    public static ZooFactory getSingle() {

        return ZooFactoryHolder.single;
    }
}
