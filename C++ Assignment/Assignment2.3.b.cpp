/*
 * Assignment2.3.b.cpp
 *
 *  Created on: Sep 5, 2026
 *      Author: deepak battula
 */
#include<iostream>
using namespace std;

namespace GameMath {

    int clamp(int val, int min, int max) {
        if (val < min)
            return min;
        if (val > max)
            return max;
        return val;
    }

    double lerp(double a, double b, double t) {
        return a + (b - a) * t;
    }

}


namespace Physics {

    double clamp(double val, double min, double max) {
        if (val < min)
            return min;
        if (val > max)
            return max;
        return val;
    }

    double lerp(double a, double b, double t) {
        return a + (b - a) * t;
    }

}


int main() {

    cout << Physics::clamp(12.5, 0.0, 10.0) << endl;

    cout << GameMath::clamp(15, 0, 10) << endl;

    return 0;
}
