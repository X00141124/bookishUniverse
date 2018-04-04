
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

object updateUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[String,Form[models.users.User],models.users.User,List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id: String, updateUserForm: Form[models.users.User], user: models.users.User, roleList: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.104*/("""
"""),format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Update User",user)/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
    """),format.raw/*5.5*/("""<p class="lead">Update User</p>
    <div class="col-xs-5">
    """),_display_(/*7.6*/form(action=routes.HomeController.updateUserSubmit(id), 
    'class -> "form-horizontal", 
    'role -> "form",
    'enctype -> "multipart/form-data")/*10.39*/ {_display_(Seq[Any](format.raw/*10.41*/("""
        """),format.raw/*11.37*/("""
        """),_display_(/*12.10*/CSRF/*12.14*/.formField),format.raw/*12.24*/("""

        """),_display_(/*14.10*/inputText(updateUserForm("name"), '_label -> "Username", 'class -> "form-control")),format.raw/*14.92*/("""
        """),_display_(/*15.10*/inputText(updateUserForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*15.90*/("""
        """),_display_(/*16.10*/if(user != null)/*16.26*/{_display_(Seq[Any](format.raw/*16.27*/("""
            """),_display_(/*17.14*/if(user.getRole() == "admin")/*17.43*/{_display_(Seq[Any](format.raw/*17.44*/("""
                """),_display_(/*18.18*/select(
        updateUserForm("role"), 
        options(roleList), '_label -> "Role", '_default -> "-- Choose a role --", 
        '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*22.10*/("""
        """),_display_(/*23.10*/inputPassword(updateUserForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*23.100*/("""
            """)))}),format.raw/*24.14*/("""
        """)))}),format.raw/*25.10*/("""
        
        
        """),format.raw/*28.9*/("""<div class="actions">
            <input type="submit" value="Update User" class="btn btn-primary">
            <a href=""""),_display_(/*30.23*/routes/*30.29*/.HomeController.usersPage()),format.raw/*30.56*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*34.6*/("""
"""),format.raw/*35.1*/("""</div>
""")))}))
      }
    }
  }

  def render(id:String,updateUserForm:Form[models.users.User],user:models.users.User,roleList:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(id,updateUserForm,user,roleList)

  def f:((String,Form[models.users.User],models.users.User,List[String]) => play.twirl.api.HtmlFormat.Appendable) = (id,updateUserForm,user,roleList) => apply(id,updateUserForm,user,roleList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 04 18:45:31 IST 2018
                  SOURCE: /home/wdd/webapps/bookishUniverse/app/views/updateUser.scala.html
                  HASH: fbc2aa8c11d37c6dfe29a503fb5fba10a96bf6cc
                  MATRIX: 1008->1|1183->105|1229->103|1256->121|1283->123|1315->147|1354->149|1385->154|1474->218|1633->368|1673->370|1710->407|1747->417|1760->421|1791->431|1829->442|1932->524|1969->534|2070->614|2107->624|2132->640|2171->641|2212->655|2250->684|2289->685|2334->703|2549->897|2586->907|2698->997|2743->1011|2784->1021|2838->1048|2987->1170|3002->1176|3050->1203|3198->1321|3226->1322
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|39->7|42->10|42->10|43->11|44->12|44->12|44->12|46->14|46->14|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|54->22|55->23|55->23|56->24|57->25|60->28|62->30|62->30|62->30|66->34|67->35
                  -- GENERATED --
              */
          