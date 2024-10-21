package reccursion.Permutation;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {

    private static boolean PrintPermutation(List<Integer>arr, List<Integer>ar, int itr){
        if(arr.equals(ar)){
            System.out.println(ar);
            return true;
        }
        if(itr == ar.size()){
            System.out.println(ar);
            return false;
        }
            List<Integer>ar2 = new ArrayList<>(ar);
            for(int i=itr; i<ar2.size(); i++){
                int temp = ar2.get(itr);
                ar2.set(itr, ar2.get(i));
                ar2.set(i, temp);
                PrintPermutation(arr, ar2, itr+1);
            }
        return false;
    }
    public static void main(String[] args) {
        List<Integer>ar = new ArrayList<>();
        Integer[]ar2={1,2,3};
        List<Integer> ar3 = new ArrayList<>(Arrays.asList(ar2));
        Integer[]ar5={1,3,2};
        List<Integer> ar4 = new ArrayList<>(Arrays.asList(ar5));

        //System.out.println(ar);
        //System.out.println(ar2);
        //System.out.println(ar3);
        //System.out.println(ar4);
        // ar4.add(2);
        //ar3.add(2);
        //System.out.println(ar4);
        System.out.println(PrintPermutation(ar4, ar3, 0));
    }

}
