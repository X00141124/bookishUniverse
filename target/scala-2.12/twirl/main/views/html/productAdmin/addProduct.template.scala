
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
/*1.2*/import models.products.Category
/*2.2*/import models.products.Product
/*3.2*/import models.users.User

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[Product],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(productForm: Form[Product], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*5.2*/import helper._


Seq[Any](format.raw/*4.42*/("""
"""),format.raw/*6.1*/("""
"""),_display_(/*7.2*/main("Add Product",user)/*7.26*/ {_display_(Seq[Any](format.raw/*7.28*/("""
    """),format.raw/*8.5*/("""<p class="lead">Add a new product</p>
    """),_display_(/*9.6*/form(action=routes.AdminProductCtrl.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form",'enctype -> "multipart/form-data")/*9.141*/ {_display_(Seq[Any](format.raw/*9.143*/("""
        """),format.raw/*10.37*/("""
        """),_display_(/*11.10*/CSRF/*11.14*/.formField),format.raw/*11.24*/("""
        """),_display_(/*12.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*12.85*/("""
        """),format.raw/*13.9*/("""<!-- Checkboxes for categories - current categories for this product are checked -->
        <!-- Category.options provides a hashmap of value, name pairs -->
        <!-- If product (id) is in catagory - mark it as checked -->
        <!-- Checkbox name is catSelect[],  selected values will be stored in -->
        <!-- form object using catSelect defined in Product  -->
        """),_display_(/*18.10*/for((value, name) <- Category.options) yield /*18.48*/ {_display_(Seq[Any](format.raw/*18.50*/("""
            """),format.raw/*19.13*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*19.63*/value),format.raw/*19.68*/(""""
            
            />"""),_display_(/*21.16*/name),format.raw/*21.20*/("""<br>        
        """)))}),format.raw/*22.10*/("""
        """),_display_(/*23.10*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*23.87*/("""
        """),_display_(/*24.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*24.87*/("""

        """),_display_(/*26.10*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*26.74*/("""

        """),format.raw/*28.9*/("""<label>Image Upload</label>
        <input class="btn-sm btn-default" type="file" name="upload">
        <br><br>
        <div class="actions">
            <input type="submit" value="Add Product" class="btn btn-primary">
            <a href=""""),_display_(/*33.23*/routes/*33.29*/.ProductCtrl.listProducts(0)),format.raw/*33.57*/("""">
                <button type="button" class="btn btn-warning">Cancel</button>
            </a>
        </div>
    """)))}),format.raw/*37.6*/("""
""")))}))
      }
    }
  }

  def render(productForm:Form[Product],user:User): play.twirl.api.HtmlFormat.Appendable = apply(productForm,user)

  def f:((Form[Product],User) => play.twirl.api.HtmlFormat.Appendable) = (productForm,user) => apply(productForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 28 15:07:12 IST 2018
                  SOURCE: /home/wdd/webapps/bookishUniverse/app/views/productAdmin/addProduct.scala.html
                  HASH: 7bd86969e13e7e624a8679869633f0ab3a8abc55
                  MATRIX: 664->1|703->34|741->66|1087->92|1200->134|1245->132|1272->150|1299->152|1331->176|1370->178|1401->183|1469->226|1613->361|1653->363|1690->400|1727->410|1740->414|1771->424|1808->434|1904->509|1940->518|2351->902|2405->940|2445->942|2486->955|2563->1005|2589->1010|2646->1040|2671->1044|2724->1066|2761->1076|2859->1153|2896->1163|2994->1240|3032->1251|3117->1315|3154->1325|3425->1569|3440->1575|3489->1603|3637->1721
                  LINES: 24->1|25->2|26->3|31->4|34->5|37->4|38->6|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|44->12|45->13|50->18|50->18|50->18|51->19|51->19|51->19|53->21|53->21|54->22|55->23|55->23|56->24|56->24|58->26|58->26|60->28|65->33|65->33|65->33|69->37
                  -- GENERATED --
              */
          