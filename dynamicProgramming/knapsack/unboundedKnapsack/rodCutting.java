import java.util.List;

class rodCutting {
    public static int solve(List<Integer>len, List<Integer>price, int N, int n){
        if(n == 0){
            return 0;
        }
        if(N<len.get(n-1)){
            return Math.max( price.get(n-1)+solve(len, price, N-len.get(n-1), n),
                   solve(len, price, N, n-1) );
        }else{
            return solve(len, price, N, n-1);
        }
    }   
}
