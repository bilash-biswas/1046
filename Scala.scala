object Main {
  def main(args:Array[String]){ 
   var Array(a,b) = scala.io.StdIn.readLine().split(" ").map(_.toInt)
   if(b > a)
    {
        println("O JOGO DUROU %d HORA(S)".format(b - a))
    }
    if(a == b)
    {
        println("O JOGO DUROU 24 HORA(S)")
    }
    if(a > b)
    {
        var z = 24 - a + b
        println("O JOGO DUROU %d HORA(S)".format(z))
    }
  }
}
