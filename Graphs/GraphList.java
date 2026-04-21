// package Graphs;
import java.util.*;
public class GraphList {

    ArrayList<ArrayList<Integer>> arr;
    GraphList(int vertices){
        arr = new ArrayList<>();
        for(int i=0;i<vertices;i++){
            arr.add(new ArrayList<>());
        }
    } 
    public void addEdge(int s , int d){
        // s = source
        // d = destination
        arr.get(s).add(d);
        arr.get(d).add(s); // for undirected graph
    }

    public void print(){
        for(int i=0;i<arr.size();i++){
            System.out.print(i+" -> ");
            for(int j =0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        GraphList graph = new GraphList(5);

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.print();

    }
}
