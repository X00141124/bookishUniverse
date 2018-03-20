
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.users.User )(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Online Shop - """),_display_(/*9.27*/title),format.raw/*9.32*/("""</title>
    <!-- Bootstrap Core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />
    <!-- Custom CSS -->
    <link href=""""),_display_(/*13.18*/routes/*13.24*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.65*/("""" rel="stylesheet" />
</head>

<body>

    <div class="row">
        <div class="col-sm-4">
            <label>Image</label>
        </div>
        <div class="col-sm-4">
            <label>Search</label>
        </div>
        <div class="col-sm-4">
                <ul class="nav nav-pills">
                        <li class="active"><a href="#" class="btn btn-info btn-lg">
                                <span class="glyphicon glyphicon-user"></span> Login 
                              </a></li>
                        <li class="active"><a href="#" class="btn btn-info btn-lg">
                                <span class="glyphicon glyphicon-heart"></span> Wishlist 
                              </a></li>
                        <li class="active"><a href="#">My Account</a></li>
                      </ul>
            </div>
    </div>
    <div class="row">
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <div class="navbar-header">
                <a class="navbar-brand" href=""""),_display_(/*41.48*/routes/*41.54*/.ProductCtrl.listProducts(0)),format.raw/*41.82*/("""">Online Shop</a>
            </div>

            <ul class="nav navbar-nav">

                <li """),_display_(/*46.22*/if(title=="Products" )/*46.44*/{_display_(Seq[Any](format.raw/*46.45*/("""class="active"""")))}),format.raw/*46.60*/(""">
                    <a href="#">About</a>
                </li>

                <li>
                    <a href="#">Services</a>
                </li>

                <li>
                    <a href="#">Contact</a>
                </li>
                <li """),_display_(/*57.22*/if(title=="Login")/*57.40*/{_display_(Seq[Any](format.raw/*57.41*/("""class="active"""")))}),format.raw/*57.56*/(""">
                    """),_display_(/*58.22*/if(user != null)/*58.38*/ {_display_(Seq[Any](format.raw/*58.40*/("""
                        """),format.raw/*59.25*/("""<a href=""""),_display_(/*59.35*/controllers/*59.46*/.security.routes.LoginCtrl.logout()),format.raw/*59.81*/("""">Logout """),_display_(/*59.91*/user/*59.95*/.getName()),format.raw/*59.105*/("""</a>
                    """)))}/*60.23*/else/*60.28*/{_display_(Seq[Any](format.raw/*60.29*/("""
                        """),format.raw/*61.25*/("""<a href=""""),_display_(/*61.35*/controllers/*61.46*/.security.routes.LoginCtrl.login()),format.raw/*61.80*/("""">Login</a>
                    """)))}),format.raw/*62.22*/("""

                """),format.raw/*64.17*/("""</li>
            </ul>

        </div>

    </nav>

    <container>
        <row>
            <div class="col-md-12">
                """),_display_(/*74.18*/content),format.raw/*74.25*/("""
            """),format.raw/*75.13*/("""</div>
        </row>
    </container>
<br>
    <container>
        <footer>
        <row>
            <div class="col-md-12">
                Copyright
                <strong>Online Shop</strong>
            </div>
        </row>
    </footer>
    </container>
    <script src=""""),_display_(/*89.19*/routes/*89.25*/.Assets.versioned("javascripts/main.js")),format.raw/*89.65*/(""""></script>
</div>
</body>

</html>"""))
      }
    }
  }

  def render(title:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 20 00:25:54 GMT 2018
                  SOURCE: C:/Users/yanik/Documents/bookishUniverse/app/views/main.scala.html
                  HASH: 0303662e0b805c1d32a42428463d1a0282592574
                  MATRIX: 970->1|1121->57|1151->61|1278->162|1303->167|1519->356|1534->362|1596->403|2689->1469|2704->1475|2753->1503|2885->1608|2916->1630|2955->1631|3001->1646|3303->1921|3330->1939|3369->1940|3415->1955|3466->1979|3491->1995|3531->1997|3585->2023|3622->2033|3642->2044|3698->2079|3735->2089|3748->2093|3780->2103|3826->2131|3839->2136|3878->2137|3932->2163|3969->2173|3989->2184|4044->2218|4109->2252|4157->2272|4330->2418|4358->2425|4400->2439|4722->2734|4737->2740|4798->2780
                  LINES: 28->1|33->1|35->3|41->9|41->9|45->13|45->13|45->13|73->41|73->41|73->41|78->46|78->46|78->46|78->46|89->57|89->57|89->57|89->57|90->58|90->58|90->58|91->59|91->59|91->59|91->59|91->59|91->59|91->59|92->60|92->60|92->60|93->61|93->61|93->61|93->61|94->62|96->64|106->74|106->74|107->75|121->89|121->89|121->89
                  -- GENERATED --
              */
          