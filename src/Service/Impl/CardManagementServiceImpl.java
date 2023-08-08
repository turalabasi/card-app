package Service.Impl;

import Service.CardManagementService;
import Service.CardService;
import Service.UserService;
import util.MenuUtil;

public class CardManagementServiceImpl implements CardManagementService {
    @Override
    public void cardManagement(long userId) {
        CardService cardService = new CardServiceImpl();

        while (true){
            int option = MenuUtil.getInstance().accountMenu();

            switch (option){
                case 0:
                    System.exit(100);
                    break;
                case 1:
                    cardService.cardToCard(userId);
                    break;
                case 2:
                    cardService.showBalance(userId);
                    break;
                case 3:
                    MenuUtil.getInstance().entryMenu();
                    break;
                default:
                    System.out.println("Invalid option: ");
            }
        }


    }
}
