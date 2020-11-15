using System.IO;
using System;

class Program
{
    static void Main()
    {
    int a,b,z;
    var p = Console.ReadLine().Split();
    a = int.Parse(p[0]);
    b = int.Parse(p[1]);
    if(b > a)
    {
    Console.WriteLine("O JOGO DUROU " + (b - a) + " HORA(S)");
    }
    if(a == b)
    {
        Console.WriteLine("O JOGO DUROU 24 HORA(S)");
    }
    if(a > b)
    {
        z = 24 - a + b;
        Console.WriteLine("O JOGO DUROU " + z + " HORA(S)");
    }
    Console.ReadLine();
  }
}
