package test_project;

import java.util.LinkedList;
import java.util.List;

public class WeighedGraph {
    
    List<Node> nodes;
    
    public class Node {
    	public int index;
        public String name;
        public List<Edge> connections;
    }
    
    public class Edge {
        public Node destination;
        public double weight;
    }
    
    public WeighedGraph(){
        nodes = new LinkedList<Node>();
    }
    
    public Node addNode(String nodeName){
        Node n = new Node();
        n.name = nodeName;
        n.connections = new LinkedList<Edge>();
        n.index = nodes.size();
        nodes.add(n);
        return n;
    }
    
    public void addEdge(Node start, Node end, double weight){
        if(nodes.contains(start)){
            Edge e = new Edge();
            e.destination = end;
            e.weight = weight;
            start.connections.add(e);
        }
    }
    
    public void DFS(){
        
        int[] color = new int[nodes.size()]; //1-white, 2-grey, 3-black        
        int[] distance = new int[nodes.size()];
        int[] end_distance = new int[nodes.size()];
        
        for(int i = 0; i < color.length; i++){
            color[i] = 1;
        }
        int time = 0;
        for(Node u: nodes){
            if(color[u.index] == 1){
                time = DFSVisit(u,time, color, distance, end_distance);
            }
        }
        
        for(Node n : nodes){
            System.out.println(n.name + "(" + distance[n.index] + "/" + end_distance[n.index] + ")");
        }
    }
    
    private int DFSVisit(Node u, int time, int[] color, int[] distance, int[] end_distance){
        time = time + 1;
        distance[u.index] = time;
        color[u.index] = 2;
        for(Edge e: u.connections){
            if(null != e.destination && nodes.contains(e.destination) && color[e.destination.index] == 1){
                time = DFSVisit(e.destination, time, color, distance, end_distance);
            }
        }
        time = time + 1;
        color[u.index] = 3;
        end_distance[u.index] = time;
        return time;
    }
    
    public void printGraph(){
        for(Node n : nodes){
            System.out.print(n.name + " -> ");
            for(Edge e: n.connections){
                System.out.print(e.destination.name + "(" + e.weight + ") -> ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        WeighedGraph directedGraph = new WeighedGraph();
        Node asmita = directedGraph.addNode("Asmita");
        Node ameya = directedGraph.addNode("Ameya");
        Node anuja = directedGraph.addNode("Anuja");
        Node anushka = directedGraph.addNode("Anushka");
        Node vidula = directedGraph.addNode("Vidula");
        Node milind = directedGraph.addNode("Milind");
        Node anand = directedGraph.addNode("Anand");
        Node suvarna = directedGraph.addNode("Suvarna");
        Node arun = directedGraph.addNode("Arun");
        
        directedGraph.addEdge(asmita, ameya, 6);
        directedGraph.addEdge(asmita, anuja, 30);
        directedGraph.addEdge(asmita, vidula, 30);
        directedGraph.addEdge(asmita, milind, 30);
        directedGraph.addEdge(asmita, anushka, 5);
        
        directedGraph.addEdge(anuja, anand, 12);
        directedGraph.addEdge(anuja, milind, 32);
        directedGraph.addEdge(anuja, vidula, 32);
        directedGraph.addEdge(anuja, anushka, 5);
        
        directedGraph.addEdge(anand, anuja, 12);
        
        directedGraph.addEdge(anushka, anuja, 5);
        directedGraph.addEdge(anushka, anand, 5);
        
        directedGraph.addEdge(milind, vidula, 40);
        directedGraph.addEdge(vidula, milind, 40);
        
        directedGraph.addEdge(ameya, asmita, 6);
        directedGraph.addEdge(ameya, suvarna, 32);
        directedGraph.addEdge(ameya, arun, 32);
        
        directedGraph.addEdge(suvarna, arun, 40);
        directedGraph.addEdge(arun, suvarna, 40);
        
        directedGraph.printGraph();
        
        System.out.println();
        directedGraph.DFS();
    }
    
}