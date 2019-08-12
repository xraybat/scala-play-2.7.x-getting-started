package models

class Person(val firstName: String, val lastName: String, val age: Int) {
    override def toString: String = "(" + firstName + " " + lastName + ", " + age + ")"
}