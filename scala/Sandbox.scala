import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._


object Sandbox {
  val conf = new SparkConf().setMaster("local").setAppName("Sandbox")
  val sc = new SparkContext("local", "Sandbox")


  def main(args: Array[String]) = {
    println("spark!")
  }
}
