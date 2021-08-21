#include <iostream>
class Employee
{
    protected:
                int salary;
};
class Programmer:public Employee
{
    public:
                int bonus;
                int setSalary(int s, int b)
                {
                    salary = s;
                    bonus = b;
                }
                int getSalary()
                {
                    salary = salary + bonus;
                    std::cout<<"Salary: "<<salary;
                }
};
int main()
{
    Programmer myObj;
    myObj.setSalary(50000, 15000);
    myObj.getSalary();
}