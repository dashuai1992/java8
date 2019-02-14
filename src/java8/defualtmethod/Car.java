package java8.defualtmethod;

public class Car implements Vehicle , FourWheeler{


    /**
     * 该类实现了两个接口类，并这两个接口类中有相同的默认方法
     *
     * 此时第一种解决方案，创建该类中自己的默认方法
     */
/*    default void print() {
        System.out.println("I am a car!");
    }*/

    /**
     *
     * 第二种解决方案，使用 super 来调用指定接口的默认方法：
     */
    public void print(){
        Vehicle.super.print();
    }

}
