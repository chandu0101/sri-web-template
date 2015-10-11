package sri.templates.web

import org.scalajs.dom
import sri.templates.web.router.AppRouter
import sri.web.ReactDOM

import scala.scalajs.js.Dynamic.{global => g, literal => json}
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

object WebApp extends JSApp {


  @JSExport
  override def main(): Unit = {

    ReactDOM.render(AppRouter.router, dom.document.getElementById("app"))
  }

}
