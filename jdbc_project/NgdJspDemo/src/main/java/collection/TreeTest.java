package collection;

import java.util.*;

public class TreeTest {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        set.add(5);
        set.add(8);
        set.add(1);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("==============================");
        map.put(1,1);
        map.put(5,5);
        map.put(3,3);
        Set<Integer> keySet = map.keySet();
        for (Integer integer : keySet) {
            System.out.println(integer);
        }
        Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println(value);
        }

        Iterator<Integer> iterator1 = values.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        System.out.println("===========================");
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, Integer>> iterator2 = entries.iterator();
        while (iterator2.hasNext())
            System.out.println(iterator2.next());
    }
}
