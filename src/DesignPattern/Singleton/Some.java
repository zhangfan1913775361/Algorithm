package DesignPattern.Singleton;

/**
 * Created by zhangfan 2020/6/19
 */
public class Some{
    //只要是单例模式，构造器都要私有化，因为使得该类不被实例化，和不能被继承。
//    要创建这个类的实例，唯一的办法是提供一个公共静态方法。这种方式被称为单例模式。
    private Some(){
    }
    public static void dosome(){
        System.out.println("单例模式启动.......");
    }

}



