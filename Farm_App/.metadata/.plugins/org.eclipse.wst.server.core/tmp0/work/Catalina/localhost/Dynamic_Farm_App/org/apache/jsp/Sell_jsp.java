/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-23 15:10:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class Sell_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.io.PrintWriter");
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("java.sql.PreparedStatement");
    _jspx_imports_classes.add("java.sql.DriverManager");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Farm_App","root","root");
PreparedStatement ps=con.prepareStatement("select * from Customer_details where contact=?");
Cookie []cookies=request.getCookies();
String contact=cookies[0].getValue();
long mobile=Long.parseLong(contact);
PrintWriter pw=response.getWriter();
ps.setLong(1, mobile);
ResultSet rs=ps.executeQuery();
rs.next(); 
if(rs.getLong(2)==mobile)
{

      out.write("\r\n");
      out.write("<div class=\"container\" align=\"center\">\r\n");
      out.write("<form action=\"StoreData\" method=\"post\">\r\n");
      out.write("        <div class=\"f-group\">\r\n");
      out.write("            <label for=\"\">Category </label>\r\n");
      out.write("            <select name=\"slct1\" id=\"slct1\" onchange=\"populate(this.id,'slct2')\" required>\r\n");
      out.write("                <option value=\"\" selected disabled>--select category--</option>\r\n");
      out.write("                <option value=\"fruits\">Fruits</option>\r\n");
      out.write("                <option value=\"vagitables\">Vegetables</option>\r\n");
      out.write("                <option value=\"grains\">Grains</option>\r\n");
      out.write("                <option value=\"milk\">Milk</option>\r\n");
      out.write("                <option value=\"eggs\">Eggs</option>\r\n");
      out.write("            </select>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"f-group\">\r\n");
      out.write("            <label for=\"\">sub category</label>\r\n");
      out.write("            <select name=\"slct2\" id=\"slct2\">--sub category--</select>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script>\r\n");
      out.write("            function populate(s1,s2)\r\n");
      out.write("            {\r\n");
      out.write("                var s1=document.getElementById(s1);\r\n");
      out.write("                var s2=document.getElementById(s2);\r\n");
      out.write("\r\n");
      out.write("                s2.innerHTML=\"\";\r\n");
      out.write("                if(s1.value=='fruits')\r\n");
      out.write("                {\r\n");
      out.write("                    var optionArray=[\r\n");
      out.write("'apple|Apple',\r\n");
      out.write("'almond|Almond',\r\n");
      out.write("'apricot|Apricot',\r\n");
      out.write("'avocado|Avocado',\r\n");
      out.write("'banana|Banana',\r\n");
      out.write("'berry|Berry',\r\n");
      out.write("'black currant|Black Currant',\r\n");
      out.write("'blackberry|Blackberry',\r\n");
      out.write("'blueberry|Blueberry',\r\n");
      out.write("'cashew|Cashew',\r\n");
      out.write("'cherry|Cherry',\r\n");
      out.write("'coconut|Coconut',\r\n");
      out.write("'cucumber|Cucumber',\r\n");
      out.write("'custard apple|Custard Apple',\r\n");
      out.write("'dates|Dates',\r\n");
      out.write("'fig|Fig',\r\n");
      out.write("'gooseberry|Gooseberry',\r\n");
      out.write("'grapefruit|Grapefruit',\r\n");
      out.write("'grapes|Grapes',\r\n");
      out.write("'guava|Guava',\r\n");
      out.write("'jackfruit|Jackfruit',\r\n");
      out.write("'jujube|Jujube',\r\n");
      out.write("'kiwi|Kiwi',\r\n");
      out.write("'lemon|Lemon',\r\n");
      out.write("'lychee|Lychee',\r\n");
      out.write("'mango|Mango',\r\n");
      out.write("'mulberry|Mulberry',\r\n");
      out.write("'muskmelon|Muskmelon',\r\n");
      out.write("'naseberry|Naseberry',\r\n");
      out.write("'olive|Olive',\r\n");
      out.write("'orange|Orange',\r\n");
      out.write("'papaya|Papaya',\r\n");
      out.write("'peach|Peach',\r\n");
      out.write("'pear|Pear',\r\n");
      out.write("'persimmon|Persimmon',\r\n");
      out.write("'pineapple|Pineapple',\r\n");
      out.write("'plum|Plum',\r\n");
      out.write("'pomegranate|Pomegranate',\r\n");
      out.write("'prickly  pear|Prickly  Pear',\r\n");
      out.write("'quince|Quince',\r\n");
      out.write("'raisins|Raisins',\r\n");
      out.write("'raspberry|Raspberry',\r\n");
      out.write("'startfruit|Startfruit',\r\n");
      out.write("'strawberry|Strawberry',\r\n");
      out.write("'sugar cane|Sugar Cane',\r\n");
      out.write("'sweet lime|Sweet Lime',\r\n");
      out.write("'tamarind|Tamarind',\r\n");
      out.write("'walnut|Walnut',\r\n");
      out.write("'water chestnut|Water Chestnut',\r\n");
      out.write("'watermelon|Watermelon',\r\n");
      out.write("'wood apple|Wood Apple'\r\n");
      out.write("                                    ];\r\n");
      out.write("                }\r\n");
      out.write("                else if(s1.value=='vagitables')\r\n");
      out.write("                {\r\n");
      out.write("                    var optionArray=[\r\n");
      out.write("'bitter gourd|Bitter Gourd',\r\n");
      out.write("'coriander leaf|Coriander Leaf',\r\n");
      out.write("'cauliflower|Cauliflower',\r\n");
      out.write("'peas|Peas',\r\n");
      out.write("'apple gourd|Apple Gourd',\r\n");
      out.write("'beetroot|Beetroot',\r\n");
      out.write("'beetroot|Beetroot',\r\n");
      out.write("'bell pepper|Bell Pepper',\r\n");
      out.write("'bitter gourd|Bitter Gourd',\r\n");
      out.write("'blackpepper|Black Pepper',\r\n");
      out.write("'bottle gourd|Bottle Gourd',\r\n");
      out.write("'brinjal|Brinjal',\r\n");
      out.write("'cabbage|Cabbage',\r\n");
      out.write("'capsicum|Capsicum',\r\n");
      out.write("'carrot|Carrot',\r\n");
      out.write("'cauliflower|Cauliflower',\r\n");
      out.write("'chilli|Chilli',\r\n");
      out.write("'coriander|Coriander',\r\n");
      out.write("'cucumber|Cucumber',\r\n");
      out.write("'drumstick|Drumstick',\r\n");
      out.write("'garlic|Garlic',\r\n");
      out.write("'ginger|Ginger',\r\n");
      out.write("'green bean|Green bean',\r\n");
      out.write("'green onion|Green onion',\r\n");
      out.write("'ivy gourd|Ivy gourd',\r\n");
      out.write("'jackfruit|Jackfruit',\r\n");
      out.write("'ladys finger|Ladys finger',\r\n");
      out.write("'mushroom|Mushroom',\r\n");
      out.write("'onion|Onion',\r\n");
      out.write("'peas|Peas',\r\n");
      out.write("'potato|Potato',\r\n");
      out.write("'pumpkin|Pumpkin',\r\n");
      out.write("'raddish|Raddish',\r\n");
      out.write("'redchillies|Redchillies',\r\n");
      out.write("'ridged gourd|Ridged gourd',\r\n");
      out.write("'snake gourd|Snake gourd',\r\n");
      out.write("'spinach|Spinach',\r\n");
      out.write("'sweet potato|Sweet Potato',\r\n");
      out.write("'tomato|Tomato',\r\n");
      out.write("'zucchini|Zucchini'\r\n");
      out.write("];\r\n");
      out.write("                }\r\n");
      out.write("                else if(s1.value=='grains')\r\n");
      out.write("                {\r\n");
      out.write("                    var optionArray=[\r\n");
      out.write("'barley|Barley',\r\n");
      out.write("'barley|Barley',\r\n");
      out.write("'beans|Beans',\r\n");
      out.write("'bengal gram|Bengal Gram',\r\n");
      out.write("'black gram|Black gram',\r\n");
      out.write("'black-eyed beans/ black- eyed pea/ goat pea|Black-eyed beans/ black- eyed pea/goat pea',\r\n");
      out.write("'finger miller|Finger miller',\r\n");
      out.write("'gram /yellow gram/chickpeas|Gram /yellow gram/chickpeas',\r\n");
      out.write("'green gram|Green gram',\r\n");
      out.write("'green peas|Green peas',\r\n");
      out.write("'kidney beans|Kidney beans',\r\n");
      out.write("'lentil|Lentil',\r\n");
      out.write("'maize/corn|Maize/corn',\r\n");
      out.write("'millet|Millet',\r\n");
      out.write("'paddy|Paddy',\r\n");
      out.write("'pea|Pea',\r\n");
      out.write("'peanuts|Peanuts',\r\n");
      out.write("'pearl millet|Pearl millet',\r\n");
      out.write("'pigeon pea|Pigeon pea',\r\n");
      out.write("'ragi|Ragi',\r\n");
      out.write("'rice|Rice',\r\n");
      out.write("'sorghum / jowar/  great millet/ milo|Sorghum / jowar/  great millet/ milo',\r\n");
      out.write("'sorghum|Sorghum',\r\n");
      out.write("'soyabean|Soyabean',\r\n");
      out.write("'split black gram|Split black gram',\r\n");
      out.write("'split chickpeas |Split chickpeas ',\r\n");
      out.write("'split green gram|Split green gram',\r\n");
      out.write("'split lentil|Split lentil',\r\n");
      out.write("'split pigeon pea|Split pigeon pea',\r\n");
      out.write("'wheat|Wheat'\r\n");
      out.write("                    ];\r\n");
      out.write("                }\r\n");
      out.write("                else if(s1.value=='milk')\r\n");
      out.write("                {\r\n");
      out.write("                    var optionArray=[\r\n");
      out.write("                        'curd|Curd',\r\n");
      out.write("                        'milk|Milk',\r\n");
      out.write("                        'buttermilk|Buttermilk',\r\n");
      out.write("                        'ghee|Cow Ghee'\r\n");
      out.write("                    ];\r\n");
      out.write("                }\r\n");
      out.write("                else if(s1.value=='eggs')\r\n");
      out.write("                {\r\n");
      out.write("                    var optionArray=['chicken eggs|Chicken eggs'];\r\n");
      out.write("                }\r\n");
      out.write("                for(var option in optionArray)\r\n");
      out.write("                {\r\n");
      out.write("                    var pair=optionArray[option].split(\"|\");\r\n");
      out.write("                    var newoption=document.createElement(\"option\");\r\n");
      out.write("                    newoption.value=pair[0];\r\n");
      out.write("                    newoption.innerHTML=pair[1];\r\n");
      out.write("                    s2.options.add(newoption);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("        <div>\r\n");
      out.write("        	<label>Selling Quantity in KG <sup style=\"color: red;\">*</sub></label>\r\n");
      out.write("        	<input type=\"number\" name=\"qty\" required><br>\r\n");
      out.write("        	<label>Price per KG<sup style=\"color: red;\">*</sub> </label>\r\n");
      out.write("        	<input type=\"number\" name=\"price\" required>\r\n");
      out.write("        </div><br>\r\n");
      out.write("         <div>\r\n");
      out.write("         	<label>attach min 2 photos ***only images allowed***</label><br>\r\n");
      out.write("        	<sup style=\"color: red;\">*</sup><input type=\"file\" accept=\"image/*\" name=\"img1\" required><br>\r\n");
      out.write("        	<sup style=\"color: red;\">*</sup><input type=\"file\" accept=\"image/*\" name=\"img2\" required><br>\r\n");
      out.write("        	<input type=\"file\" accept=\"image/*\" name=\"img3\"><br>\r\n");
      out.write("        	<input type=\"file\" accept=\"image/*\" name=\"img4\"><br>\r\n");
      out.write("        	<label>Enter your Address:</label><sup style=\"color: red;\">* </sup><input type=\"text\" name=\"add\" required=\"required\">\r\n");
      out.write("        </div><br>\r\n");
      out.write("        <div>\r\n");
      out.write("        	<input type=\"checkbox\" name=\"deliver\" value=\"deliver\">\r\n");
      out.write("        	<label>delivered to customer address</label><br>\r\n");
      out.write("        	<input type=\"checkbox\" name=\"take\" value=\"take\">\r\n");
      out.write("        	<label>take away</label><br>\r\n");
      out.write("        </div>\r\n");
      out.write("        	<button type=\"submit\">submit</button>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");

}

      out.write('\r');
      out.write('\n');

}
catch (ClassNotFoundException e) 
{

      out.write("\r\n");
      out.write("	<h2>Something went wrong please try after sometime sell class not fount</h2>\r\n");

}
catch(Exception e)
{

      out.write("\r\n");
      out.write("	<h2>Something went wrong please try after sometime sell exception</h2>\r\n");
 
}

      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}