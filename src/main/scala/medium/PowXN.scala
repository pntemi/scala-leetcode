package medium

/** 50. Pow(x,n)
  *
  * implement pow(x,n)
  *
  * Example 1:
  * Input: 2.00000, 10
  * Output: 1024.00000
  *
  * Example 2:
  * Input: 2.10000,
  * Output: 9.26100
  *
  */

object PowXN {

  def myPow(x: Double, n: Int): Double = {
    var map = Map(0 -> 1d)

    def pow(x: Double, n: Int): Double = {
      if (n == 1 || x == 1d )  x
      else if (n == -1) 1/x
      else if (map contains n)  map(n)
      else {
        val first = n/2
        val second = n - first

        val fn = pow(x, first) * pow(x, second)
        map += (n -> fn)

        fn
      }
    }

    pow(x,n)
  }
}
