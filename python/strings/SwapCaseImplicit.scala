// https://www.hackerrank.com/challenges/swap-case/problem

import java.util.Scanner

object SwapCase {

  def main(args: Array[String]) {
    val sc = new Scanner(System.in)
    val input = sc.next()
    implicit class StringImprovements(s: String) {
      def swapCase = s.map(x => if(x.isUpper) x.toLower else x.toUpper)
    }
    println(input.swapCase)
  }
}
