using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class UpdateRide : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!IsPostBack)
        {
            ServiceReference1.IcarserviceClient client = new ServiceReference1.IcarserviceClient();
            ServiceReference1.UserCar uc = client.getUserCar(int.Parse(Request.QueryString["Parameter"]));
            ServiceReference1.car[] c1 = client.GetCar(int.Parse(Request.QueryString["word"]));
            TextBox1.Text = uc.carname;
            TextBox2.Text = uc.source;
            TextBox3.Text = uc.destination;
            int temp = uc.fare;
            int temp1 = c1[0].fare;
            int result = temp / temp1;
            TextBox4.Text = result.ToString();
        }

        


    }



    protected void Button1_Click(object sender, EventArgs e)
    {
        ServiceReference1.IcarserviceClient client = new ServiceReference1.IcarserviceClient();
         ServiceReference1.car[] c  =    client.GetCarByName(TextBox1.Text);
        ServiceReference1.UserCar uc = new ServiceReference1.UserCar();
        ServiceReference1.car[] cd1 = client.GetCar(int.Parse(Request.QueryString["word"]));

        uc.carid = c[0].carid;

        Label1.Text = uc.carid.ToString();
        uc.carname = c[0].carname;
        uc.carnum = c[0].carnum;
        uc.cartype = c[0].cartype;
        uc.source = TextBox2.Text;
        uc.destination = TextBox3.Text;
        int tempd = (int.Parse(TextBox4.Text));
        int tempd1 = (cd1[0].fare);
        int result = tempd * tempd1;
        uc.fare = result;
        uc.Id = int.Parse(Request.QueryString["Parameter"]);
        uc.userid = int.Parse(HttpContext.Current.Session["userid"].ToString()); 
        uc.username = client.GetUserById(int.Parse(HttpContext.Current.Session["userid"].ToString()));
        uc.seatingcap = c[0].seatingcap;

        string msg  = client.UpdateUserCar(uc);

        Response.Redirect("ShowRide.aspx?Parameter="+ uc.userid);

    }
}