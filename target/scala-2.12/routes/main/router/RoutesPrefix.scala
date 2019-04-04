// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kounokouichi/Desktop/scalaProject/expre/Experiment/conf/routes
// @DATE:Thu Apr 04 16:12:57 JST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
