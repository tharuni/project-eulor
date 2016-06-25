#include <stdio.h>

//Multiples of 3 & 5
int a[10];
int count = 0;
int sum = 0;
int main()
{
    for(int i=0;i<1000;i++)
    {
      if(i%3==0 || i%5==0)
      {
        sum = sum + i;
      }
      count++;
    }
    printf("%d",sum);
}
