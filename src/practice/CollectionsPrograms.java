package practice;

import java.util.*;

public class CollectionsPrograms {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(10);
        list.add(30);
        list.add(40);
        list.add(60);
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,70);
        map.put(3,80);
        map.put(4,80);
        map.put(5,90);
        map.put(2,100);
//        traverseArrayList(list);
//        traverseHashmap();
        sortHashmap(map);
    }

    private static void sortHashmap(Map<Integer, Integer> map) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.putAll(map);
        for (Map.Entry<Integer, Integer> m : treeMap.entrySet())
        {
            System.out.println(m.getKey());
        }
    }

    private static void traverseHashmap() {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,70);
        map.put(2,80);
        map.put(3,80);
        map.put(4,90);
        map.put(5,100);
        for (Map.Entry<Integer, Integer> m : map.entrySet())
        {
            System.out.println(m.getValue());
        }
    }

    private static void traverseArrayList(List<Integer> list) {
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
