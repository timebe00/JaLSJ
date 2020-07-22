package Pr2;

class Count2
{
    public  static double x;
    private double y;

    public void MyMath(double x)
    {
        this.x += x;
        double y = Math.exp(this.x);
        this.y = y * x;
    }

    public double getY() {
        return y;
    }
}

public class Ex2 {
    public static void main(String[] args) {
        final double x = 0.001;
        double sum = 0.0;
        Count2 count = new Count2();
        for(double i = 0.0; i < 3; i += x)
        {
            count.MyMath(x);
            sum += count.getY();
        }
        System.out.println(sum);
    }
}