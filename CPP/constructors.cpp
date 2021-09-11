#include <iostream>
using namespace std;

class Car
{
    private:
        string brand;
        string model;
        int year;
    
    public:
        // Constructer Overloading

        Car() // Zero Level Constructer
        {
            brand = "QWERTY";
            model = "UIOP";
            year = 1234;
        }

        Car(string x, string y, int z) // Overloaded Constructor / Parameterized Constructor
        {
            brand = x;
            model = y;
            year = z;
        }

        Car(Car &carRef) // Copy Constructer
        {
            brand = carRef.brand;
            model = carRef.model;
            year = carRef.year;
        }

        void Display()
        {
            cout << "Brand of the car is " << brand << endl;
            cout << "Model of the car is " << model << endl;
            cout << "YOM of the car is " << year << endl;
        }
};

int main()
{
    string a;
    string b;
    int c;
    Car carObj1("BMW", "X5", 1999);
    Car carObj2("Ford", "Mustang", 1969);
    cout << "Enter the Car Brand: ";
    cin >> a;
    cout << "Enter the Car Model: ";
    cin >> b;
    cout << "Enter the Car YOM: ";
    cin >> c;
    Car carObj3(a, b, c);
    Car carObj4(carObj1);
    Car carObj5;
    //
    cout << "\n ---------------------------------- \n";
    carObj1.Display();
    cout << "\n ---------------------------------- \n";
    carObj2.Display();
    cout << "\n ---------------------------------- \n";
    carObj3.Display();
    cout << "\n ---------------------------------- \n";
    carObj4.Display();
    cout << "\n ---------------------------------- \n";
    carObj5.Display();
    cout << "\n ---------------------------------- \n";


}