package Service.Impl;
import Service.CardManagementService;
import data.GlobalData;
import exception.ApplicationException;
import model.entity.User;
import model.enums.ExceptionEnum;
import util.InputUtil;

import Service.UserService;

public class UserServiceImpl implements UserService {
    public static int failedAttempts = 0 ;
      private CardManagementService cardManagementService;
      public UserServiceImpl(){
          cardManagementService = new CardManagementServiceImpl()
;      }
    @Override
    public void signIn() {
        String phoneNumberOrFin = InputUtil.inputRequiredString("Enter phone number or fin").toUpperCase();
        String password = InputUtil.inputRequiredString("Enter password");
        boolean userDoesntExist = true;

        for (User user : GlobalData.users) {
            if (user.getFin().equals(phoneNumberOrFin) || user.getPhoneNumb().equals(phoneNumberOrFin)) {
                userDoesntExist = false;
                if (user.getPassword().equals(password)) {
                    failedAttempts = 0;
                    cardManagementService.cardManagement(user.getId());

                } else {
                    failedAttempts++;

                }
                if (failedAttempts == 3) {
                    System.exit(1);
                }
            }
        }
        if (userDoesntExist) {
            throw new ApplicationException(ExceptionEnum.NOTFOUND_EXCEPTION);
        }
    }
}
