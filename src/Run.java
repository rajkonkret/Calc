import java.util.Optional;

public class Run {
//    Zadanie (Dzielenie przez zero)
//    Stwórzy klasę Calculator obsługującą jedynie
//    dzielenie i obsłuż sytuację gdy
//    dzielnikiem jest liczba 0.
//    Przetestuj działanie kalkulatora
//    w metodzie main.

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        Optional<Double> divide = calc.divide(1, 5);

        if (divide.get().isInfinite()) {
            System.out.println("dzielenie przez zero");
        } else {
            System.out.println(divide.get());
        }

    }
}
