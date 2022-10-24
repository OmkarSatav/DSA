public class Print_Num_Descending_Order {
    public static void recPrintDesc(int num) {
        if (num == 1) {
            System.out.println(num + " ");
            return;
        }
        System.out.println(num);
        recPrintDesc(num - 1);
    }

    public static void main(String[] args) {
        recPrintDesc(10);
    }
