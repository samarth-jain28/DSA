import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[]args){

        Integer[]length = {1,3,4,2,6,9};
        Integer[]prices = {2,5,6,3,9,15};
        int N = 200;

        List<Integer>len = new ArrayList<>(Arrays.asList(length));
        List<Integer>price = new ArrayList<>(Arrays.asList(prices));
        
        // System.out.println("Ans is: "+rodCutting.solve(len, price, N, len.size()));
        // System.out.println(rodCutting.count);

        // System.out.println("Ans is: "+rodCutting.solveTopDown(len, price, N, len.size()));
        // System.out.println(rodCutting.count2);

        System.out.println("Ans is: "+rodCutting.solveMemoise(len, price, N, len.size()));
        // System.out.println(rodCutting.count2);

    }
}
