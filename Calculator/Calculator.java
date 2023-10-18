package Calculator;
public class Calculator {
    public static int calculation(int firstOperand, int secondOperand, char operator) {
        int result;

        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Division by zero is not possible");
                }
            default:
                throw new IllegalStateException("Unexpected value operator: " + operator);
        }
        return result;
    }

    public static double calculateDiscount(double purchaseAmount, int discountAmount) {
        if (purchaseAmount <= 0)
            throw new RuntimeException("Сумма покупки до применения скидки не может быть меньше или равной нулю.");
        if (discountAmount < 0 || discountAmount > 100)
            throw new RuntimeException("Размер скидки должен быть в диапазоне 0 - 100");
        return purchaseAmount - (purchaseAmount * discountAmount / 100);
    }
}
