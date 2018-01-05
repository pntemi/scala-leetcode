package easy

/*
* 20. Valid Parentheses
*
* Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
* The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*
* */

object ValidParentheses {

  val parenMap = Map(")" -> "(", "}" -> "{", "]" -> "[")

  def isValid(s: String): Boolean = {

    //  Scala's guide: in order to use a stack, assign a List to var
    var stackList = List()

    validate(s, stackList) match {
      case List() => true
      case _ => false
    }
  }

  def validate(s: String, opens: List[String]): List[String] = {
    if (s equals "") opens
    else {
      val (front, back) = (s.substring(0,1), s.substring(1))
      if ((parenMap contains front) && opens.nonEmpty){
        if(opens.last == parenMap(front)) return validate(back, opens.dropRight(1))
      }
      validate(back, opens :+ front)
    }
  }

}
