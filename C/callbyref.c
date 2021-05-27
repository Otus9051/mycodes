#include <stdio.h>
int increment(int);
int main()
{
    int num = 20;
    printf("Before incrementing the number is %d \n",num);
    increment(num);
    printf("After incrementing the number is %d \n", num);
}
int increment(int var)
{
    var = var + 1;
    printf("Inside the increment function the number is %d \n",var);
}