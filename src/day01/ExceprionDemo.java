package day01;

public class ExceprionDemo {

    public static void main(String[] args) {


        System.out.println(getCode(0));
        System.out.println(getCode(1));
        System.out.println(getCode(2));
        System.out.println(getCode(4));
    }

    public static int getCode(int num){

        try {
            int result = 2/num;

            return result;
        }catch (Exception e){
            return 6;
        }finally {
            if(num==0){
                return -1;
            }
            if (num==1){
                return 1;
            }
        }

    }
}
