using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class cardata : System.Web.UI.Page
{
    System.Data.DataTable mytable = new System.Data.DataTable();
    protected void Page_Load(object sender, EventArgs e)
    {
       

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
       //         Editable();
            
        }
    }

    private void CreateGrid()
    {
        // CREATE A GRID FOR DISPLAYING A LIST OF BOOKS.

        System.Data.DataColumn tColumn = null;
        // TABLE COLUMNS.
        tColumn = new System.Data.DataColumn("Car Id",System.Type.GetType("System.Int32"));
        mytable.Columns.Add(tColumn);
        tColumn = new System.Data.DataColumn("Car Name", System.Type.GetType("System.String"));
        mytable.Columns.Add(tColumn);
        tColumn = new System.Data.DataColumn("Car Type", System.Type.GetType("System.String"));
        mytable.Columns.Add(tColumn);
        tColumn = new System.Data.DataColumn("Car Number", System.Type.GetType("System.String"));
        mytable.Columns.Add(tColumn);
        tColumn = new System.Data.DataColumn("Fare(per km)", System.Type.GetType("System.Int32"));
        mytable.Columns.Add(tColumn);
        tColumn = new System.Data.DataColumn("Seating Capacity", System.Type.GetType("System.String"));
        mytable.Columns.Add(tColumn);
        
      //  tColumn = new System.Data.DataColumn(" ", System.Type.GetType("System.String"));
       // mytable.Columns.Add(tColumn);
    }
    private void AddRowsToGrid()
    {
        ServiceReference1.IcarserviceClient client = new ServiceReference1.IcarserviceClient();
        ServiceReference1.car[] cars = client.getcars();
        
        foreach (var a in cars)
        {

            mytable.Rows.Add(a.carid,a.carname, a.cartype, a.carnum,a.fare,a.seatingcap);



        }

        // ADD ROWS TO THE DATATABLE.

    }
    private void AddRowsToGrid1()
    {
        ServiceReference1.IcarserviceClient client = new ServiceReference1.IcarserviceClient();
        ServiceReference1.car[] cars = client.GetCarByName(TextBox1.Text);

        foreach (var a in cars)
        {

            mytable.Rows.Add(a.carid, a.carname, a.cartype, a.carnum, a.fare, a.seatingcap);



        }

        // ADD ROWS TO THE DATATABLE.

    }
    private void AddRowsToGrid2()
    {
        ServiceReference1.IcarserviceClient client = new ServiceReference1.IcarserviceClient();
        ServiceReference1.car[] cars = client.GetCarBySeatingcap(TextBox2.Text);

        foreach (var a in cars)
        {

            mytable.Rows.Add(a.carid, a.carname, a.cartype, a.carnum, a.fare, a.seatingcap);



        }

        // ADD ROWS TO THE DATATABLE.

    }


    public void Editable()
    {
        foreach (GridViewRow row in GridView1.Rows)
        {
            // ADD LINK BUTTON IF PRICE >= $80

            HyperLink link1 = new HyperLink();
            link1.CssClass = "abc";
            link1.Text = "Details/Update/Delete";
            link1.NavigateUrl = "http://localhost:49486/UpdateSong.aspx?id=" + row.Cells[0].Text;
            /* LinkButton lb = new LinkButton();
             lb.ID = "lbBooks";
             lb.Text = "Details/Update/Delete";
     string id;*/
            //lb.OnClientClick= "window.open('UpdateSong.aspx?"+id=row.Cells[0]+"'"+", 'OtherPage')";
            row.Cells[3].Controls.Add(link1);
            // Console.Write(row.Cells[0]);

        }
    }

    

    protected void GridView1_SelectedIndexChanged(object sender, EventArgs e)
    {

    }

    protected void TextBox1_TextChanged(object sender, EventArgs e)
    {
        TextBox2.Text = " ";
        ServiceReference1.IcarserviceClient client = new ServiceReference1.IcarserviceClient();
        ServiceReference1.car[] cars = client.GetCarByName(TextBox1.Text);
        CreateGrid();
        AddRowsToGrid1();

        // NOW BIND THE GRIDVIEW WITH THE DATATABLE.
        GridView1.DataSource = mytable;

        GridView1.DataBind();
        Editable();
    }

    protected void TextBox2_TextChanged(object sender, EventArgs e)
    {
        TextBox1.Text = " ";
        ServiceReference1.IcarserviceClient client = new ServiceReference1.IcarserviceClient();
        ServiceReference1.car[] cars = client.GetCarBySeatingcap(TextBox1.Text);
        CreateGrid();
        AddRowsToGrid2();

        // NOW BIND THE GRIDVIEW WITH THE DATATABLE.
        GridView1.DataSource = mytable;

        GridView1.DataBind();
        Editable();
    }

    protected void Button1_Click(object sender, EventArgs e)
    {
        string cid=TextBox3.Text;
        //Response.Redirect("Selectedcar.aspx?Name=Pandian");
        Response.Redirect("Selectedcar.aspx?Parameter=" + Server.UrlEncode(TextBox3.Text) );
    }
}