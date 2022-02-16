package graph;
//Adjacency Matrix

import java.util.Scanner;

public class depthFirstSearch {
	public static void DFS(int[][] edges) {
		int[] visited=new int[edges.length];
		for(int i=0;i<edges.length;i++) {
			if(visited[i]==0) {
				DFSHelper(edges,i,visited);
			}
		}
	}
	public static void DFSHelper(int[][]edges, int sv, int[] visited) {
		System.out.println(sv);
		visited[sv]=1;
		int n=edges.length;
		for(int j=0;j<n;j++) {
			if(edges[sv][j]==1 && visited[j]!=1) {
				DFSHelper(edges,j,visited);
			}
		}
		return;
	}
	public static void main(String[] args) {
		int n;
		int e;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		e=sc.nextInt();
		int[][] edges=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				edges[i][j]=0;
			}
		}
		for(int i=0;i<e;i++) {
			int sv=sc.nextInt();
			int ev=sc.nextInt();
			edges[sv][ev]=1;
			edges[ev][sv]=1;
		}
		DFS(edges);
	}
}
