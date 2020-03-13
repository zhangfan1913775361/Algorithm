package dayuanxiangqianchong;


/**
 * java8 自定义的函数式接口
 */


//定义函数式接口，有且只有一个抽样方法
interface Animal{
    void whoiyou();
}


public class TestFunction {

    private static Animal cat = () -> System.out.println("I am a Cat");

    private static void zoo(Animal animal){
        animal.whoiyou();
    }

    public static void main(String[] args) {
        //方法一：用南门塔表达式输出
        zoo(()-> System.out.println("I am a Dog"));
        //法二：
        zoo(cat);
    }

}
