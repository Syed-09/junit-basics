package org.Example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.IncludeTags;

public class SquareTest {
    @Test
    @Tag("Unit")
    public void newTest1(){
        System.out.println("New Test 1");
    }

    @Test
    public void newTest2(){
        System.out.println("New Test 2");
    }
    @Test
    public void newTest3(){
        System.out.println("New Test 3");
    }
    @Test
    public void newTest4(){
        System.out.println("New Test 4");
    }
}
