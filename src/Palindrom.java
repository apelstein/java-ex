public class Palindrom {

    public boolean isPalindrom(String str){
        return isPalHelper(str.toCharArray(), 0 , str.length()-1);
    }

    private boolean isPalHelper(char[] str, int first, int last){
        if(first >= last){
            return true;
        }
        if (str[first] != str[last]){
            int k = first + 1;
            for(; k < last; k++){
                if(str[k] == str[first]){
                    str[k] = str[last];
                    str[last] = str[first];
                    break;
                } else if (str[k] == str[last]){
                    str[k] = str[first];
                    str[first] = str[last];
                    break;
                }
            }
            if(k == last){
                return false;
            }
        }
        return isPalHelper(str, first+1, last-1);
    }
}
