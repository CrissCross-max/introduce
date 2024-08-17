//Есть прямоугольник, у которого известна ширина w и
//высота h. Найти и вывести на консоль периметр и площадь
//заданного прямоугольника. Высота и ширина прямоугольника должна задаваться константными переменными в коде
//программы.

public class task6 {
    public static void main(String[] args){
        int height =100;
        int width = 150;

        int perimetr = (height+width)*2;
        int areaOfRectangle = width*height;
        System.out.println("Периметр прямоугольника равна"+perimetr);
        System.out.println("Площадь прямоугольника равна"+ areaOfRectangle);

    }


}
