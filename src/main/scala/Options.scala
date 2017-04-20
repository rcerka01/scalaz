import scalaz.Scalaz._

object Options extends App {
  //none, some, option

  //normal
  println(
    (None: Option[Int]) map (_+1) getOrElse "cat"
  )

  //just add some or option to anything become an option
  case class MyInt(i: Int)
  val myInt = new MyInt(1).some
  println("myInt " + myInt)

  println("some " +
    3.some.getOrElse("dog")
  )

  println("none " +
    none.getOrElse("dog")
  )

  println(
    (6 < 10).option("Im here") //return Some[String]
  )

  println(
    (6 > 10).option("I'm too") //return None
  )

//    3.some <|*|> 2.some match {
//      case Some((a, b)) if a == b => println("match")
//      case Some((_, _)) => println("Dont' match")
//      case None => println("At least one is missing")
//    }
}
