package sri.templates.web.components

import sri.core._
import sri.web.all._
import sri.web.vdom.htmltags._

import scala.scalajs.js

object Button {

  val Component = (props: Props,children : ReactElement) => {
    div(className = props.style, onClick = (e: ReactMouseEventH) => props.onPress())(children)
  }

  case class Props(style: String, onPress: () => _)

  def apply(style: String, onPress: () => _,key : js.UndefOr[String] = js.undefined)(children : ReactNode*) = createStatelessFunctionElementWithChildren(Component, Props(style, onPress),key = key)(children : _*)

}
