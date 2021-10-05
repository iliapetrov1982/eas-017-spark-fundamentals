package com.luxoft.training.eas017.day1;

import org.apache.commons.io.output.NullPrintStream;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

public class ReadingAndWritingExternalData {

    public static void main(String[] args)  {
        System.setErr(new NullPrintStream());
        final SparkConf conf = new SparkConf().setAppName("ReadWrite").setMaster("local[*]");
        final JavaSparkContext sc = new JavaSparkContext(conf);

    }
}
