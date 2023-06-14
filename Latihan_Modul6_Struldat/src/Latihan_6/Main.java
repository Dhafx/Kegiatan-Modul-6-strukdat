package Latihan_6;

public class Main {
    public static void main(String[] args) {
        System.out.println("Graph : ");
        BFSTraversal bfs = new BFSTraversal(12);
        bfs.insertEdge(1, 2);
        bfs.insertEdge(2, 1);
        bfs.insertEdge(2, 5);
        bfs.insertEdge(5, 2);
        bfs.insertEdge(5, 3);
        bfs.insertEdge(5, 9);
        bfs.insertEdge(9, 5);
        bfs.insertEdge(9, 8);
        bfs.insertEdge(8, 9);
        bfs.insertEdge(8, 11);
        bfs.insertEdge(11, 10);
        bfs.insertEdge(5, 7);
        bfs.insertEdge(7, 11);
        bfs.insertEdge(7, 6);
        bfs.insertEdge(6, 7);
        bfs.insertEdge(2, 1);
        bfs.insertEdge(1,4);
        bfs.insertEdge(4, 6);

        DFSTraversal Graph = new DFSTraversal(12);
        Graph.insertEdge(1, 2);
        Graph.insertEdge(1, 4);
        Graph.insertEdge(2, 1);
        Graph.insertEdge(2, 5);
        Graph.insertEdge(4, 6);
        Graph.insertEdge(5, 2);
        Graph.insertEdge(5, 3);
        Graph.insertEdge(5, 7);
        Graph.insertEdge(5, 9);
        Graph.insertEdge(6,7);
        Graph.insertEdge(7, 6);
        Graph.insertEdge(7, 11);
        Graph.insertEdge(8, 9);
        Graph.insertEdge(8, 11);
        Graph.insertEdge(9, 5);
        Graph.insertEdge(9, 8);
        Graph.insertEdge(11, 7);
        Graph.insertEdge(11,10);

        System.out.print("DFS :");
        Graph.DFS(1);
        System.out.print("\nBFS :");
        bfs.BFS(1);
    }
}
