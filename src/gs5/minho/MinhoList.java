package gs5.minho;

import java.lang.reflect.Array;
import java.util.*;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2017. 7. 22..
 */
public class MinhoList<E> implements List<E>{
    E[] array;
    private static int MAXLENGTH = 10000;
    private static int CURRENTLENGTH = 0;
    public MinhoList() {
        array = (E[])(new Object[MAXLENGTH]);
    }
    @Override
    public int size() {
        return CURRENTLENGTH;
    }

    @Override
    public boolean isEmpty() {
        return CURRENTLENGTH == 0;
    }

    @Override
    public boolean contains(Object o) {
        E object = (E)o;
        for (int i = 0 ; i < CURRENTLENGTH ; ++i) {
            if (array[i] == object) return true;
        }
        return false;
    }


    @Override
    public Object[] toArray() {
        return (Object[])array;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        if (CURRENTLENGTH >= MAXLENGTH) return false;
        array[CURRENTLENGTH++] = e;
        return true;
    }
    /**
     * Removes the first occurrence of the specified element from this list,
     * if it is present (optional operation).  If this list does not contain
     * the element, it is unchanged.  More formally, removes the element with
     * the lowest index <tt>i</tt> such that
     * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>
     * (if such an element exists).  Returns <tt>true</tt> if this list
     * contained the specified element (or equivalently, if this list changed
     * as a result of the call).
     **/

    @Override
    public boolean remove(Object o) {
        E object = (E)o;
        for(int i = 0 ; i < CURRENTLENGTH ; ++i) {
            if (array[i] == object) {
                CURRENTLENGTH--;
                return true;
            }
        }
        return false;
    }
    /**
     * Appends all of the elements in the specified collection to the end of
     * this list, in the order that they are returned by the specified
     * collection's iterator (optional operation).  The behavior of this
     * operation is undefined if the specified collection is modified while
     * the operation is in progress.  (Note that this will occur if the
     * specified collection is this list, and it's nonempty.)
     *
     * @param c collection containing elements to be added to this list
     * @return <tt>true</tt> if this list changed as a result of the call
     * @throws UnsupportedOperationException if the <tt>addAll</tt> operation
     *         is not supported by this list
     * @throws ClassCastException if the class of an element of the specified
     *         collection prevents it from being added to this list
     * @throws NullPointerException if the specified collection contains one
     *         or more null elements and this list does not permit null
     *         elements, or if the specified collection is null
     * @throws IllegalArgumentException if some property of an element of the
     *         specified collection prevents it from being added to this list
     * @see #add(Object)
     */
    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
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
        CURRENTLENGTH = 0;
    }

    @Override
    public E get(int index) {
        if (CURRENTLENGTH < 0 || CURRENTLENGTH >= index) throw new ArrayIndexOutOfBoundsException();
        return array[index];
    }

    @Override
    public E set(int index, E element) {
        if (CURRENTLENGTH < 0 || CURRENTLENGTH >= index) throw new ArrayIndexOutOfBoundsException();
        return (array[index] = element);
    }

    /**
     * Inserts the specified element at the specified position in this list
     * (optional operation).  Shifts the element currently at that position
     * (if any) and any subsequent elements to the right (adds one to their
     * indices).
     *
     * @param index index at which the specified element is to be inserted
     * @param element element to be inserted
     * @throws UnsupportedOperationException if the <tt>add</tt> operation
     *         is not supported by this list
     * @throws ClassCastException if the class of the specified element
     *         prevents it from being added to this list
     * @throws NullPointerException if the specified element is null and
     *         this list does not permit null elements
     * @throws IllegalArgumentException if some property of the specified
     *         element prevents it from being added to this list
     * @throws IndexOutOfBoundsException if the index is out of range
     *         (<tt>index &lt; 0 || index &gt; size()</tt>)
     */
    @Override
    public void add(int index, E element) {
        if (index < 0 || CURRENTLENGTH > index)
            throw new IndexOutOfBoundsException();
        for (int i = index ; i < CURRENTLENGTH + 1 ; ++i)
            array[i + 1] = array[i];
        CURRENTLENGTH++;
        array[index] = element;
    }
    /**
     * Removes the element at the specified position in this list (optional
     * operation).  Shifts any subsequent elements to the left (subtracts one
     * from their indices).  Returns the element that was removed from the
     * list.
     *
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     * @throws UnsupportedOperationException if the <tt>remove</tt> operation
     *         is not supported by this list
     * @throws IndexOutOfBoundsException if the index is out of range
     *         (<tt>index &lt; 0 || index &gt;= size()</tt>)
     */
    @Override
    public E remove(int index) {
        // 인덱싱 예외처리
        if (CURRENTLENGTH < 0 || CURRENTLENGTH >= index) throw new ArrayIndexOutOfBoundsException();
        E elementRemoved = array[index];
        for (int i = index ; i < CURRENTLENGTH - 1 ; ++i) {
            array[i] = array[i+1];
        }
        CURRENTLENGTH--;
        return elementRemoved;
    }

    @Override
    public int indexOf(Object o) {
        E object = (E)o;
        for (int i = 0 ; i < CURRENTLENGTH ; ++i) {
            if (array[i] == object) return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        E object = (E)o;
        for (int i = CURRENTLENGTH - 1 ; i >= 0  ; --i) {
            if (array[i] == object) return i;
        }
        return -1;
    }
    /**
     * Returns a view of the portion of this list between the specified
     * <tt>fromIndex</tt>, inclusive, and <tt>toIndex</tt>, exclusive.  (If
     * <tt>fromIndex</tt> and <tt>toIndex</tt> are equal, the returned list is
     * empty.)  The returned list is backed by this list, so non-structural
     * changes in the returned list are reflected in this list, and vice-versa.
     * The returned list supports all of the optional list operations supported
     * by this list.<p>
     *
     * This method eliminates the need for explicit range operations (of
     * the sort that commonly exist for arrays).  Any operation that expects
     * a list can be used as a range operation by passing a subList view
     * instead of a whole list.  For example, the following idiom
     * removes a range of elements from a list:
     * <pre>{@code
     *      list.subList(from, to).clear();
     * }</pre>
     * Similar idioms may be constructed for <tt>indexOf</tt> and
     * <tt>lastIndexOf</tt>, and all of the algorithms in the
     * <tt>Collections</tt> class can be applied to a subList.<p>
     *
     * The semantics of the list returned by this method become undefined if
     * the backing list (i.e., this list) is <i>structurally modified</i> in
     * any way other than via the returned list.  (Structural modifications are
     * those that change the size of this list, or otherwise perturb it in such
     * a fashion that iterations in progress may yield incorrect results.)
     *
     * @param fromIndex low endpoint (inclusive) of the subList
     * @param toIndex high endpoint (exclusive) of the subList
     * @return a view of the specified range within this list
     * @throws IndexOutOfBoundsException for an illegal endpoint index value
     *         (<tt>fromIndex &lt; 0 || toIndex &gt; size ||
     *         fromIndex &gt; toIndex</tt>)
     */
    @Override
    public List<E> subList(int fromIndex, int toIndex) {

        MinhoList<E> subMinhoList = new MinhoList<E>();
        int rangeOfSubList = toIndex - fromIndex;
        for(int i = 0 ; i < rangeOfSubList ; ++i) {
            subMinhoList.add(i, array[fromIndex++]);
        }
        return subMinhoList;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }
}
