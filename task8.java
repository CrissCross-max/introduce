//Зная скорость распространения звука в воздушной среде, можно вычислить расстояние до места удара молнии по
//3
//времени между вспышкой и раскатом грома. Зная время в
//секундах между вспышкой и раскатом грома (константа в
//программе), вычислите расстояния до места удара молнии и
//выведите его на экран.



public class task8 {
    public static void main(String[] args){
        int speed = 460;
        int sec = 10;
        int distance = speed*sec;
        System.out.println(distance);

    }
}
