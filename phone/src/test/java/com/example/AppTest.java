package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }
    @Test
    void validPhone(){
        String vP = "123-456-7890";
        assertEquals(true, App.isPhone(vP));
    }
    @Test
    void validName(){

    }
    @Test
    void validAge(){
        
    }
}
