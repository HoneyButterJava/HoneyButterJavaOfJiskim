class Solution {
    public int solution(int[][] sizes) {
        int fst_max = 0, snd_max = 0;
        int i_max = sizes.length;
        
        for (int i = 0; i < i_max; ++i) {
            if (sizes[i][0] > sizes[i][1]) {
                int tmp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = tmp;
            }
            if (fst_max < sizes[i][0]) {
                fst_max = sizes[i][0];
            }
            if (snd_max < sizes[i][1]) {
                snd_max = sizes[i][1];
            }
        }
        return (fst_max * snd_max);
    
    }
}
