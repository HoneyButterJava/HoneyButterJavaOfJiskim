class Solution {
    // +, - 사용. 기본이 +, - 첨가 느낌으루~
    // 숫자 개수 : 2~20, 숫자 : 1~50, 타켓 : 1~1000
    // 가능한 방법의 개수를 return 한다.
    
    int calcTarget(int numbers[], int index, int target) {
        if (index == numbers.length) {
            if (target == tg)
                return 1; 
            return 0;
        }
        return calcTarget(numbers, index + 1, target + numbers[index]) + calcTarget(numbers, index + 1, target - numbers[index]);
    }
    
    static int tg = 0;    
    public int solution(int[] numbers, int target) {
        boolean[] operator = new boolean[numbers.length];
        tg = target;
        return calcTarget(numbers, 1, numbers[0]) + calcTarget(numbers, 1, -numbers[0]);
    }
}
