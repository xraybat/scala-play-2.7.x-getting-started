package models

class HelloWorld(msg: String = "it's a great day!") {
  override def toString: String = msg
}