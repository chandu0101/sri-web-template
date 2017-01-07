package sri.web.template

import org.scalajs.dom
import sri.web.template.routes.AppRouter
import sri.web.template.styles.AppStyles
import sri.web.ReactDOM

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

object WebApp extends JSApp {


  @JSExport
  override def main(): Unit = {
    AppStyles.load()
    ReactDOM.render(AppRouter.router, dom.document.getElementById("app"))
  }

}
