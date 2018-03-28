
package views.html.productAdmin

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
/*2.2*/import models.products.Category
/*3.2*/import models.products.Product
/*4.2*/import models.users.User

object listProducts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[Product],List[Category],User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(products: List[Product], categories: List[Category], user: User,env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.93*/("""

"""),_display_(/*7.2*/main("Products",user)/*7.23*/ {_display_(Seq[Any](format.raw/*7.25*/("""

"""),format.raw/*9.1*/("""<p class="lead">Product Catalogue</p>
<br>
<div class="row">
  <div class="col-sm-3">
    <h4>Categories</h4>
    <div class="list-group">
      <a href=""""),_display_(/*15.17*/routes/*15.23*/.AdminProductCtrl.listProducts(0)),format.raw/*15.56*/("""" class="list-group-item">All Categories</a>
      """),_display_(/*16.8*/for(c <- categories) yield /*16.28*/ {_display_(Seq[Any](format.raw/*16.30*/("""
        """),format.raw/*17.9*/("""<a href=""""),_display_(/*17.19*/routes/*17.25*/.AdminProductCtrl.listProducts(c.getId)),format.raw/*17.64*/("""" class="list-group-item">"""),_display_(/*17.91*/c/*17.92*/.getName),format.raw/*17.100*/("""
          """),format.raw/*18.11*/("""<span class="badge">"""),_display_(/*18.32*/c/*18.33*/.getProducts.size()),format.raw/*18.52*/("""</span>
        </a>
      """)))}),format.raw/*20.8*/("""
    """),format.raw/*21.5*/("""</div>
  </div>
  <div class="col-sm-9">
    <table class="table table-bordered table-hover table-condensed">
      """),_display_(/*25.8*/if(flash.containsKey("success"))/*25.40*/ {_display_(Seq[Any](format.raw/*25.42*/("""
        """),format.raw/*26.9*/("""<div class="alert alert-success">
          """),_display_(/*27.12*/flash/*27.17*/.get("success")),format.raw/*27.32*/("""
        """),format.raw/*28.9*/("""</div>
      """)))}),format.raw/*29.8*/("""
      """),format.raw/*30.7*/("""<thead>
        <tr>
          <th>Image</th>
          <th>ID</th>
          <th>Name</th>
          <th>Stock</th>
          <th>Price</th>
          <th colspan="2"></th>      
        </tr>
      </thead>

      <tbody>
        """),_display_(/*42.10*/for(p<-products) yield /*42.26*/ {_display_(Seq[Any](format.raw/*42.28*/("""
          """),format.raw/*43.11*/("""<tr>
              """),_display_(/*44.16*/if(env.resource("public/images/productImages/thumbnails/" + p.getId + ".jpg").isDefined)/*44.104*/ {_display_(Seq[Any](format.raw/*44.106*/("""
                """),format.raw/*45.17*/("""<td><img src="/assets/images/productImages/thumbnails/"""),_display_(/*45.72*/(p.getId + ".jpg")),format.raw/*45.90*/(""""/></td>
            """)))}/*46.15*/else/*46.20*/{_display_(Seq[Any](format.raw/*46.21*/("""
                """),format.raw/*47.17*/("""<td><img src="/assets/images/productImages/thumbnails/noImage.jpg"/></td>
            """)))}),format.raw/*48.14*/("""
            """),format.raw/*49.13*/("""<td class="numeric">"""),_display_(/*49.34*/p/*49.35*/.getId),format.raw/*49.41*/("""</td>
            <td><a href=""""),_display_(/*50.27*/routes/*50.33*/.ProductCtrl.productDetails(p.getId)),format.raw/*50.69*/("""">
             """),_display_(/*51.15*/p/*51.16*/.getName),format.raw/*51.24*/("""</td>
            </a>
     
            <td  class="numeric">"""),_display_(/*54.35*/p/*54.36*/.getStock),format.raw/*54.45*/("""</td>
            <td  class="numeric">€ """),_display_(/*55.37*/("%.2f".format(p.getPrice))),format.raw/*55.64*/("""</td>
            <td>
              <a href=""""),_display_(/*57.25*/routes/*57.31*/.AdminProductCtrl.updateProduct(p.getId)),format.raw/*57.71*/("""" class="button xs btn-danger">
                <span class="glyphicon glyphicon-pencil"></span>
              </a>
            </td>        <td>
              <a href=""""),_display_(/*61.25*/routes/*61.31*/.AdminProductCtrl.deleteProduct(p.getId)),format.raw/*61.71*/("""" class="button xs btn-danger" onclick="return confirmDel();">
                <span class="glyphicon glyphicon-trash"></span>
              </a>
            </td>
          </tr>
        """)))}),format.raw/*66.10*/("""
      """),format.raw/*67.7*/("""</tbody>

    </table>

    <p>
      <a href=""""),_display_(/*72.17*/routes/*72.23*/.AdminProductCtrl.addProduct()),format.raw/*72.53*/("""">
        <button class="btn btn-primary">Add a product</button>
      </a>
    </p>
  </div>
</div>
""")))}))
      }
    }
  }

  def render(products:List[Product],categories:List[Category],user:User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user,env)

  def f:((List[Product],List[Category],User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user,env) => apply(products,categories,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 28 15:07:12 IST 2018
                  SOURCE: /home/wdd/webapps/bookishUniverse/app/views/productAdmin/listProducts.scala.html
                  HASH: 8544244154a3b75faf0dba6cf0ce7c09abe726bc
                  MATRIX: 664->2|703->35|741->67|1125->93|1311->184|1339->187|1368->208|1407->210|1435->212|1617->367|1632->373|1686->406|1764->458|1800->478|1840->480|1876->489|1913->499|1928->505|1988->544|2042->571|2052->572|2082->580|2121->591|2169->612|2179->613|2219->632|2277->660|2309->665|2452->782|2493->814|2533->816|2569->825|2641->870|2655->875|2691->890|2727->899|2771->913|2805->920|3065->1153|3097->1169|3137->1171|3176->1182|3223->1202|3321->1290|3362->1292|3407->1309|3489->1364|3528->1382|3569->1405|3582->1410|3621->1411|3666->1428|3784->1515|3825->1528|3873->1549|3883->1550|3910->1556|3969->1588|3984->1594|4041->1630|4085->1647|4095->1648|4124->1656|4214->1719|4224->1720|4254->1729|4323->1771|4371->1798|4445->1845|4460->1851|4521->1891|4718->2061|4733->2067|4794->2107|5014->2296|5048->2303|5123->2351|5138->2357|5189->2387
                  LINES: 24->2|25->3|26->4|31->5|36->5|38->7|38->7|38->7|40->9|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|48->17|48->17|48->17|48->17|49->18|49->18|49->18|49->18|51->20|52->21|56->25|56->25|56->25|57->26|58->27|58->27|58->27|59->28|60->29|61->30|73->42|73->42|73->42|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|79->48|80->49|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|85->54|85->54|85->54|86->55|86->55|88->57|88->57|88->57|92->61|92->61|92->61|97->66|98->67|103->72|103->72|103->72
                  -- GENERATED --
              */
          