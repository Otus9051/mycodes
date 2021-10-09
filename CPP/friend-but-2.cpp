#include <iostream>
using namespace std;

class B;
class A {
    private:
        int n1;
    public:
        A() {
            n1 = 10;
        }
        friend void add (A&, B&);
};

class B {
    private:
        int n2;
    public:
        B() {
            n2 = 10;
        }
        friend void add (A&, B&);
};

void add(A &ao, B &bo) {
    int s;
    s = ao.n1+bo.n2;
    cout << "The sum is " << s;
}

int main() {
    A aobj;
    B bobj;
    add(aobj, bobj);
}
