package com.luxoft.training.eas017.day1;

import org.apache.commons.io.output.NullPrintStream;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TransformationsAndActions {

    public static void main(String[] args) throws InterruptedException {
        System.setErr(new NullPrintStream());
        final SparkConf conf = new SparkConf().setAppName("RDD operations").setMaster("local[*]");
        final JavaSparkContext sc = new JavaSparkContext(conf);

        List<Integer> numbers = IntStream.range(0, 10).boxed().collect(Collectors.toList());

        JavaRDD<Integer> rdd = sc.parallelize(numbers);

        numbers.add(15);

        System.out.println("rdd contents: " + rdd.collect());

        numbers.add(17);

        System.out.println("rdd contents: " + rdd.collect());



        //List<Integer> localListOnDriver = rdd.collect();

//        JavaRDD<Integer> evenNumbersRdd = rdd.filter(n -> n % 2 == 0);
//
//        evenNumbersRdd.collect();
//
//        evenNumbersRdd.map(i -> i+100).collect();

//        JavaRDD<Integer> mappedRdd = rdd.map(i -> i+100);
//        System.out.println("rdd contents: " + mappedRdd.collect() );

   }

}
