package pl.mbartosik.codekata;

public final class FizzBuzz {
    public enum FizzBuzzEnum {
        FIZZ,
        BUZZ,
        FIZZBUZZ
    }

    //Util class
    private FizzBuzz() {
        throw new IllegalArgumentException();
    }

    public static FizzBuzzEnum solve(int number) {
        if (number % 3 == 0) {
            return FizzBuzzEnum.FIZZ;
        } else if (number % 5 == 0) {
            return FizzBuzzEnum.BUZZ;
        } else if (number%15 == 0 ){
            return FizzBuzzEnum.FIZZBUZZ;
        }
        return null;

    }

}
