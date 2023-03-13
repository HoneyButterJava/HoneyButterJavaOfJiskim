import java.util.*;
class Solution {

    public int solution(int[] nums) {
        //ver 1
        return Math.min(nums.length/2, (int)Arrays.stream(nums).distinct().count());
    }

    public int solution2(int[] nums) {
        //ver 2
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }
        return Math.min(nums.length/2, set.size());
    }
}
