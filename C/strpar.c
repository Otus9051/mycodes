/*Passing Structure Members Partially*/
#include <stdio.h>
struct student
{
    int roll;
    char name[20];
    int marks1;
    int marks2;
};
int add (int,int);
int main()
{
    struct student s1;
    printf("\n Enter roll : ");
    scanf("%d",&s1.roll);
    printf("\n Enter name : ");
    scanf("%s",s1.name);
    printf("\n Enter Marks(1) : ");
    scanf("%d",&s1.marks1);
    printf("Enter Marks(2)");
    scanf("%d",&s1.marks2);
    add(s1.marks1,s1.marks2);
    return 0;
}
int add(int tmp1, int tmp2)
{
    int s;
    s = tmp1 + tmp2;
    printf("\n Total Marks : %d",&s);
}