using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class _Default : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        Label1.Visible = false;
    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        Response.Redirect("Regi.aspx");
    }

    protected void Button2_Click(object sender, EventArgs e)
    {
        ServiceReference1.IcarserviceClient client = new ServiceReference1.IcarserviceClient("BasicHttpBinding_Icarservice");
        if (client.CheckUser(TextBox1.Text, TextBox2.Text) == 1)
        {
            int uid=client.GetUserByMail(TextBox1.Text);
            Session["userid"] = uid;
            Response.Redirect("cardata.aspx");
        }
        else
        {
            Label1.Text = "Plz enter valid credetials";
        }
    }
}