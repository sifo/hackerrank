// https://www.hackerrank.com/challenges/eval-ex/problem

import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val n = stdin.readLine.trim.toInt

        for (nItr <- 1 to n) {
            val x = stdin.readLine.trim.toDouble
            println(f(x))
        }
    }

    def f(x: Double): Double = {
        1 + x + (2 to 9).map(n => Math.pow(x, n)/factorial(n)).sum
    }

    def factorial(n: Int): Int = n match {
        case 0 => 1
        case _ => n * factorial(n-1)
    }
}
