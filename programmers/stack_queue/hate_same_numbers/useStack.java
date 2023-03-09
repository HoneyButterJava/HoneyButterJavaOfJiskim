import java.util.*;
public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(arr[0]);
        for (int i : arr) {
            if (s.peek() != i)
               s.push(i);
        }

        return s.stream().mapToInt(i->i).toArray();
    }
}
