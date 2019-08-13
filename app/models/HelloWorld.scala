package models

class HelloWorld(val msg: String = "it's a great day!") {
  override def toString: String = msg
}