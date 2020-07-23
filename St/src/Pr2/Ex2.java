package Pr2;

class Count2
{
    public  static double x;
    private double y;
    private double sum;

    public void MyMath(double x)
    {
        this.x += x;
        double lo = Math.exp(this.x);
        y = lo * x;
        this.sum += y;
    }

    public double getSum() {
        return sum;
    }
}

class One extends Thread
{
    final double x = 0.001;
    public void run()
    {
        synchronized (Ex2.MyCounter) {
            for (double i = 0.0; i < 1; i += x) {
                Ex2.MyCounter.MyMath(x);
            }
        }
    }
}

class Tow extends Thread
{
    final double x = 0.001;

    public void run()
    {
        synchronized (Ex2.MyCounter) {
            for (double i = 1.0; i < 2.0; i += x) {
                Ex2.MyCounter.MyMath(x);
            }
        }
    }
}

class Thar extends Thread
{
    final double x = 0.001;

    public void run()
    {
        synchronized (Ex2.MyCounter) {
            for (double i = 2.0; i < 3.0; i += x) {
                Ex2.MyCounter.MyMath(x);
            }
        }
    }
}


public class Ex2 {

    public static Count2 MyCounter = new Count2();


    public static void main(String[] args){
        double sum = 0.0;

        One a = new One();
        Tow b = new Tow();
        Thar c = new Thar();

        a.start();
        b.start();
        c.start();

        try {
            a.join();
            b.join();
            c.join();
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(MyCounter.getSum());
    }
}