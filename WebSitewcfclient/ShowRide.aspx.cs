using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class ShowRide : System.Web.UI.Page
{
    int uid;
    int ucid;
    System.Data.DataTable mytable = new System.Data.DataTable();
    protected void Page_Load(object sender, EventArgs e)
    {
         uid=int.Parse(Server.UrlDecode(Request.QueryString["Parameter"].ToString()));

     //   TextBox1.Text=Request.QueryString["word"].ToString();
        //ucid = int.Parse(Request.QueryString["word"].ToString());
        if (!IsPostBack)
        {
            //ServiceReference1.IcarserviceClient client = new ServiceReference1.IcarserviceClient();
            //ServiceReference1.car[] cars = client.getcars();
            //foreach (var a in cars)
            //{
            //    ListBox1.Items.Add(a.carname);
            //}

            CreateGrid();
             AddRowsToGrid();

            // NOW BIND THE GRIDVIEW WITH THE DATATABLE.
           GridView1.DataSource = mytable;

            GridView1.DataBind();
                  Editable();

        }

    }

    private void CreateGrid()
    {
        // CREATE A GRID FOR DISPLAYING A LIST OF BOOKS.

        System.Data.DataColumn tColumn = null;
        // TABLE COLUMNS.
        tColumn = new System.Data.DataColumn("Id", System.Type.GetType("System.Int32"));
        mytable.Columns.Add(tColumn);
        tColumn = new System.Data.DataColumn("Car Id", System.Type.GetType("System.Int32"));
        mytable.Columns.Add(tColumn);
        tColumn = new System.Data.DataColumn("Car Name", System.Type.GetType("System.String"));
        mytable.Columns.Add(tColumn);
        tColumn = new System.Data.DataColumn("Car Type", System.Type.GetType("System.String"));
        mytable.Columns.Add(tColumn);
        tColumn = new System.Data.DataColumn("Car Number", System.Type.GetType("System.String"));
        mytable.Columns.Add(tColumn);
        tColumn = new System.Data.DataColumn("Fare(Final)", System.Type.GetType("System.Int32"));
        mytable.Columns.Add(tColumn);
        tColumn = new System.Data.DataColumn("Seating Capacity", System.Type.GetType("System.String"));
        mytable.Columns.Add(tColumn);
        tColumn = new System.Data.DataColumn("source", System.Type.GetType("System.String"));
        mytable.Columns.Add(tColumn);
        tColumn = new System.Data.DataColumn("destination", System.Type.GetType("System.String"));
        mytable.Columns.Add(tColumn);
         tColumn = new System.Data.DataColumn(" Update", System.Type.GetType("System.String"));
        mytable.Columns.Add(tColumn);
        tColumn = new System.Data.DataColumn("Delete ", System.Type.GetType("System.String"));
        mytable.Columns.Add(tColumn);
    }
    private void AddRowsToGrid()
    {
        ServiceReference1.IcarserviceClient client = new ServiceReference1.IcarserviceClient();
        ServiceReference1.UserCar[] ucars = client.getUsercars(int.Parse(HttpContext.Current.Session["userid"].ToString()));

        foreach (var a in ucars)
        {

            mytable.Rows.Add(a.Id,a.carid, a.carname, a.cartype, a.carnum, a.fare, a.seatingcap,a.source,a.destination);



        }

        // ADD ROWS TO THE DATATABLE.

    }

     public void Editable()
    {
        foreach (GridViewRow row in GridView1.Rows)
        {
            // ADD LINK BUTTON IF PRICE >= $80

            HyperLink link1 = new HyperLink();
            //link1.CssClass = "abc";
            link1.Text = "Update";
            link1.NavigateUrl = "http://localhost:52282/UpdateRide.aspx?Parameter=" + row.Cells[0].Text + "&word=" + row.Cells[1].Text;
            /* LinkButton lb = new LinkButton();
             lb.ID = "lbBooks";
             lb.Text = "Details/Update/Delete";
     string id;*/
            //lb.OnClientClick= "window.open('UpdateSong.aspx?"+id=row.Cells[0]+"'"+", 'OtherPage')";
            row.Cells[9].Controls.Add(link1);
            
            HyperLink link2 = new HyperLink();
            
            link2.Text = "Delete";
            
            link2.NavigateUrl = "http://localhost:52282/DeleteRide.aspx?Parameter=" + row.Cells[0].Text ;
            
            row.Cells[9].Controls.Add(link1);
            row.Cells[10].Controls.Add(link2);
        }
    }
    //public void Editable1()
    //{
    //    HyperLink link2 = new HyperLink();

    //    link2.Text = "Delete";

    //    link2.NavigateUrl = "http://localhost:52282/DeleteRide.aspx?Parameter=" + row.Cells[0].Text;
    //}
    protected void DetailsView1_PageIndexChanging(object sender, DetailsViewPageEventArgs e)
    {

    }

    protected void GridView1_SelectedIndexChanged(object sender, EventArgs e)
    {

    }
}