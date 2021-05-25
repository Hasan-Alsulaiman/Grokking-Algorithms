import java.util.Stack;

public class Recursion {
    public static int sum(MyStack x){
        if(x.isEmpty())
            return 0;
        else{
            x.pop();
            return  1 + sum(x);

        }
    }

    public static int binSearch(int[] array, int element, int start, int end){
        if(start < end){
            int middle = start + (end - 1) / 2;
            System.out.println(start + " " + end + " " + middle);
            if(array[middle] == element)
                return middle;
            if(array[middle] > element)
                return binSearch(array, element, start, middle - 1);
            if(array[middle] < element)
                return binSearch(array, element, middle + 1, end);
        }
        return -1;
    }

    public static int findMax(int[] array, int startIndex){
//        base
        if(startIndex == array.length - 1)
            return array[startIndex];
        else
            return Math.max(array[startIndex], findMax(array, startIndex + 1));
    }



    public static void main(String[] args) {
        MyStack<Integer> x = new MyStack();
        int[] array = new int[10];
        for (int i = 9; i > 0; i--) {
        array[i] = i;
        }

        System.out.println(findMax(array, 0));
    }

}
