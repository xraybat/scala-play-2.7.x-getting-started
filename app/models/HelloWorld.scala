package models

class HelloWorld {
  def say(str: String = "it's a great day!") : String = str
  override def toString: String = say()
}