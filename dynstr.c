#include <stdio.h>
#include <stdlib.h>
struct student
{
//int sr;
  char sname[30];
};
int main()
{
 struct student *ptr;
 int i, n;
 printf("Enter Student Serial : ");
 scanf("%d", &n);
 ptr = (struct student*)malloc(n * sizeof(struct student));
//for(i = 0; i < n; i++)
//{
//printf("Enter Name: ");
//scanf("%s", (ptr + i) -> sname);
//printf("Enter Serial: ");
//scanf("%d", (ptr + i) -> sr);
//}
//yes this is effed up well idk so the serial no printing is not working (segmentation fault duuuuuuuuuuuuuh) but i have a workaround, hah dont use it lmao
 for(i = 0; i < n; i++)
 {
   printf("Enter Name: ");
   scanf("%s", (ptr + i) -> sname);
 }
 printf("Displaying Info: \n");
 for(i = 0; i < n; i++)
 {
  printf("Name: %s \n", (ptr + i) -> sname);
//printf("Roll: %d \n", (ptr + i) -> sr);
 }
}
