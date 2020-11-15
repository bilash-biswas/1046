a = io.read("*n")
b = io.read("*n")
if(b > a)then
    print("O JOGO DUROU "..(b - a).." HORA(S)")
end
if(a == b)then
    print("O JOGO DUROU 24 HORA(S)")
end
if(a > b)then
    z = 24 - a + b
    print("O JOGO DUROU "..z.." HORA(S)")
end
