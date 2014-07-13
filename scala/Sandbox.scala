import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._


object Sandbox {
  val conf = new SparkConf().setMaster("local").setAppName("Sandbox")
  val sc = new SparkContext("local", "Sandbox")


  def main(args: Array[String]) = {
    val inputRDD = sc.textFile("/var/log/syslog")
    val infoRDD = inputRDD.filter(line => line.contains("info"))
    println("number of lines")
    println(infoRDD.count())
    println("first line")
    println(infoRDD.first())
  }
}
