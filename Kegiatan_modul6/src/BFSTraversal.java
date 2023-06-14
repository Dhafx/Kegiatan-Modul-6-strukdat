import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {
    private int node;
    private LinkedList<Integer> adj[];
    private Queue<Integer> que;

    BFSTraversal(int v){
        node = v;
        adj = new LinkedList[node];
        for(int i = 0;i<v;i++){
            adj[i] = new LinkedList<>();
        }
        que = new LinkedList<Integer>();
    }

    void addEdge(int a, int b)
    {
        adj[a].add(b);
    }
    void BFS(int n){
        boolean nodes[] = new boolean[node];
        int o = 0;
        que.add(n);
        while(que.size() != 0){
            que.poll();
            for(int i=0;1<adj[n].size();i++)
            {
             o = adj[n].get(i);
             if(!nodes[o]){
                 nodes[o] = true;
                 que.add(o);
             }
            }
        }
    }
}
