public class OddEvenSeparator {
    String even = "";
    String odd = "";

    void addNumber(int number) {
        if (number % 2 == 0) {
            even = even + number + " ";
        } else {
            odd = odd + number + " ";
        }
    }

    void even() {
        System.out.println("Чётные: " + even);
    }

    void odd() {
        System.out.println("Нечётные: " + odd);
    }

    public static void main(String[] args) {
        OddEvenSeparator sep = new OddEvenSeparator();

        sep.addNumber(1);
        sep.addNumber(2);
        sep.addNumber(3);
        sep.addNumber(4);
        sep.addNumber(5);
        sep.addNumber(6);

        sep.even();
        sep.odd();
    }
}