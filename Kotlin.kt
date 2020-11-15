import java.util.Scanner

fun main(args: Array<String>){
    val read = Scanner(System.`in`);
    var a = read.nextInt()
    var b = read.nextInt()
    if(b > a)
    {
        println("O JOGO DUROU " + (b - a) + " HORA(S)");
    }
    if(a == b)
    {
        println("O JOGO DUROU 24 HORA(S)");
    }
    if(a > b)
    {
        var z = 24 - a + b;
        println("O JOGO DUROU " + z + " HORA(S)");
    }
}

    
