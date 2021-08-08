package day02;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCach extends LinkedHashMap {

    private int cat;
    LRUCach(int cat){
        super(cat,0.75f,true);
        this.cat = cat;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size()>cat;
    }

    public static void main(String[] args) {

        LRUCach cache = new LRUCach(10);

        //存入10个数据，之后cache满了
        for (int i = 0; i < 10; i++) {
            cache.put("Test" + i, i);   // 键值对
        }
        System.out.println("目前所有缓存：" + cache);
        cache.get("Test3");
        System.out.println("拿了Test3后的缓存：" + cache);
        cache.get("Test4");
        System.out.println("拿了Test4后的缓存：" + cache);
        cache.get("Test5");
        System.out.println("拿了Test5后的缓存：" + cache);
        cache.get("Test5");
        System.out.println("再拿了Test5后的缓存：" + cache);

        cache.put("Test" + 10, 10);  //cache已经满了，则会将最长没用的删除
        System.out.println("添加新元素10后的缓存(此时缓存已满)：" + cache);

    }

}
