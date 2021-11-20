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
        int operator+ (student &no) {
            int s;
            s = tm + no.tm;
            return s;
            /* cout << "Total Marks of 2 Students is " << s << endl; */
        }
};

int main() {
    student s1, s2;
    int fsum;
    s1.get(); s2.get();
    s1.disp();
    s2.disp();
    fsum = s1 + s2;
    cout << "Total Marks of 2 Students is " << fsum << endl;
}