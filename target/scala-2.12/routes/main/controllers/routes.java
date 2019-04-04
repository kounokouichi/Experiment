// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/kounokouichi/Desktop/scalaProject/expre/Experiment/conf/routes
// @DATE:Thu Apr 04 16:12:57 JST 2019

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
  }

}
