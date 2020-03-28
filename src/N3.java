import java.util.*;

public class N3 {

    public static int repeatedNumber(final List<Integer> a) {
        Map<Integer,Integer> mapa = new HashMap<>();
        for(int num: a){
            if(mapa.size() == 0){
                mapa.put(num,1);
            } else if(mapa.containsKey(num)){
                mapa.put(num, mapa.get(num) + 1);
            } else {
                if(mapa.size() == 1){
                    mapa.put(num,1);
                } else {
                    List<Integer> toDel = new ArrayList<>();
                    for(int key : mapa.keySet()){
                        int val = mapa.get(key);
                        if(val == 1){
                            toDel.add(key);
                        } else {
                            mapa.put(key, val-1);
                        }

                    }
                    toDel.forEach(key -> mapa.remove(key));
                }
            }

        }
        if(mapa.size() > 0){
            mapa.keySet().forEach(key -> mapa.put(key,0));
            for(int elem : a){
                if(mapa.containsKey(elem)){
                    mapa.put(elem, mapa.get(elem)+1);
                }
            }
            for(int key: mapa.keySet()){
                if(mapa.get(key) * 3 > a.size()){
                    return key;
                }
            }
        }
        return -1;
    }
}
