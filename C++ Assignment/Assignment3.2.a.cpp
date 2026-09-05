/*
 * Assignment3.2.a.cpp
 *
 *  Created on: Sep 5, 2026
 *      Author: deepak battula
 */

#include <iostream>

using namespace std;

class Texture {

    string name;
    int width;
    int height;

public:

    Texture(string n, int w, int h) {
        name = n;
        width = w;
        height = h;

        cout << "[Texture Loaded]" << endl;
    }

    ~Texture() {
        cout << "[Texture Released]" << endl;
    }

    void display() const {
        cout << "Dimensions: " << width << " x " << height << endl;
    }
};

int main() {

    Texture t1("Background", 1920, 1080);

    t1.display();

    return 0;
}
