class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int a=0;
        for(String i: operations){
            if(i.equals("X++") || i.equals("++X")){
                a+=1;
            }
            else{
                a=a-1;
            }
        }
        return a;
    }
}
