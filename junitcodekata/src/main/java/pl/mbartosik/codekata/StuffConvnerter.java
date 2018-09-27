package pl.mbartosik.codekata;

@FunctionalInterface
public interface StuffConvnerter<F,T> {
    T convert(F from);
}
