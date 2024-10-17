package knapsack;
class Main{
    public static void main(String[]args){
        // int w = 7;
        // int n = 4;
        // int[]wt={1,3,4,5};
        // int[]val={1,4,5,7};
        // System.out.println(knapsack.solve01Knapsack(wt, val, w, n));
        subsetSum s = new subsetSum();
        int ar[] = {1,3,9};
        System.out.println(s.solveSubsetSum(ar, 4));
        

    }
}