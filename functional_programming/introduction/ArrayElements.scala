// https://www.hackerrank.com/challenges/fp-array-of-n-elements/problem

object Solution extends App {
  import scala.annotation.tailrec

  def f(num:Int) : List[Int] = {
    @tailrec
    def aux(n: Int, acc: List[Int]): List[Int] = n match {
      case x if x <= 0 => acc
      case _ => aux(n-1, 1 :: acc)
    }
    aux(num, List())
  }
  println(f(readInt))
}
