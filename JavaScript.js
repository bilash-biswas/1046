var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
input = input.replace('\n',' ');
var lines = input.split(' ');
var a = parseInt(lines.shift());
var b = parseInt(lines.shift()); 
var z;
    if(b > a)
    {
        console.log("O JOGO DUROU " + (b - a) + " HORA(S)");
    }
    if(a == b)
    {
        console.log("O JOGO DUROU 24 HORA(S)");
    }
    if(a > b)
    {
        z = 24 - a + b;
        console.log("O JOGO DUROU " + z + " HORA(S)");
    }
