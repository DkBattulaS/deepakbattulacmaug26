/*
 * Assignment2.3.c.cpp
 *
 *  Created on: Sep 5, 2026
 *      Author: deepak battula
 */


#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;

int main() {

    int rows, cols;

    cout << "Enter rows: ";
    cin >> rows;

    cout << "Enter cols: ";
    cin >> cols;

    // Heap 2D array
    int** arr = new int*[rows];

    for (int i = 0; i < rows; i++) {
        arr[i] = new int[cols];
    }

    // Generate random tile values
    srand(time(0));

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            arr[i][j] = rand() % 5;
        }
    }

    // Display game map
    cout << "\n===== GAME MAP (" << rows << " x " << cols << ") =====\n";

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            cout << arr[i][j] << " ";
        }
        cout << endl;
    }

    // Legend
    cout << "\nLegend: 0=Grass  1=Water  2=Mountain  3=Forest  4=Dungeon\n";

    // Count each tile
    int count[5] = {0};

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            count[arr[i][j]]++;
        }
    }

    // Display tile counts
    cout << "\nTile Count:\n";
    cout << "  Grass    : " << count[0] << endl;
    cout << "  Water    : " << count[1] << endl;
    cout << "  Mountain : " << count[2] << endl;
    cout << "  Forest   : " << count[3] << endl;
    cout << "  Dungeon  : " << count[4] << endl;

    // Free memory
    for (int i = 0; i < rows; i++) {
        delete[] arr[i];
    }

    delete[] arr;

    return 0;
}
