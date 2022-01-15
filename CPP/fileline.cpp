#include <iostream>
#include <fstream>
#include <cstring>
#include <string>
using namespace std;

int main() {
    int count = 0;
    int linesz = 0;
    int ch = 0;
    string line;
    ifstream in_file {"test.txt"};

    if (in_file) {
        while (getline(in_file, line)) {
            linesz = size(line);
            ch += linesz;
            count++;
        }

        cout << "File has " << count << " lines." << endl;
        cout << "File has " << ch << " characters." << endl;
    }
    else {
        cout << "Error opening file" << endl;
    }
    return 0;
}