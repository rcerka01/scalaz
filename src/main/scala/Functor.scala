import scalaz.Functor
import scalaz.Scalaz._


object Functor extends App {
  //anything what can be maped (list, option, future, etc.)

  // F[_] type constructor. Must be replaced with real type
  def addInt[F[_]] (i: Int, toAdd: F[Int]) (implicit f: Functor[F]): F[Int] = {
    // functor can be maped
    f.map(toAdd)( _ + i)
  }

  println(
    addInt(6, 10.some)
  )

  println(
    addInt(3, List(1,2,3))
  )
}
