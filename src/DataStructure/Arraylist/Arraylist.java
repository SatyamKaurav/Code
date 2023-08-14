package DataStructure.Arraylist;
import java.util.ArrayList;
public class Arraylist {


    public static ArrayList<Integer> RCD(int[] arr){

        ArrayList<Integer> result=new ArrayList<>();
        result.add(arr[0]);
        for (int i = 1; i< arr.length; i++){
            if (arr[i] != arr[i-1]){
                result.add(arr[i]);
            }
        }
return result;
    }

    public static void main(String[] args) {
        int[] arr={10,10,20,20,20,30};
        ArrayList<Integer> result=RCD(arr);
        for (int x:result){
            System.out.println(x);
        }
    }
}
