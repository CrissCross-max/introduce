//Написать программу расчета идеального веса к росту. В
//константах хранятся рост (height) и вес (weight). Вывести на
//консоль сообщение, сколько килограмм нужно набрать или
//сбросить (идеальный вес = рост - 110).

public class task10 {
    public static void main(String[] args) {
        int height = 185;
        int weight = 40;

        int idealWeight = height - 110;

        int howMuchGainOrLoss = idealWeight - weight;

        if (howMuchGainOrLoss < weight && howMuchGainOrLoss>0) {
            System.out.println("Вам нужно набрать" + howMuchGainOrLoss + "кг");
        } else if(weight==idealWeight) {
            System.out.println("Ваш вес идеальный");
        }else{
            System.out.println("Вам нужно сбосить" + howMuchGainOrLoss + "кг");
        }


    }
}

