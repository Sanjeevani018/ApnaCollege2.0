public class ArraysCC{
    public static int buyAndSellStock(int prices[]){
        int buyPrice=Integer.MAX_VALUE;//lowest buyPrice for stock
        int maxProfit=0;//max profit 
        for(int i=0;i<prices.length;i++){
             if(buyPrice<prices[i]){  //case 1:- can gain profit and update  to maxProfit
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit, profit);

        }else{
            buyPrice=prices[i];   //case 2:-it will gain loss so better Buy the stock
        }
        
    }return maxProfit;
}
    public static void main(String args[]){
            int prices[]={7,1,5,3,6,4};
           System.out.println(buyAndSellStock(prices));
}
}
