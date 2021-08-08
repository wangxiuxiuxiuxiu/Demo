package day01;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Object o = new Object();
        Object b = new Object();
        System.out.println(o.equals(b));


        List<Integer> list = new ArrayList<>();
        addElement(list);


        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer pp =  iterator.next();
            if(pp==5){
                //list.remove(pp);
                iterator.remove();
            }
        }

        System.out.println("删除后的元素："+list.toString());

/*        for (int i=0;i<list.size();i++){
            if(list.get(i)==5){
                //list.remove(pp);
                list.remove(list.get(i));
            }
        }*/
        System.out.println("删除后的元素："+list.toString());



    }
    public static void addElement(List<Integer> list){
        for (int i=0;i<10;i++){
            if(i==5){
                list.add(i);
                list.add(i);
            }
            list.add(i);
        }

        System.out.println("元素列表："+list);
    }



}
