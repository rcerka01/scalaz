// PARAMETRIC POLYMORPHISM
// A can be any value
object PolymorphismParametric extends App {
  def head[A](l: List[A]): A = l.head

  // 1.
  println(head(List(1, 2, 3)))

  // 2.
  case class car(make: String)

  println(head(List("Alfa", "BMW", "Opel")))
}

// SUBTYPE POLYMORPHISM
trait PlusSubtype[A] {
  def plus(a: A): A
}

object PolimorphismSubtype extends App {
  // it is now possible to call function recursively
  // def plus[A]](a1:A, a2:A) =  a1.plus(a2)
  def plus[A <: PlusSubtype[A]](a1: A, a2: A) = a1.plus(a2)
}

// AD-HOC POLYMORPHISM
// implicits
trait PlusAdHoc[A] {
  def plus(a: A, a2: A): A
}

object PolimorphismAdHoc extends App {
  def plus[A: PlusAdHoc](a1: A, a2: A): A = implicitly[PlusAdHoc[A]].plus(a1, a2)
}
