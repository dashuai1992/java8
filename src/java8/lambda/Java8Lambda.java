package java8.lambda;

/**
 * JAVA8 新特性
 * lambda表达式
 *      -Lambda允许把函数作为一个方法的参数（函数作为参数传递进方法中。
 */
public class Java8Lambda {
    public static void main(String[] args) {

        //参数类型声明
        MathOperation addition = (int a, int b) -> a + b;

        //参数不用类型声明
        MathOperation subtraction = (a, b) -> a - b;

        //返回值
        MathOperation multiplication = (a, b) -> { return a * b; };

        //不使用return关键字
        MathOperation division = (a, b) -> a / b;

        System.out.println(addition.operation(1, 2));
        System.out.println(subtraction.operation(3, 4));
        System.out.println(multiplication.operation(5, 6));
        System.out.println(division.operation(7, 8));

        //一个参数不使用小括号
        GreetingService greetingService = message -> System.out.println("Hello " + message);
        greetingService.sayMessage("lambda");

        //用括号
        GreetingService greetingService2 = (message) -> System.out.println("Hello " + message);
        greetingService2.sayMessage("lambda");

        //在lambda表达式中访问外层局部变量
        final int num = 1;
        Converter converter = param -> System.out.println(String.valueOf(param + num));
        converter.convert(3);

        //lambda表达式中不允许访问与参数同名的局部变量，如：
        //String first = "";
        //GreetingService test = (first) -> System.out.println(first);


    }

    interface MathOperation {
        int operation(int a, int b);
    }
    interface GreetingService {
        void sayMessage(String message);
    }
    public interface Converter {
        void convert(int i);
    }
}
