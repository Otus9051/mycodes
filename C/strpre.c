#include <stdio.h>
#include <string.h>
struct student
{
    int sroll;
    char sname[20];
    int stotal;
};
int main()
{
    struct student st;
    st.sroll = 1;
    strcpy(st.sname, "Example");
    st.stotal = 700;
    printf("\n Roll => %d", st.sroll);
    printf("\n Name => %s", st.sname);
    printf("\n Total Marks => %d", st.stotal);
    return 0;
}
