package pl.mbartosik.codekata;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    private final static Logger log = LoggerFactory.getLogger(FizzBuzzTest.class);

    @Test
    void solveFizz() {
        IntStream.rangeClosed(1,10).filter(x -> x%3==0).forEach(
                i -> {
                    log.info("{}",i);
                    assertEquals(FizzBuzz.FizzBuzzEnum.FIZZ,FizzBuzz.solve(i));
                }

        );
    }

    @Test
    void solveBuzz() {
        IntStream.rangeClosed(1,10).filter(x -> x%5==0).forEach(
                i -> {
                    log.info("{}",i);
                    assertEquals(FizzBuzz.FizzBuzzEnum.BUZZ,FizzBuzz.solve(i));
                }

        );
    }

    @Test
    void solveFizzBuzz() {
        IntStream.rangeClosed(1,100).filter(x -> x%15==0).forEach(
                i -> {
                    log.info("{}",i);
                    assertEquals(FizzBuzz.FizzBuzzEnum.FIZZBUZZ,FizzBuzz.solve(i));
                }

        );
    }
}