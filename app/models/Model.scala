/**
  * Created by psc on 7/4/17.
  */

package models

import play.api.libs.json._

object Model {
  private val _helloworld = new HelloWorld
  //private val person = new Person("fred", "nerk", 44)

  def helloWorld(msg: String) : String = _helloworld.say(msg)

  def stockGet(symbol: String, price: Double): Stock = Stock(symbol, price)
  def stockPut(json: JsValue): Unit = {
    val s = json.as[Stock]
    println(s)
  }

  /*def throwException = throw new MyException("myException!!")
  def personDetails = person.toString*/
} // Model
