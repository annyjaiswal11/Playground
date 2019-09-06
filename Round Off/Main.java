#include<stdio.h>
int main()
{
  float n;
  scanf("%f",&n);
  printf("%0.0f\n%0.1f\n%0.1f",n,ceil(n),floor(n));
}