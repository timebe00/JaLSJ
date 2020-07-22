package Pr2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Person
{
    private int age;
    private int name;

    public Person(int age, String name)
    {

    }

    public int getAge() {
        return age;
    }

    public int getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name=" + name +
                '}';
    }
}

public class HashMapTest {

    public static String randName()
    {
        final int START = 0;
        final int MAX = 3;
        final int RANGE = 13;

        Random rand = new Random();
        String retStr = "";
        String[] strArr = {"가","나","다","라","마","바","사","아","차","카","타","파","하"};

        for(int i = START; i < MAX; i++)
        {
            retStr += strArr[rand.nextInt(RANGE)];
        }

        return retStr;
    }

    public static void main(String[] args) {
        final int RANGE = 30;
        final int START = 0;
        final int MAX = 7;
        final int BIAS = 20;

        Random rand = new Random();
        Map<Integer, Person> p = new HashMap<Integer, Person>();

        for(int i = START; i < MAX; i++) {
            p.put(1, new Person(rand.nextInt(RANGE) + BIAS, randName()));
        }

        System.out.println(p);

        p.remove(4);
        p.put(3, new Person(3, "안녕"));
        System.out.println(p);

        //  Map.Entry를 사용하여 실제 HashMap에 있는 정보들을
        //  한개씩 얻어올 수 있다.
        //  p.entrySet()이 정보를 한 개씩 준다.(Hash 정보)
        //  Hash 정보란 (Key, value)로 구성된 데이터
        for(Map.Entry<Integer, Person> s: p.entrySet())
        {
            Integer key = s.getKey();
            Person value = s.getValue();
            System.out.println("key = " + key + "\nvalue = " + value);
        }
    }
}
