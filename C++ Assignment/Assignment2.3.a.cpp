/*
 * Assignment2.3.a.cpp
 *
 *  Created on: Sep 5, 2026
 *      Author: deepak battula
 */


#include <iostream>
#include <string>

using namespace std;

class Entity {

    string name;
    int health;
    int level;
    string type;

public:
    Entity& setName(const string& name){
    	this->name=name;
    	return *this;
    }

    Entity& setHealth(int health){
    	this->health=health;
    	return *this;

    }
    Entity& setLevel(int level){
    	 this->level = level;

    	    return *this;
    }
    Entity& setType(const string& type){
    	this->type = type;

    	    return *this;
    }

    string getName() const {

        return name;
    }

    int getHealth() const{
    	return health;
    }

    int getLevel() const {

        return level;
    }

    string getType() const{
    	return type;
    }


    //function to display

    void displayInfo() const{
    	  cout << "Name   : " << name << endl;
    	    cout << "Health : " << health << endl;
    	    cout << "Level  : " << level << endl;
    	    cout << "Type   : " << type << endl;
    }
};


int main() {

    Entity player;

    player.setName("Aragorn")
          .setHealth(100)
          .setLevel(10)
          .setType("Player");

    Entity enemy;

       enemy.setName("Orc")
            .setHealth(60)
            .setLevel(5)
            .setType("Enemy");

       Entity item;

       item.setName("HealthPotion")
           .setHealth(0)
           .setLevel(1)
           .setType("Item");


       cout << "===== PLAYER =====" << endl;
       player.displayInfo();

       cout << endl;

       cout << "===== ENEMY =====" << endl;
       enemy.displayInfo();

       cout << endl;

       cout << "===== ITEM =====" << endl;
       item.displayInfo();

       cout << endl;

       cout << "Player Name   : " << player.getName() << endl;
       cout << "Player Health : " << player.getHealth() << endl;
       cout << "Player Level  : " << player.getLevel() << endl;
       cout << "Player Type   : " << player.getType() << endl;

    return 0;
}
