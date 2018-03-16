
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
    """),_display_(/*7.6*/form(action=routes.HomeController.addUserSubmit(), 
    'class -> "form-horizontal", 
    'role -> "form",
    'enctype -> "multipart/form-data")/*10.39*/ {_display_(Seq[Any](format.raw/*10.41*/("""
        """),format.raw/*11.37*/("""
        """),_display_(/*12.10*/CSRF/*12.14*/.formField),format.raw/*12.24*/("""
        """),_display_(/*13.10*/inputText(userForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*13.82*/("""
        """),_display_(/*14.10*/inputText(userForm("name"), '_label -> "Username", 'class -> "form-control")),format.raw/*14.86*/("""
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
                  DATE: Fri Mar 16 12:13:59 GMT 2018
                  SOURCE: /home/wdd/webapps/bookishUniverse/app/views/addUser.scala.html
                  HASH: 911c4247165f3e79072cd02035226377e398ea47
                  MATRIX: 998->1|1155->87|1200->85|1227->103|1254->105|1283->126|1322->128|1353->133|1438->193|1592->338|1632->340|1669->377|1706->387|1719->391|1750->401|1787->411|1880->483|1917->493|2014->569|2051->579|2146->653|2183->663|2208->679|2247->680|2288->694|2326->723|2365->724|2410->742|2619->930|2664->944|2705->954|2742->964|2847->1048|2892->1066|3038->1185|3053->1191|3101->1218|3249->1336|3277->1337
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|39->7|42->10|42->10|43->11|44->12|44->12|44->12|45->13|45->13|46->14|46->14|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|54->22|55->23|56->24|57->25|57->25|59->27|61->29|61->29|61->29|65->33|66->34
                  -- GENERATED --
              */
          