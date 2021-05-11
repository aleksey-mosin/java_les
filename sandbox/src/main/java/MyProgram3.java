public class MyProgram3 {

    public static void main(String[] args) {
        hello("Aleksey Mosin");
        hello("World");
        hello("Karina Soikina");
        Square s = new Square(6);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));
        Rectangle r = new Rectangle(6, 8);
        System.out.println("Площадь прямоугольника со стронами " + r.a + " и " + r.b + " = " + area(r));
    }
    public static void hello(String somebody){
        System.out.println("Hi, " + somebody + "!");
    }
    public static double area(Square s){
        return s.l * s.l;
    }
    public static double area(Rectangle r){
        return r.a * r.b ;
    }
}
