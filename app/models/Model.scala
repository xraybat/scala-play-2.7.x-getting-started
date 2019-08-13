package models

import play.api.libs.json._

object Model {
  private val _helloworld = new HelloWorld

  def helloWorld(msg: String): String = new HelloWorld(msg).toString

  def stockGet(symbol: String, price: Double): Stock = Stock(symbol, price)
  def stockPut(json: JsValue): Unit = println(json.as[Stock])

  def person(firstName: String, lastName: String, age: Int): Person = new Person(firstName, lastName, age)

  def throwException = throw new MyException("myException!!")

} // Model
