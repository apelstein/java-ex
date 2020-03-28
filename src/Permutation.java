import java.util.List;

public class Permutation {
    public static void printPermutations(List<Integer> list){
        helperPrint(list,0,list.size());
    }

    private static void helperPrint(List<Integer> list, int i, int j){
        if(i == j){
            System.out.println(list);
        } else {
            for(int k=i; k<j; k++){
                int a = list.get(i);
                int b = list.get(k);
                list.set(i,b);
                list.set(k,a);
                helperPrint(list, i+1, j);
                list.set(i,a);
                list.set(k,b);
            }
        }
    }
}
