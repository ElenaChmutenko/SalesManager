public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
    public int trimAverage() {
        int max = 0;
        int min = sales[0];
        int sum = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= min) {
                sum += min;
                min = sales[i];
            } else if (sales[i] >= max) {
                sum += max;
                max = sales[i];
            } else {
                sum += sales[i];
            }
        }
        return sum / (sales.length - 2);
    }
}
