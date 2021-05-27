//Write a program to store and print the roll no, name, age and marks of a student using structure
#include <stdio.h>
struct student
{
  int sroll;
  char sname[20];
  int sage;
  int stotal;
}st;
int main()
{
  printf("\n Enter the Roll: ");
  scanf("%d",&st.sroll);
  printf("\n Enter the Name: ");
  scanf("%s",st.sname);
  printf("\n Enter the Age: ");
  scanf("%d",&st.sage);
  printf("\n Enter the Total Marks: ");
  scanf("%d",&st.stotal);
  printf("\n Roll: %d", st.sroll);
  printf("\n Name: %s", st.sname);
  printf("\n Age: %d", st.sage);
  printf("\n Total Marks: %d \n", st.stotal);
  return 0;
}
