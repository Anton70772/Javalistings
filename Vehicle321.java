public class Vehicle321 {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;

    Vehicle321(int passengers, int wheels, int maxspeed, int burnup) {
        this.passengers = 4;
        this.wheels = 4;
        this.maxspeed = 160;
        this.burnup = 13;
    }
    double distance(double interval) {
        double val = this.maxspeed * interval;
        return val;
    }
    int getMaxSpeed() {
        return this.maxspeed;
    }
    int getWheels() {
        return this.wheels;
    }
    void setWheels(int wheels) {
        if ((wheels<1)|| (wheels>24)) {
            System.out.println("Неверно укзано число колес");
            return;
        }
        this.wheels =wheels;
    }
}

class Auto extends Vehicle321 {
    boolean sunroof;
    public static void main(String[] args) {
        Auto bmw = new Auto();
        bmw.sunroof = true;

        System.out.println("Путь пройденный за 1.5 часа: " + bmw.distance(1.5) + " км");
        System.out.println("Max скорость: " + bmw.getMaxSpeed() + " км/ч");
        System.out.println("аличие люка: " + bmw.sunroof);
    }
}

class PolyVehicleDemo {
    public static void main(String[] args) {
        Auto a = new Auto(true);
        Vehicle321 v = new Vehicle321();

        Vehicle321[] pvd = {a,v};

        for (int i=0; i<pvd.length; i++) {
            System.out.println(pvd[i].toString());
        }
    }
}