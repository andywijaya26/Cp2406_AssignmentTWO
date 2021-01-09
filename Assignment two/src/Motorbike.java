public class Motorbike extends Car {

    public Motorbike(String id) {
        this.id = ("bike_" + id);
        length = super.getLength() * 0.5f;
    }

}
