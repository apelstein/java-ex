import java.util.ArrayList;

public class MoveOnePosClockWise {

    public class Solution {
        public void rotate(ArrayList<ArrayList<Integer>> A) {
            int n = A.size();
            if(n==1){
                return;
            }
            for(int row = 0; row<n/2; row++){
                int start = row;
                int end = n-1-row;
                int temp1, temp = A.get(row).get(start);
                while(start<end){
                    temp1 = A.get(row).get(start+1);
                    A.get(row).set(start+1, temp);
                    temp = temp1;
                    start++;
                }
                start = row;
                while(start<end){
                    temp1 = A.get(start+1).get(end);
                    A.get(start+1).set(end, temp);
                    temp = temp1;
                    start++;
                }
                start = row;
                while(start<end){
                    temp1 = A.get(n-1-row).get(end-1);
                    A.get(n-1-row).set(end-1, temp);
                    temp = temp1;
                    end--;
                }
                end = n-row-1;
                while(start<end){
                    temp1 = A.get(end-1).get(row);
                    A.get(end-1).set(row, temp);
                    temp = temp1;
                    end--;
                }

            }

        }
    }

}
