package sandbox.workspace.dyma.Chap05;

public class Crazy {

    private InnerCrazy innerCrazy;

    public Crazy() {
        innerCrazy = new InnerCrazy();
    }

    public String getInnerCrazy() {
        return innerCrazy.toString();
    }

    public void displayWithCallback(Callback callback) {
        System.out.println("Nomal feature of callback");
        callback.execute();
    }

    private class InnerCrazy {
    }



}
