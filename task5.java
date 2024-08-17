//Подсчитать площадь и длину окружности для круга с радиусом R. Радиус должен быть задан константой в программе. Вывести результат на консоль.



public class task5 {
public static void main(String[] args){
    int radius = 3;
    double area = Math.PI*(radius*radius);
    System.out.println("Площадь круга равна"+area);

    double circumLengh = Math.PI*2*radius;
    System.out.println("Длина окружности круга равна"+circumLengh);
}
}
