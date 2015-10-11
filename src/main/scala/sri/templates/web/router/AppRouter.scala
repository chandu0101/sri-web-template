package sri.templates.web.router

import sri.core.ReactElement
import sri.templates.web.components.HelloWeb
import sri.universal.components.View
import sri.universal.router._

object AppRouter {

  object HomePage extends StaticPage

  object config extends UniversalRouterConfig {
    override val initialRoute: (StaticPage, NavigatorRoute) = defineInitialRoute(HomePage, "Home", HelloWeb())

    override def renderScene(route: NavigatorRoute): ReactElement = {
      View()(
        super.renderScene(route)
      )
    }

    override val notFound: (StaticPage, NavigatorRoute) = initialRoute
  }

  val router = UniversalRouter(config)
}
