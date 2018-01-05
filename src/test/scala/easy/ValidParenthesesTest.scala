package easy

import org.scalatest.FunSuite
import easy.ValidParentheses._

class ValidParenthesesTest extends FunSuite{

  test("one bracket"){
    assert(!isValid("["))
    assert(!isValid("]"))
    assert(!isValid("("))
    assert(!isValid(")"))
    assert(!isValid("{"))
    assert(!isValid("}"))
  }

  test("two brackets"){
    assert(isValid("[]"))
    assert(!isValid("]["))
    assert(isValid("()"))
    assert(!isValid(")("))
    assert(!isValid("{{"))
    assert(!isValid("(}"))
  }

  test("three and more"){
    assert(isValid("[[]]"))
    assert(!isValid("][))"))
    assert(isValid("()[]{}()"))
    assert(isValid("{[(([]))]}"))
    assert(!isValid(")[{}]("))
    assert(!isValid("{{}}}}}}}}"))
    assert(!isValid("((((}[]))))"))
  }

}
