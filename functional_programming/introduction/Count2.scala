// https://www.hackerrank.com/challenges/fp-list-length/problem

import scala.annotation.tailrec

def f(arr:List[Int]): Int = {
  @tailrec
  def aux(l: List[Int], acc: Int): Int = l match {
    case Nil => acc
    case hd :: rest => aux(rest, acc+1)
  }
  aux(arr, 0)
}
