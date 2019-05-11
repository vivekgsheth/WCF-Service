using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Selectedcar : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        Label1.Text = Server.UrlDecode(Request.QueryString["Parameter"].ToString());
    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        ServiceReference1.IcarserviceClient client = new ServiceReference1.IcarserviceClient("BasicHttpBinding_Icarservice");
       // ServiceReference1.user u = new ServiceReference1.user();
        ServiceReference1.UserCar uc = new ServiceReference1.UserCar();
        
     //   ServiceReference1.car c = new ServiceReference1.car();
        ServiceReference1.car[] c1=client.GetCar(int.Parse(Server.UrlDecode(Request.QueryString["Parameter"].ToString())));
        uc.carid = int.Parse(Label1.Text);
        uc.carname = "";
        uc.userid = int.Parse(HttpContext.Current.Session["userid"].ToString());
        uc.username =  client.GetUserById(int.Parse(HttpContext.Current.Session["userid"].ToString()));
        uc.source = TextBox1.Text;
        uc.destination = TextBox2.Text;
        int temp = (int.Parse(TextBox3.Text));
            int temp1 = (c1[0].fare);
        int result = temp * temp1;
        uc.fare =result ;
        uc.cartype = "";
        uc.carnum = "";
        uc.seatingcap = "";
        // ServiceReference1 c = new ServiceReference1.usercar();
        string car1 = client.AddUserCar(uc);
       // ServiceReference1.UserCar uc1 = new ServiceReference1.UserCar();
        Response.Redirect("ShowRide.aspx?Parameter=" + Server.UrlEncode(uc.userid.ToString()) );
        //Response.Redirect("~/PrintBilledReport.aspx?sentence=" + s + "&word=" + s1 + "&letter" + s3);

    }
}