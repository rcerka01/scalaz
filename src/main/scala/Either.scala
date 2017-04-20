import scalaz.Scalaz._
import scalaz.{-\/, \/, \/-}

object Either extends App {
  println("int right string " +
    1.right[String]
  )

  println("int right int " +
    1.right[Int]
  )

  println("string left int "
    .left[Int]
  )

  // try catch
  // right
  println("try catch right " +
    \/.fromTryCatchNonFatal("123".toInt)
  )

  // left
  println("try catch left ('123x' toInt)" +
    \/.fromTryCatchNonFatal("123x".toInt)
  )

  // raight value has a map
  \/.fromTryCatchNonFatal("123".toInt).map(println)

  // get or else
  val more = \/-(5)
  val more2 = -\/(5)

  println(
    more.getOrElse("pig")
  )
  println(
    more2.getOrElse("pig")
  )
}
