#include <stdio.h>
#include <stdlib.h>
int main()
{
  FILE *fp;
  int id;
  char name[100];
  float salary;
  fp = fopen("slry.txt","w+");
  if(fp == NULL)
  {
    printf("/n File does not exist");
  }
  printf("Enter the ID:");
  scanf("%d",&id);
  fprintf(fp,"ID = %s \n" ,id);
  //
  printf("Enter the Name:");
  scanf("%d",&name);
  fprintf(fp,"Name = %d \n" ,name);
  //
  printf("Enter the Salary:");
  scanf("%f",&salary);
  fprintf(fp,"Salary = %2f \n" ,salary);
  //
  fclose(fp);
  return 0;
}
