public class Bus extends Car {

    public Bus(String id) {
        this.id = ("bus_" + id);
        length = super.getLength() * 3;
    }

}
