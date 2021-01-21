

object main {
  
  def divide(x: Double): Double = (x/10)
  def divideyes(x: Double): Maybe[Double] = Yes(x/20)
  
  def main(args: Array[String]): Unit = {

    
     println("Zadanie 1:")

    def numGenerator = for {
        a <- Iterator.from(1)
        b <- 1 until a+1 if a%b == 0
    } yield (a,b)

    numGenerator take 20 foreach println

    println()
    val buffered = numGenerator.buffered

    for ( i <- 1 to 20){
      println(buffered.next())
    }
    
    println("Zadanie 2:")
    println()
    val no = No()
    val yes = Yes(150.5)
    println(no.map(divide))
    println(yes.map(divide))
    println(yes.flatMap(divideyes))
    
  }
}