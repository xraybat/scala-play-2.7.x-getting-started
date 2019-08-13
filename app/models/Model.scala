package models

import play.api.libs.json._

object Model {
  private val _helloworld = new HelloWorld
  private val _person = new Person("fred", "nerk", 44)

  def helloWorld(msg: String) : String = _helloworld.say(msg)

  def stockGet(symbol: String, price: Double): Stock = Stock(symbol, price)
  def stockPut(json: JsValue): Unit = {
    val s = json.as[Stock]
    println(s)
  }

  def person = (_person.firstName, _person.lastName, _person.age)
  def throwException = throw new MyException("myException!!")

} // Model
