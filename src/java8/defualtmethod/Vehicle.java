package java8.defualtmethod;

public interface Vehicle {
    //接口类中的默认方法
    default void print() {
        System.out.println("I am a car!");
    }

    // 静态方法
    //Java 8 的另一个特性是接口可以声明（并且可以提供实现）静态方法。例如：
    static void blowHorn(){
        System.out.println("按喇叭!!!");
    }
}
