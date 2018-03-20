
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
                  DATE: Tue Mar 20 00:25:54 GMT 2018
                  SOURCE: C:/Users/yanik/Documents/bookishUniverse/app/views/updateUser.scala.html
                  HASH: 07dc612e9bcf74fd5b3d871ce0080c32aae119d0
                  MATRIX: 1008->1|1183->106|1229->103|1257->123|1285->126|1317->150|1356->152|1388->158|1479->224|1641->377|1681->379|1719->417|1757->428|1770->432|1801->442|1841->455|1944->537|1982->548|2083->628|2121->639|2146->655|2185->656|2227->671|2265->700|2304->701|2350->720|2569->918|2607->929|2719->1019|2765->1034|2807->1045|2864->1075|3015->1199|3030->1205|3078->1232|3230->1354|3259->1356
                  LINES: 28->1|31->2|34->1|35->3|36->4|36->4|36->4|37->5|39->7|42->10|42->10|43->11|44->12|44->12|44->12|46->14|46->14|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|54->22|55->23|55->23|56->24|57->25|60->28|62->30|62->30|62->30|66->34|67->35
                  -- GENERATED --
              */
          