package week15;

public class mainGraph {
    public static void main(String[] args) throws Exception {
        graph Graph = new graph(6);

        Graph.addEdge(0, 1);
        Graph.addEdge(0, 4);
        Graph.addEdge(1, 2);
        Graph.addEdge(1, 3);
        Graph.addEdge(1, 4);
        Graph.addEdge(2, 3);
        Graph.addEdge(3, 4);
        Graph.addEdge(3, 0);
        Graph.printGraph();
        Graph.degree(2);
        Graph.removeEdge(1, 3);
        Graph.printGraph();
    }
}
