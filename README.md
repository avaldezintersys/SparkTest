# SparkTest

## Start Spark Shell
spark-shell --master spark://spark:7077

## View Spark Master WebUI console
http://192.168.99.100:8080/

## View Spark Worker WebUI console
http://192.168.99.100:8081/

## Run

- spark-submit --class com.test.spark.SparkFileLineCounter --master spark://spark:7077 /data/sparkTest-0.0.1-SNAPSHOT.jar

- spark-submit --class com.test.spark.SparkListCounter --master spark://spark:7077 /data/sparkTest-0.0.1-SNAPSHOT.jar

