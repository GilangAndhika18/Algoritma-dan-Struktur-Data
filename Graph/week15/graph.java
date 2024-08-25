package week15;

public class graph {
    int vertex;
    linkedList list[];

    public graph(int vertex) {
        this.vertex = vertex;
        list = new linkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new linkedList();
        }
    }

    public void addEdge(int source, int destination) {
        //add edge
        list[source].addFirst(destination);
        //add back edge
        list[destination].addFirst(source);
    }

    public void degree(int source) throws Exception {
        //degree undirected graph
        System.out.println("degree vortex " + source + " : " 
        + list[source].size());

        //degree directed graph
            //in degree
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
        for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == source) 
                    ++totalIn;
                
        }
            //outdegree
        for (k = 0; k < list[source].size(); k++) {
            list[source].get(k);
        }
        totalOut = k;
        }

        System.out.println("Indegree dari vertex " + source + " : " 
        + totalIn);
        System.out.println("Outdegree dari vertex " + source + " : " 
        + totalOut);
        System.out.println("degree vertex " + source + " : " 
        + (totalIn + totalOut));
    }

    public void removeEdge(int source, int destination) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == destination) {
                list[source].remove(destination);
            }
        }
    }

    public void removeAllEdge() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph barhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + i + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }
}
