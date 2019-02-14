package java8.methodref;

import java8.methodref.some.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  方法引用
 *       -方法引用提供了非常有用的语法，可以直接引用已有Java类或对象（实例）的方法或构造器。与lambda联合使用，方法引用可以使语言的构造更
 *       紧凑简洁，减少冗余代码。
 */
public class Java8MethodRef {
    public static void main(String[] args) {

        //构造器引用：它的语法是Class::new，或者更一般的Class< T >::new实例如下：
        final Car car = Car.create(Car::new);
        final List<Car> cars = Arrays.asList(car);

        //静态方法引用：它的语法是Class::static_method，实例如下：
        cars.forEach( Car::collide );

        //特定类的任意对象的方法引用：它的语法是Class::method实例如下
        cars.forEach( Car::repair );

        //特定对象的方法引用：它的语法是instance::method实例如下：
        final Car police = Car.create( Car::new );
        cars.forEach( police::follow );

        List<String> list = new ArrayList<>();
        list.add("taobao");
        list.add("baidu");
        list.add("sina");
        list.forEach(System.out::println);
    }
}
