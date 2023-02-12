class Vehicle320 {
    int passengers;
    private int wheels;
    private int maxspeed;
    int burnup;

    Vehicle320(int passengers, int wheels, int maxspeed, int burnup) {
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

class Auto extends Vehicle320{
        boolean sunroof;
    }

