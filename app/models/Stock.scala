package models

case class Stock(symbol: String, price: Double)

object Stock {
  import play.api.libs.json._

  implicit object StockFormat extends Format[Stock] {
    // convert from json to Stock object
    def reads(json: JsValue): JsResult[Stock] = {
      val symbol = (json \ "symbol").as[String]
      val price = (json \ "price").as[Double]
      JsSuccess(Stock(symbol, price))
    }

    // convert from Stock object to json
    def writes(s: Stock): JsValue = {
      val stockAsList = Seq("symbol" -> JsString(s.symbol),
                            "price" -> JsNumber(s.price))
      JsObject(stockAsList)
    }
  } // StockFormat
} // Stock