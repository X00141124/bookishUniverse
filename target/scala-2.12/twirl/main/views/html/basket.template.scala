
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

object basket extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._


Seq[Any](format.raw/*1.35*/("""


"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("Shopping Basket", customer)/*9.35*/ {_display_(Seq[Any](format.raw/*9.37*/("""


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
				<th>Total</th>
				<th>Quantity</th>
                <th>dec.</th>
                <th>inc.</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*34.18*/if(customer.getBasket() != null)/*34.50*/ {_display_(Seq[Any](format.raw/*34.52*/("""
                    """),format.raw/*35.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*36.22*/for(i <- customer.getBasket().getBasketItems()) yield /*36.69*/ {_display_(Seq[Any](format.raw/*36.71*/("""
                    """),format.raw/*37.21*/("""<tr>
                        <td>"""),_display_(/*38.30*/i/*38.31*/.getProduct.getName),format.raw/*38.50*/("""</td>
                        <td>&euro; """),_display_(/*39.37*/("%.2f".format(i.getPrice))),format.raw/*39.64*/("""</td>
                        <td>&euro; """),_display_(/*40.37*/("%.2f".format(i.getItemTotal))),format.raw/*40.68*/("""</td>
                        <td>"""),_display_(/*41.30*/i/*41.31*/.getQuantity()),format.raw/*41.45*/("""</td>
                        <td><a href=""""),_display_(/*42.39*/routes/*42.45*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*42.77*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                        <td><a href=""""),_display_(/*43.39*/routes/*43.45*/.ShoppingCtrl.addOne(i.getId)),format.raw/*43.74*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
                    </tr>
                    """)))}),format.raw/*45.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*46.16*/("""
			"""),format.raw/*47.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*51.69*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*51.119*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*57.31*/routes/*57.37*/.ShoppingCtrl.emptyBasket()),format.raw/*57.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>  
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*63.31*/routes/*63.37*/.ShoppingCtrl.placeOrder()),format.raw/*63.63*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                </p>
            </div>  
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*73.24*/("""{"""),format.raw/*73.25*/("""
		"""),format.raw/*74.3*/("""return confirm('Are you sure?');
	"""),format.raw/*75.2*/("""}"""),format.raw/*75.3*/("""
"""),format.raw/*76.1*/("""</script>
""")))}))
      }
    }
  }

  def render(customer:models.users.Customer): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((models.users.Customer) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 04 18:45:32 IST 2018
                  SOURCE: /home/wdd/webapps/bookishUniverse/app/views/basket.scala.html
                  HASH: f8f518f39eed03eac8234ac0e8da549cc293672c
                  MATRIX: 964->1|1070->38|1106->68|1138->94|1192->34|1221->119|1248->120|1319->166|1360->199|1399->201|1429->204|1502->251|1543->283|1583->285|1616->291|1687->335|1701->340|1737->355|1770->361|1810->371|1842->376|2171->678|2212->710|2252->712|2301->733|2411->816|2474->863|2514->865|2563->886|2624->920|2634->921|2674->940|2743->982|2791->1009|2860->1051|2912->1082|2974->1117|2984->1118|3019->1132|3090->1176|3105->1182|3158->1214|3287->1316|3302->1322|3352->1351|3493->1461|3564->1501|3595->1505|3772->1655|3844->1705|4051->1885|4066->1891|4114->1918|4436->2213|4451->2219|4498->2245|4825->2544|4854->2545|4884->2548|4945->2582|4973->2583|5001->2584
                  LINES: 28->1|31->4|32->5|33->6|36->1|39->7|40->8|41->9|41->9|41->9|44->12|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|51->19|53->21|66->34|66->34|66->34|67->35|68->36|68->36|68->36|69->37|70->38|70->38|70->38|71->39|71->39|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|75->43|75->43|75->43|77->45|78->46|79->47|83->51|83->51|89->57|89->57|89->57|95->63|95->63|95->63|105->73|105->73|106->74|107->75|107->75|108->76
                  -- GENERATED --
              */
          