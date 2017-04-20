//import scalaz.Scalaz._
import Equals._

object Compare extends App {
  //  compiler not complaning to compare diferent types
  if ("1" == 1) println("hallo") else println("not hallo")
  // Scalaz style. Comparing only within the same type
  if ("1" === "") println("hallo") else println("not hallo")
}

//implementation used in ScalaZ
object Equals {
  implicit def toEqual[A](a: A): Equal[A] = new Equal(a)
  class Equal[A](a: A) {
    def ===(b:A) = a == b
  }
}
