package com.test.spark;

import java.util.Arrays;
import java.util.List;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class SparkListCounter {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		SparkConf conf = new SparkConf().setAppName("ListCounter");
		JavaSparkContext sc = new JavaSparkContext(conf);
		List<Integer> data = Arrays.asList(1,23,45,21,26,90,19,0);
		JavaRDD<Integer> distData = sc.parallelize(data);
		System.out.println(distData.count());
	}

}
