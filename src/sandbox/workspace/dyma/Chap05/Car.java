package sandbox.workspace.dyma.Chap05;

public class Car extends Vehicle implements Motorize {

    @Override
    public void fullOfGaz() {
        System.out.println(String.format("[%s] - Full Of Gaz", this.getClass().toString()));
    }

}
