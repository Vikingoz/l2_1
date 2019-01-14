package etc;

public class FabricString implements Fabric {

    Integer i;

    public FabricString() {
    }

    public FabricString(Integer i) {
        this.i = i;
    }

    public String createObject() {
        if (this.i == null) {
            return new String();
        }
        return new String(new char[i]);
    }

    public Integer getI() {
        return this.i;
    }

}
