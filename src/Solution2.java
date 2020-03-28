import java.util.Map;

public class Solution2 {

    public int solution(int A, int B) {
        // write your code in Java SE 8
        if(A<0 || B<0){
            throw new RuntimeException("A and B must be non negative");
        }
        String strA = Integer.toString(A);
        String strB = Integer.toString(B);
        if(strA.length() > strB.length()){
            return -1;
        }
        for(int i = 0; i < strB.length() - strA.length() + 1; i++){
            int j = 0;
            for(; j < strA.length(); j++){
                if(strA.charAt(j) != strB.charAt(i+j)){
                    break;
                }
            }
            if(j == strA.length()){
                return i;
            }
        }
        return -1;
    }

    int solution2(int[] A){
        Map<Integer, Integer> map;
        int n = A.length;
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] == A[i + 1])
                result = result + 1;
        }
        int r = Integer.MIN_VALUE; ///////////
        for (int i = 0; i < n; i++) {
            int count = 0;
            if (i > 0) {
                if (A[i - 1] != A[i])
                    count = count + 1;
                else
                    count = count - 1;
            }
            if (i < n - 1) {
                if (A[i + 1] != A[i])
                    count = count + 1;
                else
                    count = count - 1;
            }
            r = Math.max(r, count);
        }
        return result + r;
    }
}
