
import java.util.Scanner

object SwapCase {

  def main(args: Array[String]) {
    val sc = new Scanner(System.in)
    val input = sc.nextLine()
    val res = input.map(x => if(x.isUpper) x.toLower else x.toUpper)
    println(res)
  }
}
