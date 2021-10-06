
class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        return check(arr,0);
    }
    
    boolean check(int[] arr, int index)
    {
        boolean temp=false;
        if(index==arr.length-1) return true;
        else{
            temp=check(arr,index+1);
        }
        if(temp && arr[index]<=arr[index+1]) return true;
        else return false;
    }
}
