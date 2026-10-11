package day8;

import java.util.ArrayList;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
//        setDemo();
        ListDemo();
//        QueueDemo();
//        MapDemo();
    }

//        public static void setDemo(){
//        /**
//         * Set
//         * HashSet - LinkedHashSet - TreeSet
//         */
//        Set<String> fruits = new HashSet();
//        fruits.add("Apple");
//        fruits.add("Orange");
//        fruits.add("Banana");
//        fruits.add("Pineapple");
//        fruits.add("Orange");
//        System.out.println(fruits.size());

    //            var i=fruits.iterator();
//            while (i.hasNext()){
//                System.out.println(i.next());
//            }
//            for(String fruit:fruits){
//                System.out.println(fruit);
//            }
//fruits.forEach(System.out::println);
//}
    public static void ListDemo(){
        /**
         * List
         * ArrayList - LinkedList - Vector -Stack
         */
        List fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Orange");
        System.out.println(fruits.size());
        var i=fruits.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        for(var fruit:fruits){
            System.out.println(fruit);
        }
        fruits.forEach(System.out::println);

    }
//    public static void QueueDemo(){
//        /**
//         * Queue
//         *  LinkedList - PriorityQueue
//         */
//        Queue fruits = new LinkedList();
//        fruits.add("Apple");
//        fruits.add("Orange");
//        fruits.add("Banana");
//        fruits.add("Pineapple");
//        fruits.add("Orange");
//        System.out.println(fruits.size());
//var i=fruits.iterator();
//    while (i.hasNext()){
//        System.out.println(i.next());
//    }
//    for(var fruit:fruits){
//        System.out.println(fruit);
//    }
//    fruits.forEach(System.out::println);
//
//    }
//    public static void MapDemo() {
//        /**
//         * Map
//         * HashMap - LinkedHashMap - TreeMap
//         */
//
//        Map fruits = new HashMap();
//        fruits.put("Orange",100);
//        fruits.put("Apple",200);
//        fruits.put("Banana",300);
//        fruits.put("Pineapple",400);
//        fruits.putIfAbsent("Orange",50);
//        System.out.println(fruits.size());
//        System.out.println(fruits);
//    for(var fruit:fruits.entrySet()){
//        System.out.println("The number of calories of fruit "+fruit.getKey()+" is "+fruit.getValue());
//    }
//
//        fruits.forEach((x,y)->System.out.println("The number of calories of fruit "+x+" is "+y));
//    }
}

