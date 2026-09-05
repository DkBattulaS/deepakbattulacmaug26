#include <iostream>
#include <string>
#include <vector>
#include <utility>

using namespace std;

// Type aliases
using Header = pair<string, string>;
using HeaderList = vector<Header>;
using Port = unsigned int;
using IPAddress = string;

// Traditional typedef
typedef unsigned long long RequestId;


// Function to print all headers
void printHeaders(const HeaderList& headers) {

    for (const Header& header : headers) {
        cout << header.first << " : " << header.second << endl;
    }
}


int main() {

    // Create HeaderList
    HeaderList headers = {
        {"Content-Type", "application/json"},
        {"Authorization", "Bearer eyJhbGci..."},
        {"Accept-Language", "en-US"}
    };

    // Server information
    Port serverPort = 8080;
    IPAddress serverIP = "192.168.1.10";

    // Request ID
    RequestId requestId = 1748293847;

    // Print request information
    cout << "Request ID    : " << requestId << endl;
    cout << "Server Port   : " << serverPort << endl;
    cout << endl;

    // Print headers
    cout << "Headers:" << endl;
    printHeaders(headers);

    return 0;
}