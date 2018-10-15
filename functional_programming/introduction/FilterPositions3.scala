// https://www.hackerrank.com/challenges/fp-filter-positions-in-a-list/problem

def f(arr: List[Int]): List[Int] = arr match {
  case hd :: nx :: rest => nx :: f(rest)
  case _ => List()
}
