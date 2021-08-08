package day02;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

public class Demo {

    String name;
    Demo(String name){

        this.name = name;
    }
    public static void main(String[] args) throws InterruptedException {


        Demo demo = new Demo("22");
        HashMap<String,String> map = new HashMap<>();
        ArrayList list = new ArrayList();
        list.add("11");
        list.add("22");
        list.add("22");
        list.add("22");
        list.add("999");
/*       for (int x=0;x<list.size();x++){

           if(list.get(x).equals("22")){
               list.remove(x);
           }
       }*/

        System.out.println(Arrays.toString(list.toArray()));

        /*for (Object object:list
             ) {
            if(object.equals("22")){
                list.remove(object);
            }
        }*/

        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            Object next = iterator.next();
            if(next.equals("22")){
                iterator.remove();
            }
        }
        list.get(0);
        System.out.println(Arrays.toString(list.toArray()));

        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("dd","33");
        linkedHashMap.put("22","33");
        linkedHashMap.put("55","33");
        linkedHashMap.get("dd");
    }
}
