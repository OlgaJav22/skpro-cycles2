public class Main {
    public static void main(String[] args) {

        // задача 1.1

        int deposit = 15000;
        int total = 0;
        int i = 1;
        while (total < 2_459_000) {
            i++;
            total = total + total / 100;
            total = total + deposit;

        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + total);


        // задача 1.2

        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(" " + number + " ");
        }
        System.out.println("\n");
        for (int number1 = 10; number1 >0; number1--) {
            System.out.print(" " + number1 + " ");
        }
        System.out.println("\n");
        //задача 1.3

        double populationSize = 12_000_000;
        double birthRate = 1.7; //процент рождаемости в год
        double mortalityRate = 0.8; //процент смертности в год
        double totalPopulation =0;
        for (int x = 0; x<=10; x++) {
            totalPopulation = (totalPopulation*birthRate)-(totalPopulation*mortalityRate);
            totalPopulation = totalPopulation + populationSize;
            System.out.print("Год " + x + " ");
            System.out.println("численность населения составляет " + (int)totalPopulation);
        }
        System.out.println("\n Численность населения через 10 лет составит: " + (int)totalPopulation + "\n");

        //ЗАДАЧА 2.1

        int depositNew = 15000;
        int totalNew = 0;
        int s;
        for ( s = 0; totalNew<=12_000_000; s++) {
            totalNew = totalNew + totalNew*7/100;
            totalNew= totalNew+depositNew;
            System.out.println("Месяц " + s + " сумма накоплений: " + totalNew);
        }
        System.out.println("Василию понадобится " + s + " месяцев, чтобы сумма его накоплений составила " + totalNew);

        //задача 2.2

        System.out.println();
        int depositVasya = 15000;
        int totalVasya = 0;
        int z=0;

        while (totalVasya<=12_000_000) {
            z++;
            totalVasya = totalVasya + totalVasya*7/100;
            totalVasya= totalVasya+depositVasya;
            if (z%6==0) {
                    System.out.println("Месяц " + z + " сумма накоплений: " + totalVasya);
                }
            }

        //задача 2.3
        System.out.println();

        int depositVasilii = 15000;
        int totalVasilii = 0;

        for (int h=0; h<=108; h++) {

            totalVasilii = totalVasilii + totalVasilii*7/100;
            totalVasilii= totalVasilii+depositVasya;
            if (h%6==0) {
                System.out.println("Месяц " + h + " сумма накоплений: " + totalVasilii);
            }
        }

        //задача 2.4
        System.out.println();

        int friday;
        for (friday=3; friday<=31; friday+=7) {
            System.out.println("Сегодня пятница " + friday + " число. Необходимо подготовить отчет.");
        }

        // задача 3.1
        System.out.println();

        int yearStartComet = 1822;
        int yearCometNew = 2122;

        for (int comet=0; comet <=yearCometNew; comet+=79) {
            if (comet>yearStartComet && comet<yearCometNew && comet%79==0) {
                System.out.println(comet);
            }
        }

        //задача 3.2

        System.out.println();

        int number2 = 2;
        int totalNumber2;
        for (int c =1; c<=10; c++) {
            totalNumber2=number2*c;
            System.out.print(number2 + "*" + c + " = ");
            System.out.println(totalNumber2);
        }
    }
}
