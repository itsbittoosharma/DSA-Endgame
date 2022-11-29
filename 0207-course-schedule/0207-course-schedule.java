class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] adj=new ArrayList[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            adj[i]=new ArrayList<>();
        }
        for(int[] arr:prerequisites)
        {
            adj[arr[0]].add(arr[1]);
        }
        int[] visited=new int[numCourses];
        for(int i=0;i<numCourses;i++)
        {
            if(check(i,adj,visited)==false)
                return false;
        }
        return true;
    }
    public boolean check(int node,ArrayList<Integer>[] adj,int[] visited)
    {
        if(visited[node]==1) return false;
        if(visited[node]==2) return true;
        visited[node]=1;
        for(int i=0;i<adj[node].size();i++)
        {
            if(check(adj[node].get(i),adj,visited)==false)
                return false;
        }
        visited[node]=2;
        return true;
    }
}