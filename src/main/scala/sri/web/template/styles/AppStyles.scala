package sri.web.template.styles


import sri.web.template.components.TopNav
import scalacss.Defaults._
import scalacss.internal.mutable.GlobalRegistry

object AppStyles {

  def load() = {
    GlobalRegistry.register(GlobalStyle,
      TopNav.styles)
    GlobalRegistry.addToDocumentOnRegistration()
  }
}
