// https://www.hackerrank.com/challenges/fp-filter-array/problem

 def f(delim: Int, arr: List[Int]): List[Int] = {
     def aux(l: List[Int], acc: List[Int]): List[Int] = {
         l match {
             case Nil => acc
             case hd :: rest => if(hd < delim) aux(rest, hd :: acc) else aux(rest, acc)
         }
     }
     aux(arr, List()).reverse
 }
