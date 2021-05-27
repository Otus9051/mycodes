#include <stdio.h>
#include <stdlib.h>
int main()
{
  int vowels = 0;
  int cons = 0;
  char c;
  FILE *fp;
	fp = fopen("mycodes.txt", "r");
  while(c = fgetc(fp) !=EOF)
  {
    // Check Vowels
    if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U')
    {
      vowels++;
    }
    //if (c != 'a' || c != 'A' || c != 'e' || c != 'E' || c != 'i' || c != 'I' || c != 'o' || c != 'O' || c != 'u' || c != 'U')
    //{
    //  cons++;
   // }
  }
  printf("\n Total number of vowels %d", vowels);
  // printf("\n Total number of consonants %d", cons);
  return 0;
}
