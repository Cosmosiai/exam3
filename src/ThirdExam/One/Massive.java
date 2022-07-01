package ThirdExam.One;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Massive {
    public static void main(String[] args) {
        int[] a = new int[100];
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> set1 = new HashSet<Integer>();
        LinkedList<Integer> set2 = new LinkedList<>();
        for (int i=0;i<a.length;i++){
            a[i]=i+1;
            set.add(a[i]);
        }
        int counter = 0;
        int[] b=new int[80];
        for (Integer i: set){
            if (i%5!=0){
                set2.addLast(i);
            }else {
                set2.addFirst(i);
            }
        }
        System.out.println(set);
        System.out.println(set1);
        System.out.println(set2);

//Это невозможно. Как минимум, с использованием hashset. Так как hashset сортирует всё по хэшкоду, он не будет поддаваться сортировке по значению. нам нужно использовать другие методы: treeset, массивы, листы и тд.
    }
}
