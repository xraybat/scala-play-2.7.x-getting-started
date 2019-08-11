/**
  * Created by psc on 7/4/17.
  */

package models

class HelloWorld {
  def say(str: String = "hello, world!!!!") : String = str
  override def toString: String = "(" + say() + ")"

} // HelloWorld