package Tree;

public class binaryTreeArrayMain {
    public static void main(String[] args) {
        binaryTreeArray bta = new binaryTreeArray();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        bta.traverseInOrder(0);
    }
}
