package models

class HelloWorld {
  def say(str: String = "hello, world!!!!") : String = str
  override def toString: String = "(" + say() + ")"
}