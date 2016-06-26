#include<stdio.h>


int main()
{
  int t1=1;
  int t2=1;
  int nt=1;
  int total=0;
  while(nt<=4000000)
  {
    if(nt%2==0)
    total+=nt;
    nt=t1+t2;
    t1=t2;
    t2=nt;
  }
  printf("%d\n",total );
}
