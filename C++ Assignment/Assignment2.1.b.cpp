/*
 * Assignment2.1.b.cpp
 *
 *  Created on: Sep 4, 2026
 *      Author: deepak battula
 */




#include <iostream>
using namespace std;

double reorderCost(int qty, double unitPrice){
	double cost;
	cost= qty*unitPrice;
	return cost;
}
double reorderCost(double qty, double unitPrice){
	int cost;
		cost= qty*unitPrice;
		return cost;

}

double reorderCost(int qty, double unitPrice, double taxRate){
	double cost;
	cost = qty * unitPrice * (1 + taxRate / 100);
		return cost;

}

double applyDiscount(double price, double discountPercent = 10.0){
	 return price - (price * discountPercent / 100);
}
int main(){

	 double cost1 = reorderCost(10, 50.0);
	 cout << "Cost 1 = " << cost1 << endl;

	 double cost2 = reorderCost(19.87, 50.0);
	 cout << "Cost 2 = " << cost2 << endl;

	 double cost3 = reorderCost(3,9.87, 50.0);
	 cout << "Cost 3 = " << cost3 << endl;

	 // 4. Calls applyDiscount(double, double)
	    double price1 = applyDiscount(1000.0, 20.0);
	    cout << "Discounted Price = " << price1 << endl;


	    // 5. Calls applyDiscount(double) using default 10%
	    double price2 = applyDiscount(1000.0);
	    cout << "Discounted Price (default 10%) = " << price2 << endl;

	    return 0;

}
