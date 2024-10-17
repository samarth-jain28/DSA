import java.util.ArrayList;

public class getRow {
    public static ArrayList<Integer> get(int n){
        ArrayList<Integer> row = new ArrayList<>();
        int temp = 1;
        row.add(temp);
        temp = n;
        int temp2 = n-1;
        for(int i=1;i<1+n;i++){
            row.add(temp);
            temp = temp*temp2--;
            temp = temp/(i+1);
        }
        return row;

    }
}
