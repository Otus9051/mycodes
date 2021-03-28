#include <stdio.h>
#include <stdlib.h>
int main()
{
  int *ch, n, i, s = 0;
  printf("Enter the value for input");
  scanf("%d", &n);
  ch = (int *) malloc(n * sizeof(int));
  for(i = 0; i < n; i++)
  {
    printf("Enter the value : ");
    scanf("%d",(ch + i));
  }
  for (i = 0; i < n; i++)
  {
    s = s + *(ch + i);
  }
  printf("Total Marks is %d", s);
  return 0;
}
