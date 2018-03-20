
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

object usersPage extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.users.User],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[models.users.User], user: models.users.User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.85*/("""

"""),_display_(/*3.2*/main("users",user)/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""

"""),format.raw/*5.1*/("""<p class="lead">Users Page</p>
<br>
<div class="row">
  <div class="col-sm-2">
  </div>
  
  <div class="col-sm-8">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*13.8*/if(flash.containsKey("success"))/*13.40*/ {_display_(Seq[Any](format.raw/*13.42*/("""
        """),format.raw/*14.9*/("""<div class="alert alert-success">
          """),_display_(/*15.12*/flash/*15.17*/.get("success")),format.raw/*15.32*/("""
        """),format.raw/*16.9*/("""</div>
      """)))}),format.raw/*17.8*/("""
      """),format.raw/*18.7*/("""<thead>
        <tr>
          <th>Username</th>
          <th>Email</th>
          <th>Role</th>
          """),_display_(/*23.12*/if(user != null)/*23.28*/{_display_(Seq[Any](format.raw/*23.29*/("""
            """),_display_(/*24.14*/if(user.getRole() == "admin")/*24.43*/{_display_(Seq[Any](format.raw/*24.44*/("""
            """),format.raw/*25.13*/("""<th colspan="2">Edit</th>
            """)))}),format.raw/*26.14*/("""
          """)))}),format.raw/*27.12*/("""      
        """),format.raw/*28.9*/("""</tr>
      </thead>

      <tbody>
        """),_display_(/*32.10*/for(u<-users) yield /*32.23*/ {_display_(Seq[Any](format.raw/*32.25*/("""
          """),format.raw/*33.11*/("""<tr>
            <td>"""),_display_(/*34.18*/u/*34.19*/.getName),format.raw/*34.27*/("""</td>
            <td>"""),_display_(/*35.18*/u/*35.19*/.getEmail),format.raw/*35.28*/("""</td>
            <td>"""),_display_(/*36.18*/u/*36.19*/.getRole),format.raw/*36.27*/("""</td>
            """),_display_(/*37.14*/if(user != null)/*37.30*/{_display_(Seq[Any](format.raw/*37.31*/("""
            """),_display_(/*38.14*/if(user.getRole().equals("admin"))/*38.48*/{_display_(Seq[Any](format.raw/*38.49*/("""

            
            """),format.raw/*41.13*/("""<td>
                
              <a href=""""),_display_(/*43.25*/routes/*43.31*/.HomeController.updateUser(u.getEmail)),format.raw/*43.69*/("""" class="button xs btn-danger">
                    <span class="glyphicon glyphicon-pencil"></span>
                  
                
              </a>
            </td>        <td>
              <a href=""""),_display_(/*49.25*/routes/*49.31*/.HomeController.deleteUser(u.getEmail)),format.raw/*49.69*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          """)))}),format.raw/*53.12*/("""
        """)))}),format.raw/*54.10*/("""
          """),format.raw/*55.11*/("""</tr>
        """)))}),format.raw/*56.10*/("""
      """),format.raw/*57.7*/("""</tbody>
    </table>
  </div>
</div>
""")))}))
      }
    }
  }

  def render(users:List[models.users.User],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(users,user,env)

  def f:((List[models.users.User],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (users,user,env) => apply(users,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 20 00:25:54 GMT 2018
                  SOURCE: C:/Users/yanik/Documents/bookishUniverse/app/views/usersPage.scala.html
                  HASH: c0f14887a638a14cccd189f8d529a82ad0a2d6cf
                  MATRIX: 1008->1|1186->84|1216->89|1242->107|1281->109|1311->113|1537->313|1578->345|1618->347|1655->357|1728->403|1742->408|1778->423|1815->433|1860->448|1895->456|2036->570|2061->586|2100->587|2142->602|2180->631|2219->632|2261->646|2332->686|2376->699|2419->715|2495->764|2524->777|2564->779|2604->791|2654->814|2664->815|2693->823|2744->847|2754->848|2784->857|2835->881|2845->882|2874->890|2921->910|2946->926|2985->927|3027->942|3070->976|3109->977|3167->1007|3242->1055|3257->1061|3316->1099|3559->1315|3574->1321|3633->1359|3843->1538|3885->1549|3925->1561|3972->1577|4007->1585
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|49->17|50->18|55->23|55->23|55->23|56->24|56->24|56->24|57->25|58->26|59->27|60->28|64->32|64->32|64->32|65->33|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|73->41|75->43|75->43|75->43|81->49|81->49|81->49|85->53|86->54|87->55|88->56|89->57
                  -- GENERATED --
              */
          