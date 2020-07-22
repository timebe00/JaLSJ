package Pr1;

class Car {
    private int speed;
    private int gear;
    private String color;

    public Car(int speed, int gear, String color) {
        this.speed = speed;
        this.gear = gear;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public String getColor() {
        return color;
    }
}

class SportsCar extends Car{
    boolean boost;
    public SportsCar(int speed, int grear, String color,boolean boost)
    {
        super(speed, grear, color);
        this.boost = boost;
    }

    public void setBoost(boolean deter)
    {
        boost = deter;
    }

    @Override
    public String toString() {
        return "SportsCar{" +
                "speed=" + getSpeed() +
                ",gear=" + getGear() +
                ",color=" + getColor() +
                ",boost=" + boost +
                '}';
    }
}

public class CarTest {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar(300, 12,"metalblack", true);

        System.out.println(sc);
    }
}
