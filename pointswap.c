#include <stdio.h>
int swap(int*,int*);
int main()
{
    int num1 = 10, num2 = 20;
    printf("Before Swapping : ");
    printf("\n num1 value is %d",num1);
    printf("\n num2 value is %d",num1);
    swap(&num1,&num2);
    printf("\n After Swapping : ");
    printf("\n num1 value is %d",num1);
    printf("\n num2 value is %d \n",num1);
}
int swap(int *var1, int *var2)
{
    int temp;
    temp = *var1;
    *var1 = *var2;
    *var2 = temp;
}
