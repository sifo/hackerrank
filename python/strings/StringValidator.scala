import java.util.Scanner

object StringValidator {


  // def main(args: Array[String]) {
  //   val sc = new Scanner(System.in)
  //   val s = sc.nextLine()
  //   println(s.exists(_.isLetterOrDigit).toString.capitalize)
  //   println(s.exists(_.isLetter).toString.capitalize)
  //   println(s.exists(_.isDigit).toString.capitalize)
  //   println(s.exists(_.isLower).toString.capitalize)
  //   println(s.exists(_.isUpper).toString.capitalize)
  // }

  def main(args: Array[String]) {
    val sc = new Scanner(System.in)
    val s = sc.nextLine()
    List({(_: Char).isLetterOrDigit}, {(_: Char).isLetter}, {(_: Char).isDigit}, {(_: Char).isLower}, {(_: Char).isUpper})
      .map(f => s.exists(f(_)).toString.capitalize)
      .foreach(println)
  }
}
