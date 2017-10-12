import java.util.Scanner

object MutateString {
  def main(args: Array[String]) {
    val res = {
      val sc = new Scanner(System.in)
      val text = sc.nextLine()
      text.updated(sc.nextInt(), sc.next()(0))
    }
    println(res)
  }
}
