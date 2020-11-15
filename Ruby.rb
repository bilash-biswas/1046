a,b = gets().chomp().split(' ');
a = a.to_i
b = b.to_i
if b > a
    printf("O JOGO DUROU %d HORA(S)\n", b - a);
end
if a == b
    printf("O JOGO DUROU 24 HORA(S)\n");
end
if a > b
    z = 24 - a + b;
    printf("O JOGO DUROU %d HORA(S)\n", z);
end
