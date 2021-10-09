#include <iostream>
using namespace std;

class Addition {
    private:
        int n1, n2;
    public:
        void get();
        friend void add (Addition&);
};
void Addition::get() {
    cout << "Enter 1st Number: ";
    cin >> n1;
    cout << "Enter 2nd Number: ";
    cin >> n2;
}
void add(Addition &ad) {
    int s;
    s = ad.n1+ad.n2;
    cout << "The sum is " << s;
}

int main() {
    Addition aobj;
    aobj.get();
    add(aobj);
}
