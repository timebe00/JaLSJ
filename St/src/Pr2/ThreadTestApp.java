package Pr2;

import java.util.Random;

class Car implements Runnable {
    String name;
    private  int sleepTime;
    private final static Random gen = new Random();

    public Car(String name)
    {
        this.name = name;
        sleepTime = gen.nextInt(3000);
    }

    @Override
    public void run() {
        try
        {
            Thread.sleep(sleepTime);
        }
        catch (InterruptedException e)
        {

        }
        System.out.println(name + "이(가) 경주를 완료하였다.");
    }

/*
    public void run()
    {
        try
        {
            Thread.sleep(sleepTime);
        }
        catch (InterruptedException e)
        {

        }
        System.out.println(name + "이(가) 경주를 완료하였다.");
    }

 */
}


public class ThreadTestApp {
    public static void main(String[] args) {
        //  Thread를 사용하려면 아래와 같이 스래드 객체가 될 대상을 지정해야 한다.
        //  추가로 스래드가 될 대상 객채는 반드시  Runnable을 implements해야 한다.
        //  그래야 Thread를 구동시킬 수 있다.
        Thread t1 = new Thread(new Car("Porche 918"));
        Thread t2 = new Thread(new Car("Ferrari"));
        Thread t3 = new Thread(new Car("Nissan"));

        t1.start();
        t2.start();
        t3.start();
    }
}

