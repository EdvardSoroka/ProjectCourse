import java.lang.reflect.Array;
import java.util.Arrays;

public class Lesson1 {
    public static void main(String[] args) {
        int []ggr  = new int[10];
        ggr[0] = 1;
        ggr[2] = 1;

        System.out.println(ggr.length);
        System.out.println(Arrays.toString(ggr));
    }
}
