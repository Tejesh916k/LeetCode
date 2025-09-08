class StockSpanner {
    public Stack<int[] > stk;
    public StockSpanner() {
        stk=new Stack<>();
    }
    
    public int next(int price) {
        int time=1;
        while(!stk.isEmpty()&& stk.peek()[0]<=price)
        {
            time+=stk.pop()[1];
        }
        stk.push(new int[]{price,time});
        return stk.peek()[1];
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */