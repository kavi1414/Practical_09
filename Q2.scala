object Q2 {

  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Error: Please provide one and only one integer as an argument.")
      System.exit(1)
    }

    try {
      val number = args(0).toInt

      val describeNumber: Int => String = num => num match {
        case x if x <= 0 => "Negative/Zero is input"
        case x if x % 2 == 0 => "Even number is given"
        case _ => "Odd number is given"
      }

      println(describeNumber(number))

    } catch {
      case _: NumberFormatException =>
        println("Error: Input must be a valid integer.")
    }
  }
}
