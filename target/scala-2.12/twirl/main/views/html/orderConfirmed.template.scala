
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

object orderConfirmed extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.Customer,models.shopping.ShopOrder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, order: models.shopping.ShopOrder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._


Seq[Any](format.raw/*1.69*/("""


"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("Order Confirmation", customer)/*9.38*/ {_display_(Seq[Any](format.raw/*9.40*/("""


"""),format.raw/*12.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*15.4*/if(flash.containsKey("success"))/*15.36*/ {_display_(Seq[Any](format.raw/*15.38*/("""
			  """),format.raw/*16.6*/("""<div class="alert alert-success">
			      """),_display_(/*17.11*/flash/*17.16*/.get("success")),format.raw/*17.31*/("""
			  """),format.raw/*18.6*/("""</div>
		""")))}),format.raw/*19.4*/(""" 

		"""),format.raw/*21.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Item Price</th>
				<th>Quantity</th>
                <th>Total</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*32.18*/if(order != null)/*32.35*/ {_display_(Seq[Any](format.raw/*32.37*/("""
                    """),format.raw/*33.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*34.22*/for(i <- order.getItems) yield /*34.46*/ {_display_(Seq[Any](format.raw/*34.48*/("""
                    """),format.raw/*35.21*/("""<tr>
                        <td>"""),_display_(/*36.30*/i/*36.31*/.getProduct.getName),format.raw/*36.50*/("""</td>
                        <td>&euro; """),_display_(/*37.37*/("%.2f".format(i.getPrice))),format.raw/*37.64*/("""</td>
                        <td>"""),_display_(/*38.30*/i/*38.31*/.getQuantity()),format.raw/*38.45*/("""</td>
                        <td>&euro; """),_display_(/*39.37*/("%.2f".format(i.getItemTotal))),format.raw/*39.68*/("""</td>
                    </tr>
                    """)))}),format.raw/*41.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*42.16*/("""
			"""),format.raw/*43.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*47.68*/("%.2f".format(order.getOrderTotal))),format.raw/*47.104*/("""</strong></p>
            </div>  
        </div>
        </div>
</div>
""")))}))
      }
    }
  }

  def render(customer:models.users.Customer,order:models.shopping.ShopOrder): play.twirl.api.HtmlFormat.Appendable = apply(customer,order)

  def f:((models.users.Customer,models.shopping.ShopOrder) => play.twirl.api.HtmlFormat.Appendable) = (customer,order) => apply(customer,order)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 04 18:45:32 IST 2018
                  SOURCE: /home/wdd/webapps/bookishUniverse/app/views/orderConfirmed.scala.html
                  HASH: 1da5c7c93f480625930bdcb7f219ca62a6551f06
                  MATRIX: 998->1|1138->72|1174->102|1206->128|1260->68|1289->153|1316->154|1387->200|1431->236|1470->238|1500->241|1573->288|1614->320|1654->322|1687->328|1758->372|1772->377|1808->392|1841->398|1881->408|1913->413|2194->667|2220->684|2260->686|2309->707|2419->790|2459->814|2499->816|2548->837|2609->871|2619->872|2659->891|2728->933|2776->960|2838->995|2848->996|2883->1010|2952->1052|3004->1083|3088->1136|3159->1176|3190->1180|3366->1329|3424->1365
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|40->8|41->9|41->9|41->9|44->12|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|53->21|64->32|64->32|64->32|65->33|66->34|66->34|66->34|67->35|68->36|68->36|68->36|69->37|69->37|70->38|70->38|70->38|71->39|71->39|73->41|74->42|75->43|79->47|79->47
                  -- GENERATED --
              */
          