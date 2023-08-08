package Service.Impl;

import Service.CardService;
import Service.UserManagementService;
import Service.UserService;
import exception.ApplicationException;
import util.MenuUtil;

public class UserManagementServiceImpl implements UserManagementService {

    @Override
    public void userManagement() {
        UserService userService = new UserServiceImpl();


                int option = MenuUtil.getInstance().entryMenu();
                while (true){
                    try {
                switch (option) {
                    case 0:
                        System.exit(100);
                        break;
                    case 1:
                        userService.signIn();
                        break;
                    default:
                        System.out.println("Invalid option: ");
                     }


        }catch (RuntimeException exception){
                        System.out.println(exception.getMessage());


    }
                }
    }
}
