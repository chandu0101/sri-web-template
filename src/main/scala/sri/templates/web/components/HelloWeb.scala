package sri.templates.web.components

import sri.core._
import sri.universal.components._
import sri.universal.styles.SriStyleSheet
import sri.web.all._

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

object HelloWeb {

  @ScalaJSDefined
  class Component extends ReactComponent[Unit, Unit] {
    def render() = {
      View(style = styles.container)(
        Text(style = styles.text)(s"Welcome to Sri Web"),
        Image(style = styles.image, source = ImageSource(uri = "http://www.scala-js.org/images/scala-js-logo-256.png"))(),
        Text(style = styles.text)("Scala.js - Future of app development!")
      )
    }
  }

  object styles extends SriStyleSheet {

    val container = style(flexOne,
      backgroundColor := "rgb(171, 54, 54)",
      justifyContent.center,
      alignItems.center)

    val image = style(width := 256, height := 256, margin := 20)

    val text = style(fontWeight._500,
      fontSize := 18,
      color := "#E0DFDF")

  }

  val factory = getComponentFactory(js.constructorOf[Component], classOf[Component])

  def apply(key: js.UndefOr[String] = js.undefined, ref: js.Function1[Component, _] = null) = createElementNoProps(factory, key = key, ref = ref)
}