//============================================================================
// Name        : Assignment3.cpp
// Author      : Deepak
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

enum class HttpStatus {
 OK = 200,
 Created = 201,
 BadRequest = 400,
 Unauthorized = 401,
 NotFound = 404,
 ServerError = 500
};

void handleResponse(HttpStatus status, const string& endpoint){
	switch(static_cast<int>(status)){
	case 200:
	        cout << "[GET " << endpoint << "] -> 200 OK : Request successful" << endl;
	        break;

	    case 201:
	        cout << "[GET " << endpoint << "] -> 201 Created : Resource created" << endl;
	        break;

	    case 400:
	        cout << "[GET " << endpoint << "] -> 400 Bad Request : Bad request" << endl;
	        break;

	    case 401:
	        cout << "[GET " << endpoint << "] -> 401 Unauthorized : Authentication required" << endl;
	        break;

	    case 404:
	        cout << "[GET " << endpoint << "] -> 404 Not Found : Endpoint does not exist" << endl;
	        break;

	    case 500:
	        cout << "[GET " << endpoint << "] -> 500 Server Error : Internal server error - retry later" << endl;
	        break;

	    default:
	        cout << "Invalid HTTP status" << endl;
	}

}
int main() {

     	handleResponse(HttpStatus::OK, "/api/users");
	    handleResponse(HttpStatus::Created, "/api/products");
	    handleResponse(HttpStatus::NotFound, "/api/orders");
	    handleResponse(HttpStatus::ServerError, "/api/payment");

    return 0;
}
