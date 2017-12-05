/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mylinkedlist;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nishantc
 */
public class MyLinkedListTest {

    public MyLinkedListTest() {

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of append method, of class MyLinkedList.
     */
//    @Test
    public void testAppend() {
        MyLinkedList instance = new MyLinkedList();
        System.out.println("append");
        int value = 1;
        instance.append(value);
        assertEquals(instance.getLength(), 1);
        value = 5;
        instance.append(value);
        assertEquals(instance.getLength(), 2);
        value = 3;
        instance.append(value);
        assertEquals(instance.getLength(), 3);
        value = 4;
        instance.append(value);
        assertEquals(instance.getLength(), 4);
        instance.displayAll();
    }

    /**
     * Test of removeTail method, of class MyLinkedList.
     */
//    @Test
    public void testRemoveTail() {
        System.out.println("removeTail");
        MyLinkedList instance = new MyLinkedList();
        System.out.println("append");
        instance.append(1);
        instance.append(5);
        instance.append(3);
        instance.append(4);
        instance.displayAll();
        instance.removeTail();
        assertEquals(instance.getLength(), 3);
        instance.displayAll();
    }

    /**
     * Test of removeGreaterElement method, of class MyLinkedList.
     */
    @Test
    public void testRemoveGreaterElement() {
        System.out.println("removeGreaterElement");
        MyLinkedList instance = new MyLinkedList();
        instance.append(1);
        instance.append(5);
        instance.append(3);
        instance.append(4);
         instance.append(2);
        instance.displayAll();
        instance.removeGreaterElement(3);
        assertEquals(instance.getLength(), 3);
        instance.displayAll();
    }

}
