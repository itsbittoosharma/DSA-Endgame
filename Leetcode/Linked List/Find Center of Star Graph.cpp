
Question Link: https://leetcode.com/problems/find-center-of-star-graph/
Find Center of Star Graph

Problem Description

There is an undirected star graph consisting of n nodes labeled from 1 to n. A star graph is a graph where there is one center node and exactly n - 1 edges that connect the center node with every other node.

You are given a 2D integer array edges where each edges[i] = [ui, vi] indicates that there is an edge between the nodes ui and vi. Return the center of the given star graph.

 

Example 1:


Input: edges = [[1,2],[2,3],[4,2]]
Output: 2
Explanation: As shown in the figure above, node 2 is connected to every other node, so 2 is the center.
Example 2:

Input: edges = [[1,2],[5,1],[1,3],[1,4]]
Output: 1
 
 Constraints:

3 <= n <= 105
edges.length == n - 1
edges[i].length == 2
1 <= ui, vi <= n
ui != vi
The given edges represent a valid star graph.

Code-
Using adjacency list:

int findCenter(vector<vector<int>>& edges) {
        int n = edges.size(); 
        vector<vector<int>> adj(n+2); 
        for(int i=0;i<edges.size();i++){
            adj[edges[i][0]].push_back(edges[i][1]);
            adj[edges[i][1]].push_back(edges[i][0]);
        }
        for(int i=1;i<=n+1;i++)
            if(adj[i].size()==n)return i; 
        return 0;
    }


added the c++ code






java code--
 
 
 public int findCenter(int[][] edges) {
    int x = edges[0][0], y = edges[0][1];
    return (y == edges[1][0] || y == edges[1][1]) ? y : x;
}
