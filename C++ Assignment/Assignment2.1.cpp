//============================================================================
// Name        : C++.cpp
// Author      : Deepak
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Product{
	int ProductId;
	string name;
	double price;
	int quantity;

public:
	string getName() const{
				return name;
			}

	//member functions
	void acceptDetails(){
		cout<<"Enter ProductID - "<<endl;
		cin>>ProductId;

		cout<<"Enter Name - "<<name<<endl;
		cin>>name;

		cout<<"Enter Price - "<<price<<endl;
		cin>>price;

		cout<<"Quantity - "<<quantity<<endl;
		cin>>quantity;


	}
	void displayDetails() const{


		cout<<ProductId<<"  "<<name<<"    "<<price<<"     "<<quantity<<"     "<< totalValue()<<"   "<<endl;

	}
	double totalValue() const{
		double total;
		total = price*quantity;
		return total;

	}
	bool isLowStock(int threshold) const{
		return quantity<threshold;

	}
};

int main(){
	Product proArr[5];
	for(int i=0;i<5;i++){
		proArr[i].acceptDetails();

	}
	cout<<"===== INVENTORY REPORT ====="<<endl;
	cout<<"ID" << "  "<<"Name"<<"  "<<"Price"<<"  "<<"Qty"<<"  "<<"Total value"<<endl;
	for(int i=0;i<5;i++){
		proArr[i].displayDetails();
		proArr[i].totalValue();
	}

	//for the last point


	int highestIndex=0;
	for(int i=1; i<5;i++){
		if(proArr[i].totalValue()> proArr[highestIndex].totalValue()){
			highestIndex=i;
		}
	}
	cout << "Highest Value Product : "
	     << proArr[highestIndex].getName()
	     << " (Rs. " << proArr[highestIndex].totalValue() << ")" << endl;

	int threshold;

	cout << "Enter stock threshold: ";
	cin >> threshold;

	for(int i = 0; i < 5; i++) {

	    if(proArr[i].isLowStock(threshold)) {

	        cout << "Low Stock (threshold: "
	             << threshold << ") : "
	             << proArr[i].getName()
	             << endl;
	    }
	}

}
