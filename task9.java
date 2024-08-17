//Проверить, имеет ли число вещественную часть. Например, числа 3.14 и 2.5 – имеют вещественную часть, а числа 5.0
//и 10.0 – нет.


import java.util.Scanner;

public class task9 {
    public static void main(String[] args){
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);//считываем что пользователь ввел на клавиатуре
        float a = scanner.nextFloat();

        if(a%1==0){
            System.out.println("Число не имеет вещественной части");
        }else{
            System.out.println("Число имеет вещественную часть");
        }
    }
}
