package gs5.nekisse;

import java.util.*;

/**
 * Created by Nekisse_lee on 2017. 7. 17..
 */
public class NekisseList implements List<String> {

    private String[] array = {};

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        for (String str: array){
            if(str.equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<String> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(String s) {
        String[] tmpList = Arrays.copyOf(this.array, this.array.length + 1);
        tmpList[tmpList.length - 1] = s;
        this.array = tmpList;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if(!this.contains(o)){
            return false;
        }
        String[] tmp = new String[this.array.length - 1];
        int tmpIndex = 0;
        for(int i=0; i<array.length ; i++){
          if(this.array[i].equals(o)){
              continue;
          }
          tmp[tmpIndex] = this.array[i];
          tmpIndex++;
        }
        this.array = tmp;
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {

        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
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
    public String get(int index) {
        return this.array[index];
    }

    @Override
    public String set(int index, String element) {
        return null;
    }

    @Override
    public void add(int index, String element) {
        String[] tmpList = Arrays.copyOf(this.array, this.array.length + 1);

    }

    @Override
    public String remove(int index) {
        if(this.array.length<= index){
            return null;
        }
        String o = this.array[index];
        String[] tmp = new String[this.array.length - 1];
        int tmpIndex = 0;
        for(int i=0; i<array.length ; i++){
            if(this.array[i].equals(o)){
                continue;
            }
            tmp[tmpIndex] = this.array[i];
            tmpIndex++;
        }
        this.array = tmp;
        return o;
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
    public ListIterator<String> listIterator() {
        return null;
    }

    @Override
    public ListIterator<String> listIterator(int index) {
        return null;
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        return null;
    }
}
