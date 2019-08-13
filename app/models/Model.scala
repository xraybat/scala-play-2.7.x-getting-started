package models

import play.api.libs.json._

object Model {
  private val _helloworld = new HelloWorld
  private val _person = new Person("fred", "nerk", 44)

  def helloWorld(msg: String) : String = _helloworld.say(msg)

  // as model properties??
  def stockGet(symbol: String, price: Double): Stock = Stock(symbol, price)
  def stockPut(json: JsValue): Unit = println(json.as[Stock])

  // as model properties??
  def person = _person

  def throwException = throw new MyException("myException!!")

} // Model
