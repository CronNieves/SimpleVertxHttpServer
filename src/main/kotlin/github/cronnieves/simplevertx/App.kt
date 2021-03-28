package  github.cronnieves.simplevertx

class App {
  val initialMessage: String
    get() {
      return "App Started"
    }
}

fun main() {
  println(App().initialMessage)
}
