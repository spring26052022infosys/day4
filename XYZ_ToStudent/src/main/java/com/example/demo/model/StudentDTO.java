package com.example.demo.model;

public class StudentDTO {
private int roll;
private String name;
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "StudentDTO [roll=" + roll + ", name=" + name + ", getRoll()=" + getRoll() + ", getName()=" + getName()+
			"]";
}

}
