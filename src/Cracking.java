import java.util.HashMap;
import java.util.Map;

public class Cracking {
    public boolean isAllUnique(String s){
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                return false;
            } else {
                map.put(c, 1);
            }
        }
        return true;
    }
}
