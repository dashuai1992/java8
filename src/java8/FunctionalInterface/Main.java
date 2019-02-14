package java8.FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * 函数式接口
 */
public class Main {
    public static void main(String[] args) {

        //函数是编程结合lambda表达式一起使用
        FuncInterface funcInterface = message -> System.out.println(message);
        funcInterface.msg("asdf");

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        //传参 a,输出列表全部内容
        eval(nums, a -> true);

        //输出偶数
        eval(nums, a -> a/2 == 0);

        //输出大于3的元素
        eval(nums, a -> a > 3);
    }

    /**
     * java.util.Funtion提供了一些支持函数是编程的接口类
     * Predicate<T>
     * 接受一个输入参数，返回一个布尔值结果。
     */
    private static void eval(List<Integer> list, Predicate<Integer> predicate){
        list.forEach(a -> {
            if(predicate.test(a)){
                System.out.println(a + "");
            }
        });
    }
}
