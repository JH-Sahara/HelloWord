package Three_Test;

class Bike implements Vehicle{

    @Override
    public void start(int i) {
        System.out.println("BikeStart:"+i+"点");
    }

    @Override
    public void stop(int j) {
        System.out.println("BikeStop:"+j+"点");
    }
}
class Bus implements Vehicle{

    @Override
    public void start(int i) {
        System.out.println("BusStart:"+i+"点");
    }

    @Override
    public void stop(int j) {
        System.out.println("BusStop:"+j+"点");
    }
}

public class interfaceDemo {
    public static void main(String[ ] args){
        Bike bike = new Bike();
        bike.start(6);
        bike.stop(11);

        Bus bus = new Bus();
        bus.start(8);
        bus.stop(6);
    }
}
