import scalaz.Scalaz._

object Monoid extends App {

  println(
    1 |+| 2 |+| 3
  )

  println(
    "Hallo ".some |+| None |+| "Friends".some
  )

  val map1 = Map(
    1 -> List (1,2,3),
    2 -> List("a", "b"),
    3 -> List("aa", "bb"))
  val map2 = Map(
    1 -> List("z"),
    2 -> List("yyy", "zzz"))
  println(
    map1 |+| map2
  )

}
