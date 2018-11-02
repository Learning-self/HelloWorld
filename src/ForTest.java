public class ForTest {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        for (int i : numbers) {
            System.out.print(i);
            System.out.print(",");
        }
        System.out.println("\n");

        String[] names = {"Bob", "Jane", "Lily"};
        for (String s : names) {
            System.out.print(s);
            System.out.print(",");
        }
    }
}
