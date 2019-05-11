using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class DeleteRide : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        ServiceReference1.IcarserviceClient client =new ServiceReference1.IcarserviceClient();
        string msg=client.DeleteUserCar(int.Parse(Request.QueryString["Parameter"]));
        Response.Redirect("ShowRide.aspx?Parameter=" + 123);

    }
}