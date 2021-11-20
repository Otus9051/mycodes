/* Object Return Type */
#include <iostream>
using namespace std;
class student{
    private:
        int tm;
    public:
        student(){
            tm = 0;
        }
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
        }
};

int main() {
    student finst;
    int fsum;
    student st[5];
    for (int i = 0; i < 5; i++) {
        st[i].get();
    }
    for (int i = 0; i < 5; i++) {
        st[i].disp();
    }
    for (int i = 0; i < 5; i++) {
        finst = finst + st[i];
    }
    finst.disp();
}