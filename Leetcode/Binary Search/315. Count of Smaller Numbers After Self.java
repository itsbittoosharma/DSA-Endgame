(This is not a highly optimized solution for this problem)
(This is just to illustrate solution with Binary Search)

class Solution {
    public List<Integer> countSmaller(int[] nums) {
        //Final array to be returned at last
        List<Integer> ans= new ArrayList<Integer>(nums.length); 
        //Creating a duplicate sorted array
        List<Integer> sorted=new ArrayList<Integer>(nums.length);
        for(int i:nums) sorted.add(i);
        Collections.sort(sorted);
        
        for(int i=0;i<nums.length;i++)
        {
            //Binary search to find index of nums[i] in sorted array
            int index=binSearch(nums[i],sorted);
            //As we have to only count Smaller Numbers after the current element, 
            //we won't need this number ever to be counted wheather it's smaller
            //or greater than any element at any right direction position
            //from this element in original array, so remove it from our sorted array !
            sorted.remove(index);
            //Avoid duplicate elements, as we have to count only the smaller ones
            int count=0;
            for(int j=index-1;j>=0;j--)
            {
                if(sorted.get(j)<nums[i]) {count=j+1; break;}
            }
            //Add the count to final output list
            ans.add(count);
        }
        return ans;
    }
    
    //Function for Binary search
    public int binSearch(int target,List<Integer> sorted)
    {
        int l=0,r=sorted.size()-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(target==sorted.get(mid)) return mid;
            else if(target<sorted.get(mid)) r=mid-1;
            else l=mid+1;
        }
        return 0;
    }
}