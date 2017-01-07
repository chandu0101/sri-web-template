package sri.web.template.screens

import sri.web.template.styles.GlobalStyle
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

  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, Unit] = null) = makeElementNoProps[Component](key = key, ref = ref)

}
