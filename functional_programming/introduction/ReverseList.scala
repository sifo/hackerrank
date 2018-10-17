// https://www.hackerrank.com/challenges/fp-reverse-a-list/problem

import scala.annotation.tailrec

def f(arr: List[Int]): List[Int] = {
  @tailrec
  def aux(l: List[Int], acc: List[Int]): List[Int] = l match {
    case Nil => acc
    case hd :: rest => aux(rest, hd :: acc)
  }
  aux(arr, List())
}
