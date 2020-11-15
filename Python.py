a,b = input().split()
a = int(a)
b = int(b)
if b > a :
    print("O JOGO DUROU {} HORA(S)".format(b - a))
if a == b :
    print("O JOGO DUROU 24 HORA(S)")
if a > b :
    z = 24 - a + b
    print("O JOGO DUROU {} HORA(S)".format(z))

