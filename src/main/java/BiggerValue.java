public class BiggerValue {

    /**
     *Напишите алгоритм BiggerValue, который из двух параметров типа int возвращает бОльшее значение.
     * Test Data:
     * 3333, 9999
     * Expected Result = 9999
     */

    public int biggerValueAlgorithm (int number1, int number2) {
        int max = 0;
        if (number1 == number2){

            return number1-number2;
        }

        if (number1 < number2) {
            max = number2;
        } else  {
            max = number1;
        }

        return max;
    }
}
