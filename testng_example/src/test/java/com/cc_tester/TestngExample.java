package com.cc_tester;

import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class TestngExample {

    @Test
    public void testcase01(){
        assertEquals(2+2, 4);
        System.out.println("Test01");
    }
}
