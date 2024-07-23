import java.lang.reflect.Array;
import java.util.List;

public class ArrayDeque61B<T> implements Deque61B<T>{

    private static final int DEFAULTFIRST = 4;
    private static final int DEFAULTLAST = 5;
    private static final int DEFAULTARRAYSIZE = 8;
    private static final int RESIZEFACTOR = 2;
    public int size;
    public T[] items;
    public int nextFirst;
    public int nextLast;

    public ArrayDeque61B(){
        items = (T[]) new Object[DEFAULTARRAYSIZE];
        size = 0;
        nextFirst = DEFAULTFIRST;
        nextLast = DEFAULTLAST;
    }

    @Override
    public void addFirst(T x) {
        if (size < items.length){
            items[nextFirst] = x;
            size += 1;
            if (nextFirst == 0){
                nextFirst = items.length - 1;
            }else {
                nextFirst -= 1;
            }
        }else{
            resize();
            addFirst(x);
        }
    }

    @Override
    public void addLast(T x) {
        if (size < items.length){
            items[nextLast] = x;
            size += 1;
            if (nextLast == items.length - 1){
                nextLast = 0;
            }else{
                nextLast += 1;
            }
        }else{
            resize();
            addLast(x);
        }
    }

    private void resize(){
        // creat a new array
        T[] resizedArray = (T[]) new Array[RESIZEFACTOR * items.length];
        for(int i = 0; i < items.length; i++){
            resizedArray[i] = get(i);
        }
        items = resizedArray;
        nextFirst = items.length - 1;
        nextLast = size;

    }

    @Override
    public List<T> toList() {
        return List.of();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index > size()) {
            return null;
        } else {
                int i = Math.floorMod(nextFirst + 1 + index, items.length);
                return items[i];
        }
    }

    @Override
    public T getRecursive(int index) {
        return null;
    }
}
