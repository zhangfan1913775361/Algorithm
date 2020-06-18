package DesignPattern.Singleton;

/**
 * Created by zhangfan 2020/6/19
 *
 * 双重校验锁下的懒汉
 */
public class LazyMan {
    //只要是单例模式，构造器一定要私有！！这样就防止
    private LazyMan(){
        System.out.println(Thread.currentThread().getName()+"OK");
    }
    private volatile static LazyMan lazyMan;
    public static LazyMan getInstance(){
        if (lazyMan == null){
            synchronized (LazyMan.class){
                if (lazyMan == null){
                    lazyMan = new LazyMan();
                    //上面这一行的new对象，看似简单，但是并不是原子性操作，分为如下三步：
                    //1.分配内存
//                    2.初始化对象
//                    3.将对象指向内存。
//                    这三步并不是原子化操作，如果有多线程，可能会乱序，导致指令重排，执行顺序就乱掉了。
//                    故使用volatile将lazyman的内存透明化，防止指令重排
                }
            }
        }
        return lazyMan;
    }

    public static void main(String[] args) {
        //用Lamda表达式同时初始化20次，但只有一个实例
        for (int i = 0; i < 20; i++) {
            new Thread(()->{LazyMan.getInstance();}).start();
        }
    }
}
