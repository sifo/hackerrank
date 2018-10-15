// https://www.hackerrank.com/challenges/fp-filter-positions-in-a-list/problem

import scala.annotation.tailrec

def f(arr: List[Int]): List[Int] = {
  @tailrec
  def aux(l: List[Int], isOddPosition: Boolean, acc: List[Int]): List[Int] = {
    l match {
      case Nil => acc
      case hd :: rest => if(isOddPosition) aux(rest, false, acc) else aux(rest, true, acc :+ hd)
    }
  }
  aux(arr, true, List())
}
