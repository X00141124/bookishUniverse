
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
                  DATE: Wed Apr 04 18:45:31 IST 2018
                  SOURCE: /home/wdd/webapps/bookishUniverse/app/views/usersPage.scala.html
                  HASH: 24e8a84d37a711e462531eb17f32cd82ed05f020
                  MATRIX: 1008->1|1186->84|1214->87|1240->105|1279->107|1307->109|1525->301|1566->333|1606->335|1642->344|1714->389|1728->394|1764->409|1800->418|1844->432|1878->439|2014->548|2039->564|2078->565|2119->579|2157->608|2196->609|2237->622|2307->661|2350->673|2392->688|2464->733|2493->746|2533->748|2572->759|2621->781|2631->782|2660->790|2710->813|2720->814|2750->823|2800->846|2810->847|2839->855|2885->874|2910->890|2949->891|2990->905|3033->939|3072->940|3127->967|3200->1013|3215->1019|3274->1057|3511->1267|3526->1273|3585->1311|3791->1486|3832->1496|3871->1507|3917->1522|3951->1529
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|49->17|50->18|55->23|55->23|55->23|56->24|56->24|56->24|57->25|58->26|59->27|60->28|64->32|64->32|64->32|65->33|66->34|66->34|66->34|67->35|67->35|67->35|68->36|68->36|68->36|69->37|69->37|69->37|70->38|70->38|70->38|73->41|75->43|75->43|75->43|81->49|81->49|81->49|85->53|86->54|87->55|88->56|89->57
                  -- GENERATED --
              */
          