package day01;

public class Demo2 {

    public static void main(String[] args) {
        Ball ball = new Ball("BASKKEBAL");
        System.out.println(ball);
    }
}
 abstract class Toy {

     private String name;

     public Toy(String name) {
         this.name = name;
     }
 }

 class Ball extends Toy {
     public Ball(String name) {
         super(name);
     } // 球

}

 class Car extends Toy { // 玩具汽车

    public Car(String name) {
        super(name);
    }
}