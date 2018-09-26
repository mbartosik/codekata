package pl.mbartosik.codekata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class FirstTestClassTest {

    @Test
    void dummyMethod() {
        var str="String";

        final FirstTestClass firstTestClass=new FirstTestClass();
        assertNotNull(firstTestClass);
        assertEquals("String",str);
    }
}