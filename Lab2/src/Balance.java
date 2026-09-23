public class Balance {
    int left = 0;
    int right = 0;

    void addLeft(int weight) {
        left = left + weight;
    }

    void addRight(int weight) {
        right = right + weight;
    }

    void result() {
        if (left == right) {
            System.out.println("=");
        }
        if (right > left) {
            System.out.println("R");
        }
        if (left > right) {
            System.out.println("L");
        }
    }

    public static void main(String[] args) {
        Balance b = new Balance();

        b.addLeft(5);
        b.addRight(5);
        b.result();  // =

        b.addRight(3);
        b.result();  // R

        b.addLeft(10);
        b.result();  // L
    }
}