// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/danielparkes/workspace/frontend2/conf/routes
// @DATE:Tue Apr 28 13:53:03 BST 2020


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
