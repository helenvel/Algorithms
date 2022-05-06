public class MAlgoritnm {

    /**
     * Учитывая целое число M, выполните следующие условные действия:
     * Если M кратно 3 и 5, то верните "Хорошее число".
     * Если M кратно только 3, а не 5, то верните "Неверное число".
     * Если M кратно только 5, а не 3, то верните "Плохое число".
     * Если M не удовлетворяет ни одному из вышеуказанных условий, то верните "-1"
     */

    public String MAlgoritnm (int number) {

        String goodNumber = "Good Number";
        String badNumber = "Bad Number";
        String poorNumber = "Poor Number";
        String doesNotStatisfy = "-1";

        if (number % 3 ==0 && number % 5 == 0) {

            return goodNumber;
        }
        if (number % 3 ==0 && number % 5 != 0){

            return badNumber;
        }
        if (number % 3 != 0 && number % 5 == 0){

            return poorNumber;
        }

        return doesNotStatisfy;
    }
}
