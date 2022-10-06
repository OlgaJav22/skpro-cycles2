public class Main {
    public static void main(String[] args) {

        // задача 1

        int deposit = 15000;
        int total = 0;
        int i = 1;
        while (total< 2_459_000) {
            i++;
            total = total + total/100;
            total = total + deposit;

        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + total);

    }
}