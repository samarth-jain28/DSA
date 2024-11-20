import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class rodCutting {
    static int count = 0;
    static int count2 = 0;
    public static int solve(List<Integer>len, List<Integer>price, int N, int n){
        if(n == 0){
            return 0;
        }
        if(N == 0){
            return 0;
        }
        count++;
        if(N>=len.get(n-1)){
            return Math.max( price.get(n-1)+solve(len, price, N-len.get(n-1), n),
                   solve(len, price, N, n-1) );
        }else{
            return solve(len, price, N, n-1);
        }
    }
    
    public static int solveTopDown(List<Integer>len, List<Integer>price, int N, int n){
        int [][]dp = new int[n+1][N+1];

        for(int i=0;i<N+1;i++){
            dp[0][i]=0;
        }
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<N+1;j++){
                if(len.get(i-1)<=j){
                    dp[i][j] = Math.max(price.get(i-1)+dp[i][j-len.get(i-1)],
                        dp[i-1][j]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
                count2++;
            }
        }

        return dp[n][N];

    }

    static List<List<Integer>>dp = new ArrayList<>(Collections.nCopies(5, new ArrayList<>(Collections.nCopies(10, -1))));
    public static int solveMemoise(List<Integer>len, List<Integer>price, int N, int n){
        for(List<Integer> i : dp){
            System.out.println(i);
        }
        System.out.println(dp.size());
        return 0;
    }
}
