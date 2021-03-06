import List.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by INV-6179 on 03.03.2016.
 */
public class ListTest {
    private List<Integer> list, listSecond;

    @Before
    public void setList() {
        this.list = new List<Integer>();
        this.listSecond = new List<Integer>();
        this.listSecond.addElement(0);
        this.listSecond.addElement(-50);
        this.listSecond.addElement(10000);
        this.listSecond.addElement(85723);

    }

    @After
    public void removeList() {
        this.listSecond = null;
        this.list = null;
    }

    @Test
    public void testGetSizeForTwoElements() throws Exception {
        list.addElement(1);
        list.addElement(2);
        assertEquals("Incorrect size after adding element to List", 2, list.getSize());
    }

    @Test
    public void testGetSizeForTenThousandElements() throws Exception {
        for (int i = 0; i < 10000; i++) {
            list.addElement(i);
        }
        assertEquals("Incorrect list size after adding 10000 elements in loop", 10000, list.getSize());
    }

    @Test
    public void testGetSizeForSameElements() throws Exception {
        Integer value = new Integer(2);
        list.addElement(value);
        list.addElement(value);
        assertEquals("incorrect list size after adding 2 same elements", 2, list.getSize());
    }

    @Test
    public void testGetSizeForEmptyList() throws Exception {
        assertEquals("Incorrect list size for empty list", 0, list.getSize());
    }

    @Test
    public void testGetSizeAfterAddOneElement() throws Exception {
        list.addElement(1);
        assertEquals("incorrect size after adding one element", 1, list.getSize());
    }

    @Test
    public void testGetSizeAfterAddTwoSame() throws Exception {
        list.addElement(1);
        list.addElement(1);
        assertEquals("incorrect size after adding one element", 2, list.getSize());
    }

    @Test
    public void testGetSizeAfterAddManyElementsAndRemoveOneOfThem() throws Exception {
        list.addElement(1);
        list.addElement(5);
        list.addElement(10000);
        list.addElement(-5);
        list.removeElement(2);

        assertEquals("incorrect size after adding many elements and remove one of them", 3, list.getSize());
    }

    @Test
    public void testGetSizeAfterRemoveFirst() throws Exception {
        list.addElement(1);
        list.addElement(5);
        list.addElement(100);
        list.removeFirst();
        assertEquals("incorrect size after remove first element", 2, list.getSize());
    }

    @Test
    public void testGetSizeAfterClearList() throws Exception {
        list.addElement(1);
        list.addElement(5);
        list.addElement(100);
        list.clear();
        assertEquals("incorrect size after clear list", 0, list.getSize());
    }


    @Test
    public void testIsEmptyWhenHasElements() throws Exception {
        assertEquals("incorrect status of list", false, listSecond.isEmpty());
    }

    @Test
    public void testIsEmptyWhenHasNoElements() throws Exception {
        assertEquals("incorrect status of list", true, list.isEmpty());
    }

    @Test
    public void testIsEmptyAfterAddElementsToEmptyList() throws Exception {
        list.addElement(5);
        list.addElement(500);
        list.addElement(-55);
        assertEquals("incorrect status of list", false, list.isEmpty());
    }

    //TODO append if to method below
   /* @Test
    public void testIsEmptyAfterRemoveOnlyElement() throws Exception {
        list.addElement(5);
        list.removeElement(0);
        assertEquals("incorrect status of list", true, list.isEmpty());
    }*/
    @Test
    public void testIsEmptyAfterClearList() throws Exception {
        listSecond.clear();
        assertEquals("incorrect status of list", true, listSecond.isEmpty());
    }

    @Test
    public void testContainsWhileHasElement() throws Exception {

        assertEquals("incorrect status of element", true, listSecond.contains(-50));
    }

    @Test
    public void testContainsWhileHasNotElement() throws Exception {

        assertEquals("incorrect status of element", false, listSecond.contains(154));
    }

    @Test
    public void testContainsAfterAddElement() throws Exception {
        listSecond.addElement(99);
        assertEquals("incorrect status of element", true, listSecond.contains(99));
    }

    @Test
    public void testContainsAfterRemoveElement() throws Exception {
        listSecond.removeElement(0);
        assertEquals("incorrect status of element", false, listSecond.contains(0));
    }

    @Test
    public void testGetWhileElementIsCorrect() throws Exception {
        assertEquals("incorrect element of this index", -50, (int) listSecond.get(1));
    }

    @Test
    public void testGetWhileIndexGreaterThanSize() throws Exception {
        assertEquals("index is greater than size", null, listSecond.get(100));
    }
    @Test
    public void testGetWhileIndexNegative() throws Exception {
        assertEquals("index is negative", null,  listSecond.get(-1));
    }
    @Test
    public void testGetAfterRemoveElementOfThisIndex() throws Exception {
        listSecond.removeElement(2);
        assertEquals("incorrect element of this index after remove", 85723, (int) listSecond.get(2));
    }

    @Test
    public void testSetPositiveChange() throws Exception {
        listSecond.set(0, -123);
        assertEquals("incorrect element of index after set", -123 , (int) listSecond.get(0));
    }




}