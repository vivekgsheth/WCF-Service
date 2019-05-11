using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.ServiceModel;

namespace Carrental
{
    [ServiceContract]
    public interface Icarservice
    {
        [OperationContract]
        List<car> getcars();

        [OperationContract]
        List<car> GetCar(int id);

        [OperationContract]
        List<car> GetCarByName(string carname);

        [OperationContract]
        List<car> GetCarBySeatingcap(string carcap);

        //[OperationContract]
        //string AddRide(int id, string source, string destination, string fare);
        [OperationContract]
        user giveUser();

        [OperationContract]
        UserCar giveUserCar();

        [OperationContract]
        int AddUser(string Name, string Email, string Address, string Password);

        [OperationContract]
        string AddUserCar(UserCar uc);

        [OperationContract]
        List<UserCar> getUsercars(int uid);

        [OperationContract]
        UserCar getUserCar(int id);

        [OperationContract]
         string UpdateUserCar(UserCar uc);

        [OperationContract]
        string DeleteUserCar(int id);

        [OperationContract]
        int GetUserByMail(string email);

        [OperationContract]
        int CheckUser(string email, string password);

        [OperationContract]
        string GetUserById(int uid);

    }
}
