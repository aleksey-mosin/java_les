public class MyProgram3 {

    public static void main(String[] args) {
        hello("Aleksey Mosin");
        hello("World");
        hello("Karina Soikina");
        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());
        Rectangle r = new Rectangle(6, 7);
        System.out.println("Площадь прямоугольника со стронами " + r.a + " и " + r.b + " = " + r.area());
    }
    public static void hello(String somebody){
        System.out.println("Hi, " + somebody + "!");
    }

}
