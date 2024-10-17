package knapsack;
public class subsetSum{
    private boolean t[][];

    public boolean solveSubsetSum(int[]ar, int sum){
        int n = ar.length;
        t = new boolean[n+1][sum+1];
        for(int i=1;i<sum+1;i++){
            t[0][i] = false;
        }
        for(int i=0;i<n+1;i++){
            t[i][0] = true;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(ar[i-1]==j){
                    t[i][j] = t[i][j-ar[i-1]]||t[i-1][j];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }

        return t[n][sum];
    }
}