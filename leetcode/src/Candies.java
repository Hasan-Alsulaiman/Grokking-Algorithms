import java.util.*;

public class Candies {
    public static int distributeCandies(int[] candyType) {
//        Integer[] sourceArray = Arrays.stream(candyType).boxed().toArray(Integer[]::new);
        Set<Integer> targetSet = new HashSet<Integer>();
//        Collections.addAll(targetSet, sourceArray);
        for(Integer candy: candyType){
            targetSet.add(candy);
        }
        int maxNum = candyType.length / 2;
        return  (maxNum > targetSet.size())? targetSet.size() : maxNum;

    }
    public static void main(String[] args) {
        int[] input = {1,1,2,3};
        System.out.println(distributeCandies(input));
    }
}

