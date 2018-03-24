package test_project;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import test_project.WeighedGraph.Edge;
import test_project.WeighedGraph.Node;

public class Graph {
	
	Node[] nodes;
	int size;
	
	public class Node{
		int index;
		String name;
		List<Node> connections;
	}
	
	public Graph(int size){
		nodes = new Node[size];
	}
	
	public Node addNode(String nodeName){
		Node n = new Node();
		n.name = nodeName;
		n.connections = new LinkedList<Node>();
		n.index = size;
		if(size < nodes.length){
			nodes[size++] = n;
		}
		return n;
	}
	
	public void addEdge(Node source, Node destination){
		if(null != source && null != destination){
			source.connections.add(destination);
		}
	}
	
	public void printGraph(){
        for(Node n : nodes){
        	if(null == n) continue;
            System.out.print(n.name + " -> ");
            for(Node e: n.connections){
                System.out.print(e.name + " -> ");
            }
            System.out.println();
        }
    }
	
public void BFS(Node n){
        
        
        int[] color = new int[size];
        int[] distance = new int[size]; 
        Node[] parent = new Node[size];
        for(int i = 0; i < color.length; i++){
            color[i] = 1;
            distance[i] = Integer.MAX_VALUE;
        }
        
        Queue<Node> Q = new LinkedList<Node>();
        color[n.index] = 2;
        distance[n.index] = 0;
        Q.add(n);
        while(!Q.isEmpty()){
            Node temp = Q.remove();
            for(Node adj: temp.connections){
                if(null != adj && 1 == color[adj.index]){
                    color[adj.index] = 2;
                    parent[adj.index] = temp;
                    distance[adj.index] = distance[temp.index] + 1;
                    Q.add(adj);
                }
            }
            color[temp.index] = 3;
        }
        
        for(int i = 0; i<size; i++){
            System.out.println(nodes[i].name + " (" + distance[i] + "/" + (null == parent[i]? "null" : parent[i].name) + ")");
        }
        
        
    }
	
	public static void main(String[] args){
		Graph directedGraph = new Graph(10);
        Node asmita = directedGraph.addNode("Asmita");
        Node ameya = directedGraph.addNode("Ameya");
        Node anuja = directedGraph.addNode("Anuja");
        Node anushka = directedGraph.addNode("Anushka");
        Node vidula = directedGraph.addNode("Vidula");
        Node milind = directedGraph.addNode("Milind");
        Node anand = directedGraph.addNode("Anand");
        Node suvarna = directedGraph.addNode("Suvarna");
        Node arun = directedGraph.addNode("Arun");
        
        directedGraph.addEdge(asmita, ameya);
        directedGraph.addEdge(asmita, anuja);
        directedGraph.addEdge(asmita, vidula);
        directedGraph.addEdge(asmita, milind);
        directedGraph.addEdge(asmita, anushka);
        
        directedGraph.addEdge(anuja, anand);
        directedGraph.addEdge(anuja, milind);
        directedGraph.addEdge(anuja, vidula);
        directedGraph.addEdge(anuja, anushka);
        
        directedGraph.addEdge(anand, anuja);
        
        directedGraph.addEdge(anushka, anuja);
        directedGraph.addEdge(anushka, anand);
        
        directedGraph.addEdge(milind, vidula);
        directedGraph.addEdge(vidula, milind);
        
        directedGraph.addEdge(ameya, asmita);
        directedGraph.addEdge(ameya, suvarna);
        directedGraph.addEdge(ameya, arun);
        
        directedGraph.addEdge(suvarna, arun);
        directedGraph.addEdge(arun, suvarna);
        
        directedGraph.printGraph();
        
        System.out.println();
        directedGraph.BFS(ameya);
    }

}
