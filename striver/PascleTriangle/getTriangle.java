import java.util.ArrayList;

public class getTriangle {
    public static ArrayList<ArrayList<Integer>> get(int n){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            res.add(getRow.get(i));
        }
        return res;
    }
}
