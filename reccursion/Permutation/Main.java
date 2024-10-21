package reccursion.Permutation;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {

    static private void PrintPermutation(List<Integer> ar3, int n){
        if(n==0){
            System.out.println(ar3);
        }
        
    }
    public static void main(String[] args) {
        List<Integer>ar = new ArrayList<>();
        Integer[]ar2={1,2,3};
        List<Integer> ar3 = new ArrayList<>(Arrays.asList(ar2));
        List<Integer> ar4 = new ArrayList<>(ar3);

        //System.out.println(ar);
        //System.out.println(ar2);
        //System.out.println(ar3);
        //System.out.println(ar4);
        // ar4.add(2);
        ar3.add(2);
        System.out.println(ar4);

        PrintPermutation(ar3, ar3.size());
        System.out.println(ar3);
    }

}
