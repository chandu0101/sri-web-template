package sri.templates.web.styles


import sri.scalacss.Defaults._
import sri.templates.web.components.TopNav

import scalacss.Defaults._
import scalacss.mutable.GlobalRegistry

object AppStyles {

  def load() = {
    GlobalRegistry.register(GlobalStyle,
      TopNav.styles)
    GlobalRegistry.addToDocumentOnRegistration()
  }
}
