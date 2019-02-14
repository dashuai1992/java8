package java8.Stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

        //过滤调为空的字符串元素
        List<String> filter = strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
        System.out.println(filter);
        //合并字符串
        String collect = filter.stream().collect(Collectors.joining(","));
        System.out.println(collect);

        //limit 方法用于获取指定数量的流。 以下代码片段使用 limit 方法打印出 5 条数据：
        System.out.println(strings.stream().limit(5).collect(Collectors.toList()));

        //sorted 方法用于对流进行排序。以下代码片段使用 sorted 方法对输出的 10 个随机数进行排序：
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        // 获取对应的平方数,去重
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
        System.out.println(squaresList);

        //并行（parallel）程序
        long count = strings.parallelStream().filter(str -> str.isEmpty()).count();
        System.out.println(count);


        //统计
        List<Integer> nums = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics stats = nums.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("列表中最大的数 : " + stats.getMax());
        System.out.println("列表中最小的数 : " + stats.getMin());
        System.out.println("所有数之和 : " + stats.getSum());
        System.out.println("平均数 : " + stats.getAverage());
    }
}
