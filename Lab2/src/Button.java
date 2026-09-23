public class Button {
    int count = 0; // количество нажатий

    void click() {
        count = count + 1;
        System.out.println("Всего нажатий: " + count);
    }

    public static void main(String[] args) {
        Button b = new Button();

        b.click();
        b.click();
        b.click();
    }
}