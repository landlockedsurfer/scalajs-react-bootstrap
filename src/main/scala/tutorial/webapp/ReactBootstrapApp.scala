package tutorial.webapp

import org.scalajs.dom

import scala.scalajs.js.JSApp
import dom.document
import japgolly.scalajs.react._
import chandu0101.scalajs.react.components.reactbootstrap._

object ReactBootstrapApp extends JSApp {

  def main(): Unit = {
    import japgolly.scalajs.react.vdom.all._

    val AlertMessage = ReactComponentB[String]("AlertMessage").render(
      msg => div(msg) // working fine
//      msg => bootStrap.Alert()(msg) // getting error: Uncaught TypeError: Cannot read property '__reactAutoBindMap' of undefined
    ).build

    val element = document.getElementById("content")
    React.render(AlertMessage("this is the alert message."), element)
  }
}
