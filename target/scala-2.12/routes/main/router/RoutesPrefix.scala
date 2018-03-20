
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/yanik/Documents/bookishUniverse/conf/routes
// @DATE:Tue Mar 20 00:29:01 GMT 2018


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
