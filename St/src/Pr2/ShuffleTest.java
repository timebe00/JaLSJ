package Pr2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i = 1; i <= 10; i++)
        {
            list.add(i);
        }

        System.out.println(list);
        //  확률 분포 중 균일 분포를 따름
        //  즉 모든 값이 나올 혹률이 골고루 있음
        Collections.shuffle(list);
        System.out.println(list);


    }
}
