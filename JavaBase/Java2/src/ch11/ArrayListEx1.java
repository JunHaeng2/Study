package ch11;

import java.util.*;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<Integer>(list1.subList(1,4));
        System.out.println(list1);
        System.out.println(list2);

        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1.contains(list2));

        list2.add(2, 1);

        // 감소하는 방법으로 진행해야함.. 증가하는 방식으로 한다면 값이 삭제될 경우 데이터값들이 이동하면서 자리를 채우게 되어
        // 인덱스값이 변화하기 때문에
        for (int i = list2.size() - 1; i >= 0; i--) {
            if(list1.contains(list2.get(i))) {
                list2.remove(i);
            }
        }
        System.out.println(list1);
        System.out.println(list2);
    }
}
