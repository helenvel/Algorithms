public class IsPositiveNumber {

    /**
     * Напишите алгоритм IsPositiveNumber, который возвращает true,
     * если численный  параметр больше или равен нулю, и возвращает false, если параметр меньше 0.
     * Проверьте работу метода на числах 555, 0 и -555.
     */

    public boolean IsPositiveNumberAlgorithm(int number) {

        boolean x = false;

        if (number < 0) {
            x = false;
        } else {
            x = true;
        }
        return x;
    }
}
