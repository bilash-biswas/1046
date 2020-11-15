#include<stdio.h>
int main()
{
    int a,b,z;
    scanf("%d",&a);
    scanf("%d",&b);
    if(b > a)
    {
        printf("O JOGO DUROU %d HORA(S)\n", b - a);
    }
    if(a == b)
    {
        printf("O JOGO DUROU 24 HORA(S)\n");
    }
    if(a > b)
    {
        z = 24 - a + b;
        printf("O JOGO DUROU %d HORA(S)\n", z);
    }
    return 0;
}
