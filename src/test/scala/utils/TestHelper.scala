package utils

object TestHelper {

  implicit class CompareWithPrecision(x: Double){
    val precision: Double = 0.00001
    def ~= (y: Double): Boolean = {
      if (Math.abs(x-y) <= precision) true
      else false
    }
  }

}
