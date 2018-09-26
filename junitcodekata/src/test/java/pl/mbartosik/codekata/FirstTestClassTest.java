package pl.mbartosik.codekata;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class FirstTestClassTest {

    private final static Logger log = LoggerFactory.getLogger(FirstTestClassTest.class);

    @Test
    @DisplayName("second")
    void secondTest(){
        assertNotNull("dummy");
    }

    @Test
    @DisplayName("simple test")
    void dummyMethod() {
        var str="String";
        log.info(str);
        final FirstTestClass firstTestClass=new FirstTestClass();
        log.info("{}",firstTestClass);

        assertNotNull(firstTestClass);
        assertEquals("String",str);
    }
}