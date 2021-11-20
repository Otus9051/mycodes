#include <iostream>
class Time {
    private:
        int hour;
        int minute;
        int second;
    public:
        void get(){
            std::cout << "Enter hour: ";
            std::cin >> hour;
            std::cout << "Enter minute: ";
            std::cin >> minute;
            std::cout << "Enter second: ";
            std::cin >> second;
        }
        void show(){
            std::cout << hour << ":" << minute << ":" << second << std::endl;
        }
        Time operator+(const Time &t){
            Time temp;
            temp.hour = hour + t.hour;
            temp.minute = minute + t.minute;
            temp.second = second + t.second;

            if(temp.second >= 60){
                temp.second -= 60;
                temp.minute += 1;
            }
            if(temp.minute >= 60){
                temp.minute -= 60;
                temp.hour += 1;
            }
            return temp;
        }
};
int main(){
    Time t1, t2, t3;
    t1.get();
    t2.get();
    t3 = t1 + t2;
    t1.show();
    t2.show();
    t3.show();
    return 0;
}