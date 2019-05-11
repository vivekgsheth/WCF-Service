using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Runtime.Serialization;

namespace Carrental
{
    [DataContract]  
   public class car
    {
        //private int cid;
        //private string name;
        //private string type;
        //private string cno;
        [DataMember]
        public int carid
        {
            get ; 
            set  ; 
        }
        [DataMember]
        public string carname
        {
            get;
            set;
        }
        [DataMember]
        public string cartype
        {
            get;
            set;
            //get { return type; }
            //set { type = value; }
        }
        [DataMember]
        public string carnum
        {
            get;
            set;
            //    get { return cno; }
            //    set { cno = value; }
            }
        
        [DataMember]
        public int fare
        {
            get;
            set;
        //    get { return cno; }
        //    set { cno = value; }
        }
        [DataMember]
        public string seatingcap
        {
            get;
            set;
        //    get { return cno; }
        //    set { cno = value; }
        }
}

}
