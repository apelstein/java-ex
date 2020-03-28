import static java.lang.Math.ceil;

import java.util.Arrays;

public class MyStringBuilder {
    private int capacity;
    private int currentLength;
    private char chars[];

    public MyStringBuilder(){
        this.capacity = 16;
        this.chars = new char[this.capacity];
        currentLength = 0;
    }

    private int getMult(int newLength){
        return (int) ceil((double) newLength/capacity);
    }

    public void append(String s){
        if(s.length() + currentLength >= capacity){
            int mult = getMult(s.length() + this.currentLength);
            enlarge(mult);
        }
        int i = currentLength;
        for(char chr: s.toCharArray()){
            this.chars[i++] = chr;
        }
        this.currentLength +=s.length();
    }

    private void enlarge(int mult) {
        capacity *= mult;
        char newChars[] = new char[capacity];
        int i = 0;
        for (char c : this.chars){
            newChars[i++] = c;
        }
        this.chars = newChars;
    }

    public void setLength(int newLength){
        if(newLength >= capacity){
            enlarge(getMult(newLength));
        }
        this.currentLength = newLength;
    }

    @Override
    public String toString(){
        System.out.println("current length: " + this.currentLength + " capcity: " + this.capacity);
        return new String(this.chars, 0 , this.currentLength);

    }
}
