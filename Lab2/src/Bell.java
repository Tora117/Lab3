public class Bell {
    boolean Ding = true;

    void sound() {
        if (Ding) {
            System.out.println("ding");
        } else {
            System.out.println("dong");
        }
        Ding = !Ding;
    }

    public static void main(String[] args) {
        Bell b = new Bell();

        b.sound(); // ding
        b.sound(); // dong
        b.sound();
        b.sound();
        b.sound();
    }
}