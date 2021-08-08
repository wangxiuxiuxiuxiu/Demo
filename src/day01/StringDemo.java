package day01;

public class StringDemo {

    public static void main(String[] args) {

   /*     String s1 = new String("ab");//会在字符串常量池中生成"ab"
        s1.intern();
        String s2 = "ab";
        System.out.println(s1 == s2);//jdk8:false*/

        String s = new String("a") + new String("b");//new String("ab")
        String s2 = s.intern();//jdk6中，在串池中创建一个字符串“ab”
        //jdk7/8中，串池中没有创建字符串“ab”，而是创建一个引用，指向new String("ab")
        System.out.println(s2=="ab");//jdk6:true  jdk8:true
        System.out.println(s=="ab");//jdk6:false  jdk8:true

        System.out.println("第一次修改...");

    }
}
