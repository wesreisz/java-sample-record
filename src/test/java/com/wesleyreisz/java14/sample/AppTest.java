package com.wesleyreisz.java14.sample;

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
        Person p1 = new Person("Wes", "123 Address St");
        assertEquals(p1.address(), "123 Address St");
        assertEquals(p1.name(), "Wes");
    }

    public void testApp1()
    {
        assertEquals(
            new Person("Wes", "123 Address St"),
            new Person("Wes", "123 Address St")
        );
    }
    public void testApp2()
    {
        assertNotSame(
                new Person("Wes", "123 Address St"),
                new Person("Wesley", "123 Address St")
        );
    }
}
