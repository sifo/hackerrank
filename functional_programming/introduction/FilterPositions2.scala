import scala.annotation.tailrec

def f(arr: List[Int]): List[Int] = {
  @tailrec
  def aux(l: List[Int], acc: List[Int]): List[Int] = {
    l match {
      case hd :: nx :: rest => aux(rest, acc :+ nx)
      case _ => acc
    }
  }
  aux(arr, List())
}
