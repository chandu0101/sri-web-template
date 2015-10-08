package sri.templates.web.router

import sri.core.ReactElement
import sri.templates.web.components.HelloWeb
import sri.universal.components.View
import sri.universal.router.{NavigatorRoute, SriRouter, SriRouterConfig, StaticPage}

object AppRouter {

  object HomePage extends StaticPage

  object config extends SriRouterConfig {
    override val initialRoute: (StaticPage, NavigatorRoute) = defineInitialRoute(HomePage, "Home", HelloWeb())

    override def renderScene(route: NavigatorRoute): ReactElement = {
      View()(
        super.renderScene(route)
      )
    }

    override val notFound: (StaticPage, NavigatorRoute) = initialRoute
  }

  val router = SriRouter(config)
}
