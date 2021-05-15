#include <stdio.h>
#include <stdlib.h>
int main()
{
	FILE *fp1, *fp2;
	char fname1[100], fname2[100], c;
	printf("\n Enter the filename to open for reading: ");
	scanf("%s", fname1);
	fp1 = fopen(fname1, "r");
	if(fp1 == NULL)
	{
		printf("Cannot open file %s [ERROR:1]", fname1);
		exit(0);
	}
	printf("\n Enter the filename to open for writing: ");
	scanf("%s", fname2);
	fp2 = fopen(fname2, "W");
	if(fp2 == NULL)
	{
		printf("Cannot open file %s [ERROR:1]", fname2);
		exit(0);
	}
	c = fgetc(fp1);
	while(c != EOF)
	{
		fputc(c, fp2);
		c = fgetc(fp2);
	}
	printf("\n Contents copied from %s to %s", fname1, fname2);
	fclose(fp1);
	fclose(fp2);
	return 0;
}
