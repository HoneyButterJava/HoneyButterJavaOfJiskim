class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {-1, -1};
        
        int round = brown;
        // width + height
        brown = (brown + 4) / 2;
        for (int h = 3; h < brown; ++h) {
            int w = brown - h;
            int area = w * h;
            
            if ((area - round) == yellow)
            {
                answer[0] = w;
                answer[1] = h;
                break;
            }
        }
        
        return answer;
    }
}
