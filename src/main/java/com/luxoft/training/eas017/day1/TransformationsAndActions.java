package com.luxoft.training.eas017.day1;

import org.apache.commons.io.output.NullPrintStream;
import org.apache.spark.SparkConf;
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

   }

}
