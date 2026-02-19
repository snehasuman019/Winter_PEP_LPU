// package Day 19;
import java.util.*;
public class Graph1dir {
    static int vertex=0;
    static ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
    static void createGraph(int v){
        for(int i=0;i<=v;i++){
            graph.add(new ArrayList<>());
        }
        vertex=v+1;
    }

    static void addEdge(int src,int dest){
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }

    static void bfs(int src, int v){
        boolean[] visited=new boolean[v+1];
        Queue<Integer> q=new LinkedList<>();
        q.offer(src);
        visited[src]=true;
        q.add(src);
        while(!q.isEmpty()){
            int d=q.poll();
            System.out.print(d+" ");

            for(int i:graph.get(d)){
                if(!visited[i]){
                    q.offer(i);
                    visited[i]=true;
                }
            }
        }
    }

    static void dfs(int src, boolean[] visited){
        System.out.print(src+" ");
        visited[src]=true;

        for(int i:graph.get(src)){
            if(!visited[i]){
                dfs(i, visited);
            }
        }
    }

    static ArrayList<Integer> lst=new ArrayList<>();
    static boolean isPathExist(int src,int dest,boolean[] visited){
        lst.add(src);
        visited[src]=true;
        if(src==dest) return true; 

        for(int i:graph.get(src)){
            if(!visited[i]){
                if(isPathExist(i,dest,visited)){
                    return true;
                }
            }
        }
        lst.remove(lst.size()-1);
        return false;
    }

    static boolean cycleExist(int src,int parent,boolean[] visited){
        visited[src]=true;

        for(int i:graph.get(src)){
            if(!visited[i]){
                return cycleExist(i,src,visited);
            }
            else if(i!=parent){
                return true;
            }
        }
        return false;
    }
    static void checkConnected(int src, boolean[] visited){
        // System.out.print(src+" ");
        visited[src]=true;

        for(int i:graph.get(src)){
            if(!visited[i]){
                checkConnected(i, visited);
            }
        }
    }

    public static void main(String[] args){
            createGraph(7);
            addEdge(1,2);
            // addEdge(2,3);
            addEdge(3,4);
            addEdge(4,5);
            // addEdge(6, 7);
            // addEdge(4,7);
            // addEdge(5,6);
            // addEdge(6,1);

            // System.out.println(graph.get(1));
            // bfs(1,7);
            // System.out.println();
            boolean[] visited=new boolean[6];
            // dfs(1, visited);
            // System.out.println();
            // System.out.println(isPathExist(2,3,new boolean[8]));
            // System.out.println(cycleExist(1,0,new boolean[8]));
            int count=0;
            for(int i=1;i<5;i++){
                if(!visited[i]){
                    checkConnected(i, visited);
                    count++;
                }
            }
            System.out.println(count);
    }
}