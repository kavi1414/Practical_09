object Q3 {

  def main(args: Array[String]): Unit = {

    val upperCaseConverter: String => String = input => input.toUpperCase
    val lowerCaseConverter: String => String = input => input.toLowerCase

    def applyFormat(name: String)(formatter: String => String): String = formatter(name)

    println(applyFormat("Benny")(upperCaseConverter))

    println(applyFormat("Niroshan")(name => {
      val firstPart = name.take(2).toUpperCase
      val secondPart = name.drop(2).toLowerCase
      firstPart + secondPart
    }))

    println(applyFormat("Saman")(lowerCaseConverter))

    println(applyFormat("Kumara")(name => {
      val firstChar = name.head.toUpper
      val middlePart = name.tail.init.toLowerCase
      val lastChar = name.last.toUpper
      firstChar + middlePart + lastChar
    }))
  }
}
