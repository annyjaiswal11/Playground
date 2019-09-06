#include<stdio.h>
int main()
{
  float p,r,t,si,dis;
  scanf("%f\n%f\n%f",&p,&r,&t);
  si=(p*r*t)/100;
  dis=(si*0.02);
  printf("%0.2f\n%0.2f\n%0.2f\n%0.2f",si,(si+p),dis,(si+p-dis));
}