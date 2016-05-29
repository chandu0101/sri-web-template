package sri.templates.web.screens

import sri.templates.web.styles.GlobalStyle
import sri.web.all._
import sri.web.vdom.htmltags._
import sri.core._
import sri.universal.components._
import sri.web.all._
import sri.web.vdom.htmltags._
import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.{UndefOr => U, undefined => undefined}
import scalacss.Defaults._
import sri.scalacss.Defaults._

object HomeScreen {

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() = div(className = GlobalStyle.flexOneAndCenter)(
      span(className = GlobalStyle.bigText)("Home Screen")
    )
  }

  val ctor = getTypedConstructor(js.constructorOf[Component], classOf[Component])

  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElementNoProps(ctor, key = key, ref = ref)

}
