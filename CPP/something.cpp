#include <iostream>

// Base Class

class Shape
    {
        public:
            void setWidth(int w)
                {
                    width = w;
                }
            void setHeight(int h)
                {
                    height = h;
                }
        
        protected:
            int width;
            int height;
    };

// Derived Class

class Rectangle: public Shape
    {
        public:
            int getArea()
                {
                    return (width * height);
                }
    };

int main(void)
    {
        Rectangle Rect;

        Rect.setWidth(5);
        Rect.setHeight(7);

        // Print le Area

        cout << "Total Area" << Rect.getArea() << endl;

        return 0;
    }