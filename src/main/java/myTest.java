import etc.*;

public class myTest {



    public static void main(String[] args) {

       // print();
        getMemory(new FabricObject());
        getMemory(new FabricString());
        for (int i = 1; i < 99; i++) {
            getMemory(new FabricString(i));
        }
    }

    static void getMemory(final Fabric fabric) {
        System.gc();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Runtime run = Runtime.getRuntime();
        long l1, l2;
        int size = 10000000;
        Object[] oArray = new Object[size];
        l1 = run.totalMemory() - run.freeMemory();
        for (int i = 0; i < oArray.length; i++) {
            oArray[i] = fabric.createObject();
        }
        l2 = run.totalMemory() - run.freeMemory();
        System.out.print(oArray[0].getClass() + "[" + fabric.getI() + "]:");
        System.out.println((l2 - l1)/size);
    }

}
