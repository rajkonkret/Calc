import java.util.Optional;

class Calculator {

    Optional<Double> divide(double a, double b) {

        return Optional.ofNullable(a / b);
    }
}
