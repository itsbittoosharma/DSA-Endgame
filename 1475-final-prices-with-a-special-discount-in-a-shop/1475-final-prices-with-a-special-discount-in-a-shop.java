class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> indexToChange=new Stack<Integer>();
        for(int i=0;i<prices.length;i++)
        {
            while(!indexToChange.isEmpty()&&prices[i]<=prices[indexToChange.peek()])
            {
                prices[indexToChange.pop()] -= prices[i];
            }
            indexToChange.push(i);
        }
        return prices;
    }
}