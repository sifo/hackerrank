// https://www.hackerrank.com/challenges/fp-list-length/problem

def f(arr:List[Int]):Int = arr match {
  case Nil => 0
  case hd :: rest => 1 + f(rest)
}
