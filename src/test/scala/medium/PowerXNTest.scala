package medium

import org.scalatest.FunSuite
import medium.PowXN._
import utils.TestHelper._

class PowerXNTest extends FunSuite{

  test("works with integer values"){
    assert(myPow(2d, 10) == Math.pow(2d, 10d))
    assert(myPow(3d, 17) == Math.pow(3d, 17d))
    assert(myPow(146d, 21) == Math.pow(146d, 21d))
  }

  test("works with decimal values"){
    assert(myPow(2.1, 3) ~= Math.pow(2.1, 3d))
    assert(myPow(3.14, 10) ~= Math.pow(3.14d, 10d))
    assert(myPow(10.00001, 5) ~= Math.pow(10.00001, 5d))
  }

  test("works with negative values"){
    assert(myPow(-3d, 3) ~= Math.pow(-3d, 3d))
    assert(myPow(-3.14, 10) ~= Math.pow(-3.14d, 10d))
    assert(myPow(-234, -5) ~= Math.pow(-234d, -5d))
  }
}
