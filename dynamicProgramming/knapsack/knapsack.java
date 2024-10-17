package knapsack;
class knapsack{
    public static int solve01Knapsack(int[]wt, int[]val, int w, int n){
        if(w==0 || n==0){
            return 0;
        }
        if(wt[n-1]<=w){
            return Math.max(val[n-1]+solve01Knapsack(wt, val, w-wt[n-1],n-1), solve01Knapsack(wt, val, w, n-1));
        }
        else if(wt[n-1]>w){
            return solve01Knapsack(wt, val, w, n-1);
        }
        return 0;
    }
}