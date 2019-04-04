// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kounokouichi/Desktop/scalaProject/expre/Experiment/conf/routes
// @DATE:Thu Apr 04 16:12:57 JST 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }


}
