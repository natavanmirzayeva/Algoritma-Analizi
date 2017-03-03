#include <stdio.h>
#include <stdlib.h>

int static sayac=0;

long pow_log(int x,int n)
{
    if(n==0)
    {
        sayac = sayac +1;
        return 1;
    }

    if(n==1)
    {
        sayac = sayac + 1;
        return x;
    }
    if((n%2) == 0)
    {
        sayac = sayac + 1;
        return pow(x*x,(n/2));
    }

    else
    {
        sayac = sayac +  1;
        return pow(x*x,(n/2))*x;

    }


}

long pow_linear(int x,int n)
{
    int i;
    int carpim = 1;
    for(i=0;i<n;i++)
    {
        carpim = carpim*x;
    }
    return carpim;

}



int main()
{
    int a,b;
    printf("Sayi ve Uss giriniz:");
    scanf("%d %d",&a,&b);

    long linear = pow_linear(a,b);
    long log = pow_log(a,b);




    printf("%d \n",linear);
    printf("%d \n",log);
    printf("%d",sayac);
    return 0;
}
