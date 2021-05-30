import java.util.*;

public class SetMismatch {
    public static int[] findErrorNums(int[] nums) {
//         put nums in map, value is count
//         duplicat is max value's key
//         create list from 1 to max nums value
//         find the number in new list that is missing from nums
        if (nums.length == 2)
            return (nums[0] == 1) ? new int[]{1, 2} : new int[]{2, 1};
        else {
            Map<Integer, Integer> frequencyMap = new HashMap<>();
            for (Integer num : nums) {
                if (frequencyMap.containsKey(num)) {
                    frequencyMap.put(num, frequencyMap.get(num) + 1);
                } else {
                    frequencyMap.put(num, 1);
                }
            }
            int[] duplicate = frequencyMap.entrySet().stream().filter(entry -> 2 == entry.getValue()).mapToInt(e -> e.getKey()).toArray();
            int maxi = Arrays.stream(nums).max().getAsInt() + 1;
            int missing = 0;
            for (int i = 1; i <maxi + 1; i++) {
                if(!frequencyMap.containsKey(i)){
                    missing = i;
                    break;
                }
            }
            return new int[]{duplicate[0], missing};
        }

        
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 2, 4};
        int[] nums2 = new int[]{1, 1};
        int[] nums3 = new int[]{3, 2, 2};
        int[] nums4 = new int[]{1,5,3,2,2,7,6,4,8,9};
        int[][] nums = new int[][]{nums1, nums2, nums3, nums4};

        for(int[] num: nums)
            System.out.println(Arrays.toString(SetMismatch.findErrorNums(num)));
    }
}
