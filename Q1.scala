object Q1 {
  
  def main(args: Array[String]): Unit = {
    
    val interest: Double => Double = deposit => deposit match {
      case d if d <= 20000 => d * 0.02
      case d if d > 20000 && d <= 200000 => d * 0.04
      case d if d > 200000 && d <= 2000000 => d * 0.035
      case d if d > 2000000 => d * 0.065
    }
    
    println(f"Interest on Rs. 15000: ${interest(15000)}%.2f")
    println(f"Interest on Rs. 150000: ${interest(150000)}%.2f")
    println(f"Interest on Rs. 1500000: ${interest(1500000)}%.2f")
    println(f"Interest on Rs. 2500000: ${interest(2500000)}%.2f")
  }
}
