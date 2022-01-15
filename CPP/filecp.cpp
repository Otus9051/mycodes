#include <iostream>
#include <fstream>
using namespace std;

int main() {
    string line;
    ifstream in_file {"test.txt"};
    ofstream out_file {"test2.txt"};

    if (in_file && out_file) {
        while (getline(in_file, line)) {
            out_file << line << endl;
        }

        cout << "File copied successfully." << endl;
    }
    else {
        cout << "Error opening file" << endl;
    }

    in_file.close();
    out_file.close();

    return 0;
}