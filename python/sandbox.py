from pyspark import SparkConf, SparkContext

conf = SparkConf().setMaster("local").setAppName("sandbox")

sc = SparkContext(conf=conf)

inputRDD = sc.textFile("/var/log/syslog")
infoRDD = inputRDD.filter(lambda line: "info" in line)

print "number of lines"
print infoRDD.count()
print "first line"
print infoRDD.first()
