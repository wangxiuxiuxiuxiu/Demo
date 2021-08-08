package day01;

public class Demo3 {

    public static void main(String[] args) {


        for (int i=0;i<10000;i++){
            test();

        }
    }
    static void pong(){
        System.out.println("2");
    }


    public static void test(){
        Thread t=new Thread(){
            public void run(){
                pong();
            }
        };
        t.run();
        System.out.println("1");

    }
}

