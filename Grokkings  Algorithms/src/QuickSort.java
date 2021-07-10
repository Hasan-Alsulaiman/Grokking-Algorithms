import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    static ArrayList<Integer> sort(ArrayList<Integer> arr){
        if(arr.size() <= 1)
            return arr;

        int mid = arr.get(arr.size() / 2);
        System.out.println("mid: " + mid);
        var smaller = new ArrayList<Integer>();
        var bigger = new ArrayList<Integer>();

        for(Integer element: arr){
            if(element < mid)
                smaller.add(element);
            if(element > mid)
                bigger.add(element);
        }
        System.out.println(smaller + " " + bigger);
        var result = new ArrayList<Integer>(sort(smaller));
        result.add(mid);
        result.addAll(sort(bigger));
        return result;


    }

    public static void main(String[] args) {
        var arr = new ArrayList<Integer>(Arrays.asList( 5, 1, 7, 3, 8, 2, 4));
        System.out.println(QuickSort.sort(arr));
    }
}
