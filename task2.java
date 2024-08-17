//В переменной n хранится натуральное (целое) трехзначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n



public class task2 {
    public static void main(String[] args) {
        int n = 535;

        int digit1 = n/100;
        int digit2 =(n/100)-2;
        int digit3 = n/100;

        int resutl = digit1+digit2+digit3;
        System.out.println(resutl);

    }
}
