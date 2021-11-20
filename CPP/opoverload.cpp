#include <iostream>
using namespace std;
class num{
    private:
        int x;
    public:
        num(){
            x = 100;
        }
        void disp(){
            cout << "\n X is " << x;
        }
        void operator++() {
            x = x + x * 10/100;
        }
};

int main() {
    num n1;
    ++n1;
    n1.disp();
}