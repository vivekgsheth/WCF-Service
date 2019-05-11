using System;
using System.Collections.Generic;
using System.Data;
using System.Data.SqlClient;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Runtime.Serialization;
using System.ServiceModel;


namespace Carrental
{
   public class Carservice:Icarservice
    {
      
        public List<car> getcars()
        {
            SqlDataAdapter da = new SqlDataAdapter("SELECT carid,carname,cartype,carnum,fare,seatingcap FROM car", @"Data Source=(localdb)\ProjectsV12;Initial Catalog=carrentaldatabase;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=True;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
            DataSet ds = new DataSet();
            da.Fill(ds, "car");



            List<car> c = new List<car>();

            foreach(DataTable x in ds.Tables)
            {
                foreach(DataRow y in x.Rows)
                {
                    car c1 = new car();
                    c1.carid = int.Parse(y["carid"].ToString());
                    c1.carname = y["carname"].ToString();
                    c1.carnum = y["carnum"].ToString();
                    c1.cartype = y["cartype"].ToString();
                    c1.fare = int.Parse(y["fare"].ToString());
                    c1.seatingcap= y["seatingcap"].ToString();
                    c.Add(c1);
                }

            }

            return c;
        }
        public List<car> GetCar(int id)
        {
            SqlConnection conn = new SqlConnection(@"Data Source=(localdb)\ProjectsV12;Initial Catalog=carrentaldatabase;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=True;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
            SqlCommand cmd = new SqlCommand();
            conn.Open();
            cmd.Connection = conn;
            cmd.CommandText = "Select * from car where carid='" + id + "'";
            SqlDataAdapter ad = new SqlDataAdapter(cmd);
            DataSet ds = new DataSet();
            ad.Fill(ds, "cars");
            conn.Close();
            List<car> songs = new List<car>();
            foreach (DataRow r in ds.Tables["cars"].Rows)
            {
                //DataRow r = ds.Tables["songs"].Rows[0];
                car s = new car();
                s.carid = (int)r["carid"];
                s.carname = (string)r["carname"];
                s.cartype = (string)r["cartype"];
                s.carnum = (string)r["carnum"];
                s.fare = (int)r["fare"];
                s.seatingcap= (string)r["seatingcap"];
                songs.Add(s);

            }
            conn.Close();
            return songs;
        }
        public List<UserCar> getUsercars(int uid)
        {
            SqlConnection conn = new SqlConnection(@"Data Source=(localdb)\ProjectsV12;Initial Catalog=carrentaldatabase;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=True;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
            SqlCommand cmd = new SqlCommand();
            conn.Open();
            cmd.Connection = conn;
            cmd.CommandText = "Select * from usercar where userid='" + uid + "'";
            SqlDataAdapter ad = new SqlDataAdapter(cmd);
            DataSet ds = new DataSet();
            ad.Fill(ds, "usercars");
            conn.Close();
            List<UserCar> songs = new List<UserCar>();
            foreach (DataRow r in ds.Tables["usercars"].Rows)
            {
                //DataRow r = ds.Tables["songs"].Rows[0];
                UserCar s = new UserCar();
                s.Id = (int)r["Id"];
                s.carid = (int)r["carid"];
                s.carname = (string)r["carname"];
                s.cartype = (string)r["cartype"];
                s.carnum = (string)r["carnum"];
                s.fare = (int)r["fare"];
                s.seatingcap = (string)r["seatingcap"];
                s.source = (string)r["source"];
                s.destination = (string)r["destination"];
                songs.Add(s);

            }
            conn.Close();
            return songs;
        }
        public List<car> GetCarByName(string carname)
        {
            SqlConnection conn = new SqlConnection(@" Data Source=(localdb)\ProjectsV12;Initial Catalog=carrentaldatabase;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=True;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
            SqlCommand cmd = new SqlCommand();
            conn.Open();
            cmd.Connection = conn;
            cmd.CommandText = "Select * from car where carname='" + carname + "'";
            SqlDataAdapter ad = new SqlDataAdapter(cmd);
            DataSet ds = new DataSet();
            ad.Fill(ds, "cars");
            //conn.Close();
            List<car> songs = new List<car>();
            foreach (DataRow r in ds.Tables["cars"].Rows)
            {
                //DataRow r = ds.Tables["songs"].Rows[0];
                car s = new car();
                s.carid = (int)r["carid"];
                s.carname = (string)r["carname"];
                s.cartype = (string)r["cartype"];
                s.carnum = (string)r["carnum"];
                s.fare = (int)r["fare"];
                s.seatingcap = (string)r["seatingcap"];
                songs.Add(s);

            }
            conn.Close();
            return songs;
        }
        public List<car> GetCarBySeatingcap(string carcap)
        {
            SqlConnection conn = new SqlConnection(@"Data Source=(localdb)\ProjectsV12;Initial Catalog=carrentaldatabase;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=True;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
            SqlCommand cmd = new SqlCommand();
            conn.Open();
            cmd.Connection = conn;
            cmd.CommandText = "Select * from car where seatingcap='" + carcap + "'";
            SqlDataAdapter ad = new SqlDataAdapter(cmd);
            DataSet ds = new DataSet();
            ad.Fill(ds, "cars");
            conn.Close();
            List<car> songs = new List<car>();
            foreach (DataRow r in ds.Tables["cars"].Rows)
            {
                //DataRow r = ds.Tables["songs"].Rows[0];
                car s = new car();
                s.carid = (int)r["carid"];
                s.carname = (string)r["carname"];
                s.cartype = (string)r["cartype"];
                s.carnum = (string)r["carnum"];
                s.fare = (int)r["fare"];
                s.seatingcap = (string)r["seatingcap"];
                songs.Add(s);

            }
            conn.Close();
            return songs;
        }
        public user giveUser()
        {
            user u = new user();
            return u;
        }
        public UserCar giveUserCar()
        {
            UserCar uc = new UserCar();
            return uc;
        }

        public string AddUserCar(UserCar uc)
        {
            string Message;

            SqlConnection con = new SqlConnection(@"Data Source=(localdb)\ProjectsV12;Initial Catalog=carrentaldatabase;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=True;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
            SqlCommand cmd = new SqlCommand();
            
            cmd.Connection = con;
            cmd.CommandText = "select carname,cartype,carnum,seatingcap from car where carid =" + uc.carid;
          
           Console.WriteLine(uc.carid);
            // cmd.ExecuteNonQuery();
            con.Open();
            SqlDataReader rdr = cmd.ExecuteReader();
            rdr.Read();
            uc.carname = rdr["carname"].ToString();
            uc.cartype = rdr["cartype"].ToString();
            uc.carnum = rdr["carnum"].ToString();
            uc.seatingcap = rdr["seatingcap"].ToString();
            con.Close();
             cmd = new SqlCommand("insert into [usercar](carid,userid,carname,username,source,destination,fare,cartype,carnum,seatingcap) values(@carid,@userid,@carname,@username,@source,@destination,@fare,@cartype,@carnum,@seatingcap)", con);
            cmd.Parameters.Add(new SqlParameter("@carid", uc.carid));          
            cmd.Parameters.Add(new SqlParameter("@userid", uc.userid));
            cmd.Parameters.Add(new SqlParameter("@carname", uc.carname));
            cmd.Parameters.Add(new SqlParameter("@username", uc.username));
            cmd.Parameters.Add(new SqlParameter("@source", uc.source));
            cmd.Parameters.Add(new SqlParameter("@destination", uc.destination));
            cmd.Parameters.Add(new SqlParameter("@fare", uc.fare));
            cmd.Parameters.Add(new SqlParameter("@cartype", uc.cartype));
            cmd.Parameters.Add(new SqlParameter("@carnum", uc.carnum));
            cmd.Parameters.Add(new SqlParameter("@seatingcap", uc.seatingcap));
            con.Open();
            int result = cmd.ExecuteNonQuery();
            if (result == 1)
            {
                Message = "successfully";
            }
            else
            {
                Message = "unsuccessfully";
            }
            con.Close();
            return Message;
        }

     
        public int AddUser(string Name, string Email, string Address, string Password)
        {
            string Message;
            SqlConnection con = new SqlConnection(@"Data Source=(localdb)\ProjectsV12;Initial Catalog=carrentaldatabase;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=True;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");

            SqlCommand cmd = new SqlCommand("insert into [user](Name,Email,Address,Password) values(@Name,@Email,@Address,@Password)", con);
            cmd.Parameters.Add(new SqlParameter("@Name", Name));
            cmd.Parameters.Add(new SqlParameter("@Email", Email));
            cmd.Parameters.Add(new SqlParameter("@Address", Address));
            cmd.Parameters.Add(new SqlParameter("@Password", Password));
            con.Open();

            int result = cmd.ExecuteNonQuery();
            if (result == 1)
            {
                Console.WriteLine("In result");
                Message = "successfully";
            }
            else
            {
                Message = "unsuccessfully";
            }
            con.Close();

            cmd = new SqlCommand("select * from [user] where Email = @email", con);
            cmd.Parameters.Add(new SqlParameter("@email", Email));
            con.Open();
            SqlDataReader rdr = cmd.ExecuteReader();
            rdr.Read();
            int tempid = int.Parse(rdr["Id"].ToString());
            Console.WriteLine(tempid);
            rdr.Close();
            con.Close();
            return tempid;


        }

        public int CheckUser(string email, string password)
        {
            int status;
            SqlConnection con = new SqlConnection(@"Data Source=(localdb)\ProjectsV12;Initial Catalog=carrentaldatabase;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=True;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
            SqlCommand cmd = new SqlCommand("Select * from [User] where Email=@email and Password=@password", con);
            cmd.Parameters.Add(new SqlParameter("@email", email));
            cmd.Parameters.Add(new SqlParameter("@password", password));
            con.Open();

            SqlDataReader rd = cmd.ExecuteReader();
            if (rd.HasRows)
            {
                status = 1;
            }
            else
            {
                status = 0;
            }
            con.Close();
            return status;
        }


        public UserCar getUserCar(int id)
        {
            SqlConnection con = new SqlConnection(@"Data Source=(localdb)\ProjectsV12;Initial Catalog=carrentaldatabase;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=True;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
            SqlCommand cmd = new SqlCommand();
            UserCar uc = new UserCar();
            cmd.Connection = con;
            cmd.CommandText = "select * from usercar where id =" +id;
          
            //Console.WriteLine(uc.carid);
            
            con.Open();
            SqlDataReader rdr = cmd.ExecuteReader();
            rdr.Read();
            uc.carname = rdr["carname"].ToString();
            uc.cartype = rdr["cartype"].ToString();
            uc.carnum = rdr["carnum"].ToString();
            uc.seatingcap = rdr["seatingcap"].ToString();
            uc.carid = int.Parse(rdr["carid"].ToString());
            uc.userid =int.Parse( rdr["userid"].ToString());
            uc.username = rdr["username"].ToString();
            uc.source = rdr["source"].ToString();
            uc.destination = rdr["destination"].ToString();

            uc.fare = int.Parse(rdr["fare"].ToString());

            con.Close();
            return uc;
        }

        public string UpdateUserCar(UserCar uc)
        {
            string Message;
            SqlConnection con = new SqlConnection(@"Data Source=(localdb)\ProjectsV12;Initial Catalog=carrentaldatabase;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=True;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
            con.Open();
            SqlCommand cmd = new SqlCommand("update usercar set carid = @carid,userid=@userid,carname=@carname,username=@username,source=@source,destination=@destination,fare=@fare,cartype=@cartype,carnum=@carnum,seatingcap=@seatingcap where Id=@id", con);
            cmd.Parameters.Add(new SqlParameter("@id", uc.Id));
            cmd.Parameters.Add(new SqlParameter("@carid", uc.carid));
            cmd.Parameters.Add(new SqlParameter("@userid", uc.userid));
            
            cmd.Parameters.Add(new SqlParameter("@username", uc.username));
            cmd.Parameters.Add(new SqlParameter("@carname", uc.carname));
            cmd.Parameters.Add(new SqlParameter("@source", uc.source));
            cmd.Parameters.Add(new SqlParameter("@destination", uc.destination));
            cmd.Parameters.Add(new SqlParameter("@fare", uc.fare));
           
            cmd.Parameters.Add(new SqlParameter("@cartype", uc.cartype));
            cmd.Parameters.Add(new SqlParameter("@carnum", uc.carnum));
            cmd.Parameters.Add(new SqlParameter("@seatingcap", uc.seatingcap));
            

            int result = cmd.ExecuteNonQuery();
            if (result == 1)
            {
                Message = "successfully";
            }
            else
            {
                Message = "unsuccessfully";
            }
            con.Close();
            return Message;

        }

        public string DeleteUserCar(int id)
        {

            string Message;
            SqlConnection con = new SqlConnection(@"Data Source=(localdb)\ProjectsV12;Initial Catalog=carrentaldatabase;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=True;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
            SqlCommand cmd = new SqlCommand("delete from usercar  where Id=@id", con);
            cmd.Parameters.Add(new SqlParameter("@id", id));

            con.Open();

            int result = cmd.ExecuteNonQuery();
            if (result == 1)
            {
                Message = "successfully";
            }
            else
            {
                Message = "unsuccessfully";
            }
            con.Close();
            return Message;

    //        throw new NotImplementedException();
        }

        public int GetUserByMail(string email)
        {
            SqlConnection con = new SqlConnection(@"Data Source=(localdb)\ProjectsV12;Initial Catalog=carrentaldatabase;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=True;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
            SqlCommand cmd = new SqlCommand();
            cmd = new SqlCommand("select * from [user] where Email = @email", con);
            cmd.Parameters.Add(new SqlParameter("@email", email));
            con.Open();
            SqlDataReader rdr = cmd.ExecuteReader();
            rdr.Read();
            int tempid = int.Parse(rdr["Id"].ToString());
            Console.WriteLine(tempid);
            rdr.Close();
            con.Close();
            return tempid;
        }
        public string GetUserById(int uid)
        {
            SqlConnection con = new SqlConnection(@"Data Source=(localdb)\ProjectsV12;Initial Catalog=carrentaldatabase;Integrated Security=True;Connect Timeout=30;Encrypt=False;TrustServerCertificate=True;ApplicationIntent=ReadWrite;MultiSubnetFailover=False");
            SqlCommand cmd = new SqlCommand();
            cmd = new SqlCommand("select * from [user] where  Id= @id", con);
            cmd.Parameters.Add(new SqlParameter("@id", uid));
            con.Open();
            SqlDataReader rdr = cmd.ExecuteReader();
            rdr.Read();
            string tempnm = rdr["Name"].ToString();
            // Console.WriteLine(tempid);
            rdr.Close();
            con.Close();
            return tempnm;
        }
    }

    
}
