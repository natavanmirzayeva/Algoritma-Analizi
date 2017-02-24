#include <stdio.h>
#include <stdlib.h>

int power(int a,int b)
{
    int i;
    int carpim = 1;
    for(i=0;i<b;i++)
    {
        carpim = carpim*a;
    }
    return carpim;

}


int main()
{
    int a,b;
    scanf("%d %d",&a,&b);
    int cevap = power(a,b);
    printf("%d",cevap);
    return 0;
}
