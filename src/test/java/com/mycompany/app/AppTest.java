package com.mycompany.app;
import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.TestCase;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    public void testFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertTrue(new App().search(array,array1,2, 1));
    }

    public void testNotFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(2, 2, 3, 4));
      assertFalse(new App().search(array,array1,2, 1));
    }

    public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<>();
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 4, 4));
      assertFalse(new App().search(array,array1,2, 1));
    }

     public void testEmptyArray1() {
      ArrayList<Integer> array = new ArrayList<>(1,2,3,4);
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList());
      assertFalse(new App().search(array,array1,2, 1));
    }


}
