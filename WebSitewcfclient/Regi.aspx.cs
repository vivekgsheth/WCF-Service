using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Regi : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        ServiceReference1.IcarserviceClient proxy = new ServiceReference1.IcarserviceClient("BasicHttpBinding_Icarservice");
        // Console.WriteLine("H2");
        int car1 = proxy.AddUser(TextBox1.Text, TextBox2.Text, TextBox3.Text, TextBox4.Text);
        Console.WriteLine(car1);
       // int u = proxy.GetUserByMail(TextBox2.Text);

       // session[userid1] = u.Id;
        Response.Redirect("Default.aspx");
    }
}