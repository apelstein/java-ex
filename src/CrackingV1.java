public class CrackingV1 extends Cracking {
    @Override
    public boolean isAllUnique(String s){
        for(char c = 32; c < 127; c++){
            boolean seen = false;
            for(char c2 : s.toCharArray()){
                if(c2 == c){
                    if(seen) return false;
                    else{
                        seen = true;
                    }
                }
            }
        }
        return true;
    }


}
