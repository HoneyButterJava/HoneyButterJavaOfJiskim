import java.util.*;

class Solution {
    static List<Integer>[] results;
    static List<Integer> pointer;
    static int fin_num;

    public boolean getNotInstruction(int N, int times) {
        int num = 0;
        while (times-- > 0) {
            num *= 10;
            num += N;
        }
        if (num == fin_num)
            return true;
        pointer.add(num);
        return false;
    }

    public boolean useInstructions(List<Integer> aList, List<Integer> bList) {
        for (int a : aList) {
            for (int b : bList){
                int cal = a + b;
                if (cal == fin_num)
                    return true;
                pointer.add(cal);

                cal = a * b;
                if (cal == fin_num)
                     return true;
                pointer.add(cal);

                if (a > b) {
                    cal = a - b;
                    if (cal == fin_num)
                        return true;
                    pointer.add(cal);

                    cal = a / b;
                    if (cal == fin_num)
                        return true;
                    pointer.add(cal);
                }
            }
        }
        return false;
    }

    public int solution(int N, int number) {
        fin_num = number;
        if (N == number)
            return 1;
        if (number == 1 || number == 0)
            return 2;

        results = new ArrayList[8];
        for (int i = 0; i < 8; ++i)
            results[i] = new ArrayList<Integer>();
        results[0].add(N);
        results[1].add(1);

        for (int i = 1 ; i < 8; ++i) {
            pointer = results[i];
            for (int j = 0; j <= i / 2; ++j){
                if (useInstructions(results[i - j - 1], results[j]))
                    return i + 1;
            }
            if (getNotInstruction(N, i + 1))
                return i + 1;
        }
        return -1;
    }
}
