package Calculator;
import org.assertj.core.util.VisibleForTesting;

import static org.assertj.core.api.Assertions.*;

public class TestCalculator {
    public static void main(String[] args) {

     
        //отрицательная начальная цена
        assertThatThrownBy(()->Calculator.calculateDiscount(-1, 10)).isInstanceOf(RuntimeException.class);
        //нулевая начальная цена
        assertThatThrownBy(()->Calculator.calculateDiscount(0, 10)).isInstanceOf(RuntimeException.class);
        //отрицательная скидка
        assertThatThrownBy(()->Calculator.calculateDiscount(100, -10)).isInstanceOf(RuntimeException.class);
        //скидка больше 100%
        assertThatThrownBy(()->Calculator.calculateDiscount(100, 101)).isInstanceOf(RuntimeException.class);
    }
}