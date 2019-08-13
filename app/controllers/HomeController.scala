package controllers

import models._

import javax.inject._
import play.api._
import play.api.mvc._

import play.api.libs.json._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
  
  def explore() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.explore())
  }
  
  def tutorial() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.tutorial())
  }

  // `/helloworld`
  def helloWorld(msg: String) = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.helloworld(Model.helloWorld(msg)))
  }

  // `/stock`
  def stockGet(symbol: String, price: Double) = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.stock(Model.stockGet(symbol, price)))
  }

  // `POST /stock` (via `curl-test.sh`)
  def stockPost = Action { implicit request: Request[AnyContent] =>
    val json = request.body.asJson.get
    Model.stockPut(json)
    Ok
  }

  // `/person`
  def person(firstName: String, lastName: String, age: Int) = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.person(Model.person(firstName, lastName, age)))
  }

  // `/exception`
  def exception(msg: String) = Action { implicit request: Request[AnyContent] =>
    Model.throwException(msg)
    Ok
  }  
} // HomeController
