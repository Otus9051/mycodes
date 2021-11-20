/* Object Return Type */
#include <iostream>
using namespace std;
class student{
    private:
        int tm;
    public:
        void get(){
            cout << "Enter the Total Marks --> ";
            cin >> tm;
        }
        void disp() {
            cout << " Total Marks --> " << tm << endl;
        }
        student operator+ (student &no) {
            student Temp;
            Temp.tm = tm + no.tm;
            return Temp;
            /* cout << "Total Marks of 2 Students is " << s << endl; */
        }
};

int main() {
    student s1, s2, s3, s4, finst;
    int fsum;
    s1.get(); s2.get(); s3.get(); s4.get();
    s1.disp();
    s2.disp();
    s3.disp();
    s4.disp();
    finst = s1 + s2 + s3 + s4;
    finst.disp();
}