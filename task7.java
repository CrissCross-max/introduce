//Разработать программу, которая позволит при известном
//годовом проценте вычислить сумму вклада в банке через
//два года, если задана исходная величина вклада.

public class task7 {
    public static void main(String[]args) {

        int amount = 10000;
        double percent = 0.09;
        double finalAmount = amount  + amount * percent*2;

        System.out.println(finalAmount);



    }

    }