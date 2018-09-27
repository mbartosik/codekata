package pl.mbartosik.codekata;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StuffConvnerterTest {

    private final static Logger log = LoggerFactory.getLogger(StuffConvnerterTest.class);



    @ParameterizedTest(name = "{index} => {0}")
    @ValueSource(strings = {"1", "2"})
    public void toIntConverter(String value) {
        log.info("toIntConverter");
        final StuffConvnerter<String, Integer> convnerter = (from -> Integer.valueOf(from));
        int result = convnerter.convert(value);
        assertNotNull(result);
    }
}
