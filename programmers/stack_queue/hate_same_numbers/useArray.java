import java.util.*;
public class Solution {
    public int[] solution(int []arr) {
        int count = 0;
        int last = 0;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] == arr[last]) {
                arr[i] = -1;
            }
            else {
                last = i;
                ++count;
            }
        }
        
        int[] answer = new int[count + 1];
        for(int i = 0, j = 0; j < arr.length; ++j) {
            if (arr[j] != -1){
                answer[i++] = arr[j];   
            }
        }
        return answer;
    }
}
