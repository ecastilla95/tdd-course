package apps

import scala.collection.mutable.ArrayBuffer
import scala.io.StdIn

class SimpleTransformation {
  def main(args: Array[String]): Unit = {
    val n = StdIn.readInt()
    val arrayBuffer = new ArrayBuffer[String]()
    for (i <- 1 to n){
      arrayBuffer.append(StdIn.readLine)
    }
    val result : Array[(Int, String, Double)] = arrayBuffer.map(SimpleTransformationOps.mainTransformation).toArray

    println("RESULTADO:")
    result.foreach(println)
  }
}
object SimpleTransformationOps{
  def mainTransformation(string: String):(Int, String, Double) ={
    val array = string.split(";;")
    (array(0).toInt, array(1), array(2).toDouble)
  }
}