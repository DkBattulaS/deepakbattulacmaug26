/*
 * Assignment2.Q2.cpp
 *
 *  Created on: Sep 4, 2026
 *      Author: deepak battula
 */
#include <iostream>
#include <string>

using namespace std;

class Patient {

    int patientId;
    string name;
    int age;
    string ward;
    const string bloodGroup;

public:

    // Constructor 1 - Default
    Patient()
        : patientId(0),
          name("Unknown"),
          age(0),
          ward("General"),
          bloodGroup("O+")
    {
        cout << "[Constructor] Default patient registered." << endl;
    }


    // Constructor 2 - Emergency admission
    Patient(int id, const string& name)
        : patientId(id),
          name(name),
          age(0),
          ward("Emergency"),
          bloodGroup("O+")
    {
        cout << "[Constructor] Emergency: " << name << endl;
    }


    // Constructor 3 - Full admission details
    Patient(int id,
            const string& name,
            int age,
            const string& ward,
            const string& bg)
        : patientId(id),
          name(name),
          age(age),
          ward(ward),
          bloodGroup(bg)
    {
        cout << "[Constructor] Full admission: " << name << endl;
    }


    // Destructor
    ~Patient() {

        cout << "[Destructor] Patient "
             << name
             << " discharged."
             << endl;
    }


    // Display patient record
    void displayRecord() const {

        cout << "Patient Record:" << endl;
        cout << "   ID        : " << patientId << endl;
        cout << "   Name      : " << name << endl;
        cout << "   Age       : " << age << endl;
        cout << "   Ward      : " << ward << endl;
        cout << "   Blood Grp : " << bloodGroup << endl;
    }


    // Transfer ward
    void transferWard(const string& newWard) {

        cout << "Ward Transfer: "
             << name
             << " -> "
             << newWard
             << endl;

        ward = newWard;
    }
};


int main() {

    cout << "===== STACK OBJECTS =====" << endl;


    // 1. One patient of each type

    Patient p1(
        1001,
        "Meera Joshi",
        34,
        "Cardiology",
        "B+"
    );


    Patient p2(
        1002,
        "Raj Patel"
    );

    Patient p3;
    cout << endl;

    // 2. Dynamic array of 4 patients
    cout << "===== DYNAMIC ARRAY =====" << endl;
    Patient* patients = new Patient[4];

    // 3. Display all 4
    cout << endl;

    for (int i = 0; i < 4; i++) {
        patients[i].displayRecord();
        cout << endl;
    }


    // 4. Transfer one patient's ward
    patients[0].transferWard("ICU");
    cout << endl;

    // 5. Delete dynamic array
    cout << "===== DELETING ARRAY =====" << endl;

    delete[] patients;
    cout << endl;
    cout << "===== END OF MAIN =====" << endl;
    return 0;
}
