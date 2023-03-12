import java.util.*;
class Solution {
    // K 번째 수
    public int[] solution(int[] array, int[][] commands) {
        int len = commands.length;
        int[] answer = new int[len];
        // commands 의 i, j 까지 자르고 k 번째 숫자를 꺼내온다.

        for (int i = 0; i < len; ++i) {
            int[] tmp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(tmp);
            answer[i] = tmp[commands[i][2] - 1];
        }
        return answer;
    }
}
