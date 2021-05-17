#include <stdio.h>
#include <stdlib.h>                                     // I just realized you need this lib.
int main()
{
  FILE *fp;
  int ch, w, l;
  char c, fname[100];
  printf("\n Enter the filename to open for reading: "); // Take file path from user
	scanf("%s", fname);
	fp = fopen(fname, "r");
  if(fp == NULL)                                        // Checks if invalid file or something
	{
		printf("\n Cannot open file %s", fname);
		exit(0);
	}
  ch = w = l = 0;
  while((c = fgetc(fp))!=EOF)
  {
    ch++;
    if(c == '\n' || c == '\0')                          // Check new line
    {
      l++;
    }
    if(c == ' ' || c == '\*' || c == '\n' || c == '\0') // Check other stuff
    {
      w++;
    }
  }
  if(c > 0)                                             // Increment stuff for count and stuff idfk
  {
    w++;
    l++;
  }
  printf("\n Total Characters = %d", c);
  printf("\n Total Words = %d", w);
  printf("\n Total Lines = %d", l);
  fclose(fp);
  return 0;
}
