// https://www.hackerrank.com/challenges/fp-hello-world-n-times/problem

object Solution extends App {
  def f(n: Int) = 1 to n foreach { _ => println("Hello World") }
  var n = scala.io.StdIn.readInt
  f(n)
}
