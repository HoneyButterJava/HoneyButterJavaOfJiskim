import java.util.Arrays;

class Solution {
  public int solution(int n, int[] lost, int[] reserve) {
    Arrays.sort(lost);
    Arrays.sort(reserve);

    int lost_i = 0, i = 0, count = 0;
    for (i = 0; i < reserve.length && lost_i < lost.length;) {
      if (reserve[i] > lost[lost_i] + 1 || (lost_i < lost.length - 1 && (reserve[i] == lost[lost_i + 1])))
          ++lost_i;
      else if (reserve[i] < lost[lost_i] - 1 || (i < reserve.length - 1 && (reserve[i + 1] == lost[lost_i])))
          ++i;
      else {
          ++count;
          ++i;
          ++lost_i;
      }
    }
    return n - (lost.length - count);
  }
}
