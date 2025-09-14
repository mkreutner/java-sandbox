package sandbox.workspace.dyma.Chap05;

public interface Motorize {

    /**
     * 
     */
    default void fullOfGaz() throws Exception {
        throw new Exception("fullOfGaz must be implemented");
    }
}
