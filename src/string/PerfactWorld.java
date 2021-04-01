package string;

/**
 * 完美世界笔试题，为什么输出都是false呢？
 */

public class PerfactWorld {
    private static final String INC = "PerfactWorld";

    public static void main(String[] args) {
        String a = "Perfact"+"world";
        String b = "Perfact";
        String c = "world";
        System.out.println(a == INC);//输出false？why？
        System.out.println((b+c) == INC);//也是输出false，为什么？
    }

}
