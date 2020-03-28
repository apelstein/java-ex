import java.util.*;

public class Solution {

    public static class ListNode{
        public int val;
        public ListNode next;
        public ListNode(int val){
            this.val = val; this.next = null;
        }

        @Override
        public String toString(){
            if (next == null){
                return String.format("[%d] -> [X]", val);
            } else {
                return String.format(("[%d] -> "), val) + next.toString();
            }

        }


    }

    public ListNode insertionSortList(ListNode A) {
        ListNode parent = A;
        while(parent != null && parent.next != null ){
            ListNode child = parent.next;
            ListNode ptr = A;
            //check if need to replace head.
            if(ptr.val >= child.val){
                //replace head
                parent.next = child.next;
                child.next = ptr;
                A = child;

            } else {
                while(ptr.next != child){
                    if(child.val < ptr.next.val){
                        //inseert
                        parent.next = child.next;
                        child.next = ptr.next;
                        ptr.next = child;
                        break;
                    }
                    ptr =ptr.next;
                }
            }
            parent = parent.next;

        }
        return A;
    }

    public ListNode sortList(ListNode A) {
        if (A==null || A.next == null){
            return A;
        }
        return helper(A, 5);
    }

    public ListNode helper(ListNode A, int len){
        if(len == 1){
            return A;
        } else {
            int i = 0;
            int j = 0;
            ListNode l1 = A;
            ListNode base1 = l1;
            ListNode l2 = A.next;
            ListNode base2 = l2;
            while(l1 != null && l2 != null){
                if(i == j){
                    l1.next = l2.next;
                    l1 = l1.next;
                    i++;
                } else {
                    l2.next = l1.next;
                    l2 = l2.next;
                    j++;
                }
            }
            if (l1 == null) {
                j++;
            } else {
                i++;
            }
            return merge(helper(base1, i), helper(base2, j));
        }
    }

    public ListNode merge(ListNode a, ListNode b){
        ListNode merged = null;
        if(a != null && b != null){
            if(a.val < b.val){
                merged = a;
                a = a.next;
            } else {
                merged = b;
                b = b.next;
            }
        }
        ListNode result = merged;
        while(a != null && b != null){
            if(a.val < b.val){
                merged.next = a;
                a = a.next;
            } else {
                merged.next = b;
                b = b.next;
            }
            merged = merged.next;
        }
        if(a != null && b == null){
            merged.next = a;
        } else if(a == null && b != null){
            merged.next = b;
        }
        return result;
    }



    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        Collections.sort(A);
        Set<ArrayList<Integer>> set = new HashSet<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i = 0; i< A.size(); i++){
            int first = i;
            int middle = i+1;
            int last = A.size()-1;
            while(middle<last){
                if(A.get(middle) + A.get(last) == -A.get(first)) {
                    ArrayList<Integer> arrToAdd = new ArrayList<>(
                        Arrays.asList(A.get(first), A.get(middle), A.get(last)));
                    Collections.sort(arrToAdd);
                    set.add(arrToAdd);
                    last--;
                    middle++;
                } else if(A.get(middle) + A.get(last) > -first) {
                    last--;
                } else {
                    middle++;
                }
            }
        }
        for(ArrayList<Integer> arr: set){
            res.add(arr);
        }
        return res;

    }


}
