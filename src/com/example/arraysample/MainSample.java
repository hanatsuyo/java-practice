import java.util.Arrays;

public class MainSample {
    public static void main(String... args) {
        int[] array1 = new int[10];
        int[] array2 = { 1, 2, 3 };
        int[] array3 = new int[] { 1, 2, 3 };
        System.out.println(array1.length);
        System.out.println(array2.length);
        System.out.println(array3.length);

        int[] array4 = { 1, 2, 14, 3, 4, 0};
        System.out.println(array4);
        System.out.println(Arrays.toString(array4));
        Arrays.sort(array4);
        System.out.println(Arrays.toString(array4));
    }
}
