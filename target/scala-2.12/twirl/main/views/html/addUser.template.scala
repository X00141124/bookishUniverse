
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object addUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[models.users.User],models.users.User,List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[models.users.User], user: models.users.User, roleList: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.86*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Add User",user)/*4.23*/ {_display_(Seq[Any](format.raw/*4.25*/("""
    """),format.raw/*5.5*/("""<p class="lead">Join Us</p>
    <div class="col-xs-5">

    """),_display_(/*8.6*/form(action=routes.HomeController.addUserSubmit(), 
    'class -> "form-horizontal", 
    'role -> "form",
    'enctype -> "multipart/form-data")/*11.39*/ {_display_(Seq[Any](format.raw/*11.41*/("""
        """),format.raw/*12.37*/("""
        """),_display_(/*13.10*/CSRF/*13.14*/.formField),format.raw/*13.24*/("""
        """),_display_(/*14.10*/inputText(userForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*14.82*/("""
        """),_display_(/*15.10*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*15.84*/("""
        """),_display_(/*16.10*/if(user != null)/*16.26*/{_display_(Seq[Any](format.raw/*16.27*/("""
            """),_display_(/*17.14*/if(user.getRole() == "admin")/*17.43*/{_display_(Seq[Any](format.raw/*17.44*/("""
                """),_display_(/*18.18*/select(
        userForm("role"), 
        options(roleList), '_label -> "Role", '_default -> "-- Choose a role --", 
        '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*22.10*/("""
            """)))}),format.raw/*23.14*/("""
        """)))}),format.raw/*24.10*/("""
        """),_display_(/*25.10*/inputPassword(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*25.94*/("""
        
        """),format.raw/*27.9*/("""<div class="actions">
            <input type="submit" value="Add User" class="btn btn-primary">
            <a href=""""),_display_(/*29.23*/routes/*29.29*/.HomeController.usersPage()),format.raw/*29.56*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*33.6*/("""
"""),format.raw/*34.1*/("""</div>
""")))}))
      }
    }
  }

  def render(userForm:Form[models.users.User],user:models.users.User,roleList:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user,roleList)

  def f:((Form[models.users.User],models.users.User,List[String]) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user,roleList) => apply(userForm,user,roleList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 20 12:55:54 GMT 2018
                  SOURCE: /home/wdd/webapps/bookishUniverse/app/views/addUser.scala.html
                  HASH: 378fe3e873997dbe1a5c9fbaad51af22822f8e8b
                  MATRIX: 998->1|1155->87|1200->85|1227->103|1254->105|1283->126|1322->128|1353->133|1439->194|1593->339|1633->341|1670->378|1707->388|1720->392|1751->402|1788->412|1881->484|1918->494|2013->568|2050->578|2075->594|2114->595|2155->609|2193->638|2232->639|2277->657|2486->845|2531->859|2572->869|2609->879|2714->963|2759->981|2905->1100|2920->1106|2968->1133|3116->1251|3144->1252
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|40->8|43->11|43->11|44->12|45->13|45->13|45->13|46->14|46->14|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|54->22|55->23|56->24|57->25|57->25|59->27|61->29|61->29|61->29|65->33|66->34
                  -- GENERATED --
              */
          