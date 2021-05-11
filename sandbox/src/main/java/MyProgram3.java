public class MyProgram3 {

    public static void main(String[] args) {
        hello("Aleksey Mosin");
        hello("World");
        hello("Karina Soikina");
        double l = 6.6;
        System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

        double a = 4;
        double b = 6;
        System.out.println("Площадь прямоугольника со стронами " + a + " и " + b + " = " + area(a, b));
    }
    public static void hello(String somebody){
        System.out.println("Hi, " + somebody + "!");
    }
    public static double area(double h){
        return h * h;
    }
    public static double area(double a, double b){
        return a * b;
    }
}
