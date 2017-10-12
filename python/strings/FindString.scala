import java.util.Scanner
import scala.annotation.tailrec

object FindString {

  def findString2(s: String, sub: String): Int = {
    if(s.length >= sub.length) {
      if(s.substring(0, sub.length) == sub)
        1 + findString(s.drop(1), sub)
      else
        findString(s.drop(1), sub)
    } else {
      0
    }
  }

  def findString(string: String, sub: String): Int = {
    @tailrec
    def aux(s: String, acc: Int): Int = {
      if(s.length >= sub.length) {
        if(s.substring(0, sub.length) == sub)
          aux(s.drop(1), acc+1)
        else
          aux(s.drop(1), acc)
      } else {
        acc
      }
    }
    aux(string, 0)
  }

  def main(args: Array[String]) {
    val sc = new Scanner(System.in)
    val s = sc.nextLine()
    val sub = sc.nextLine()
    println(findString(s, sub))
  }
}
