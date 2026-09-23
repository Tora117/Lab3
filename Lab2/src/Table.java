public class Table {
    int[][] data;
    int rows;
    int cols;

    Table(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new int[rows][cols];
    }

    int getValue(int row, int col) {
        return data[row][col];
    }

    void setValue(int row, int col, int value) {
        data[row][col] = value;
    }

    int rows() {
        return rows;
    }

    int cols() {
        return cols;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result = result + data[i][j] + " ";
            }
            result = result + "\n";
        }
        return result;
    }

    double average() {
        double sum = 0;
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum = sum + data[i][j];
                count++;
            }
        }

        return sum / count;
    }

    public static void main(String[] args) {
        Table t = new Table(3, 4);

        System.out.println("Строк: " + t.rows());
        System.out.println("Столбцов: " + t.cols());
        System.out.println("Таблица (все нули):");
        System.out.println(t);

        t.setValue(0, 0, 5);
        t.setValue(1, 2, 10);
        t.setValue(2, 3, 15);

        System.out.println("После изменений:");
        System.out.println(t);

        System.out.println("Значение [1][2] = " + t.getValue(1, 2));
        System.out.println("Среднее = " + t.average());
    }
}