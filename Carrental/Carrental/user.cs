﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace Carrental
{
    [DataContract]
    public class user
    {
        //private int uid;
        //private string Name;
        //private string Email;
        //private string Address;
        //private string Password;
        [DataMember]
        public int Id
        {
            get;
            set;
        }
        [DataMember]
        public string Name
        {
            get;
            set;
        }
        [DataMember]
        public string Email
        {
            get;
            set;
        }
        [DataMember]
        public string Address
        {
            get;
            set;
        }
        [DataMember]
        public string Password
        {
            get;
            set;
        }
    }
}
