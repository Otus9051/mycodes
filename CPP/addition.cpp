#include <iostream>
using namespace std;
class Addition
{
    private:
        int a, b, s;
    public:
        Addition()
        {
            a = 100;
            b = 200;
        }
        void sum()
        {
            s = a + b;
            cout << "The total value is = \n" << s;
        }
};

int main()
{
    Addition aObj;
    aObj.sum();
}