#include <iostream>

class B;
class A {
    private:
        int n1;
    public:
        A(){
            n1 = 10;
        }

        friend class B;
};

class B {
    private:
        int n2;
    public:
        B(){
            n2 = 10;
        }
    void addition(A &x) {
        int s;
        s = x.n1 + n2;
        cout << "The sum is" << s;
    }
};

int main() {
    A aobj;
    B bobj;

    bobj.addition(aobj);
}
