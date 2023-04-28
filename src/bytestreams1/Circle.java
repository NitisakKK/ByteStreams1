package bytestreams1;

public class Circle implements Shape { // ถ้าเรา implements เราต้อง Override ทุกๆ method
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
