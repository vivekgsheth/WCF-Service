using Carrental;
using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;
    
namespace Carservicehost
{
    class Program
    {
        static void Main(string[] args)
        {
            Type t = typeof(Carservice);
            //Uri tcp = new Uri("net.tcp://localhost:8010/Carservice");
            Uri http = new Uri("http://localhost:8000/Carservice");
            ServiceHost host = new ServiceHost(t,http);
            host.Open();
            Console.WriteLine("Published");
            Console.ReadLine();
            host.Close();

        }
    }
}
