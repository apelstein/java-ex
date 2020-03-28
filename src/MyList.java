import java.util.*;

public class MyList implements List<Character> {

    private char[] chars;
    private int capcity;
    private int currentSize;


    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public boolean contains(Object o) {
        for(char c : this.chars){
            if (c == (char) o){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Character> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Character character) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Character> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Character> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Character get(int index) {
        return null;
    }

    @Override
    public Character set(int index, Character element) {
        return null;
    }

    @Override
    public void add(int index, Character element) {

    }

    @Override
    public Character remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Character> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Character> listIterator(int index) {
        return null;
    }

    @Override
    public List<Character> subList(int fromIndex, int toIndex) {
        return null;
    }
}