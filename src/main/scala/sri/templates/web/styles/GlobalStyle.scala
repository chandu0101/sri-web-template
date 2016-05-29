package sri.templates.web.styles

import scalacss.Defaults._

object GlobalStyle extends StyleSheet.Inline {

  import dsl._

  val flexOneAndCenter = style(
    display.flex,
    flexDirection.column,
    flex := "1",
    alignItems.center,
    justifyContent.center)

  val vertical = style(display.flex, flexDirection.column)

  val horizontal = style(display.flex, flexDirection.row)

  val flexOneAndDirectionRow = style(horizontal, flex := "1")

  val flexOneAndDirectionVertical = style(vertical, flex := "1")


  val bigText = style(fontWeight._500,
    fontSize(1.5.em))

}
