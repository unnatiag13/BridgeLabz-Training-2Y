class Graph{
    int[][] matrix;
    Graph(int vertices){
        this.matrix = new int[vertices][vertices];
    }
    public void addEdge(int s,int d){
        //for directed
        matrix[s][d]=1;

        //for undirected
        // matrix[s][d] = 1;
        // matrix[d][s] = 1;

    }

    public static void main(String[] args){
        Graph g = new Graph(5);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,4);
        g.addEdge(1,3);
        g.addEdge(2,3);
        g.addEdge(4,3);
    }
}