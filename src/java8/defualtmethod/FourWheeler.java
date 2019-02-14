package java8.defualtmethod;

public interface FourWheeler {

    //接口类中的默认方法
    default void print() {
        System.out.println("I am a FourWheeler car!");
    }
}
