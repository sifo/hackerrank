import java.util.Scanner

object SplitAndJoin {

  def main(args: Array[String]) {
    val sc = new Scanner(System.in)
    val line = sc.nextLine()
    println(line.split(" ").mkString("-"))
  }
}
