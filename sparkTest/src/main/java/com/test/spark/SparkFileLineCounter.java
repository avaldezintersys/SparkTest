package com.test.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class SparkFileLineCounter {

	public static void main(String[] args) {
		SparkConf conf = new SparkConf().setAppName("SparkFileLineCounter");
		JavaSparkContext ctx = new JavaSparkContext(conf);
		
		JavaRDD<String> lines = ctx.textFile("/data/Dockerfile");
		System.out.println(lines.count());
	}

}
