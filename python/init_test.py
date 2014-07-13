from pyspark import SparkConf, SparkContext

conf = SparkConf().setMaster("local").setAppName("Initialization Tester")

sc = SparkContext(conf=conf)
