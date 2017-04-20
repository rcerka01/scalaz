object Typeclasses extends App {

  trait OffspringName[T] {
    def getName(t: T): String
  }

  def getName[T](t: T)(implicit i: OffspringName[T]) = {
    i.getName(t)
  }

  class Cat
  class Dog

  implicit object CatName extends OffspringName[Cat] {
    def getName(cat: Cat) = "Kiity"
  }

  implicit object DogName extends OffspringName[Dog] {
    def getName(dog: Dog) = "Puppy"
  }

  println(
    getName(new Cat)
  )
  println(
    getName(new Dog)
  )
}
