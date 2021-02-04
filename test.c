#include <stdio.h>
#include <curses.h>
struct student
{
	char name [50];
	int age;
};
int display(struct student);
int main()
{
	struct student s1;
	printf("Enter name:");
	scanf("%s",s1.name);
	printf("Enter age:");
	scanf("%d",&s1.age);
	display(s1);
}
int display(struct student s)
{
	printf("\n Displaying Information");
	printf("\n Name : %s", s.name);
	printf("\n Age : %d",s.age);
	return 0;	
}
