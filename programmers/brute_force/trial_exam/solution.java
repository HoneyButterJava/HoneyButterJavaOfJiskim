class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        
        int[] answer = {1, 2, 3};
        
        int oc = 0, twc = 0, thc = 0;
        for (int i = 0; i < answers.length; ++i) {
            if (answers[i] == one[i % 5])
                ++oc;
            if (answers[i] == two[i % 8])
                ++twc;
            if (answers[i] == three[i % 10])
                ++thc;
        }
        
        if (oc > thc && oc > twc) {
            answer = new int[1];
            answer[0] = 1;
        }
        else if (twc > thc && twc > oc) {
            answer = new int[1];
            answer[0] = 2;
        }
        else if (thc > oc && thc > twc) {
            answer = new int[1];
            answer[0] = 3;
        } else if  (oc == twc && oc != thc) {
            answer = new int[2];
            answer[0] = 1;
            answer[1]  = 2;
        } else if  (oc == thc && oc != twc) {
            answer = new int[2];
            answer[0] = 1;
            answer[1]  = 3;
        } else if  (twc == thc && oc != twc) {
            answer = new int[2];
            answer[0] = 2;
            answer[1]  = 3;
        }
        
        return answer;
    }
}
