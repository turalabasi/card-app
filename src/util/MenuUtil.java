package util;

import static util.InputUtil.inputRequiredInt;

public class MenuUtil {
    private MenuUtil() {

    }
    private static MenuUtil instance;

    public static MenuUtil getInstance() {
        return instance == null
                ? instance = new MenuUtil() : instance;
    }

    public  int entryMenu() {
        System.out.println("[1]. Sign in\n" +
                           "[0]. System exit\n");

        return inputRequiredInt("Choose Option: ");
    }

    public int accountMenu(){
        System.out.println("[1]. Card to card\n" +
                           "[2]. Show Balance\n" +
                           "[3]. Back to entryMenu\n");

        return inputRequiredInt("Choose Option: ");

    }

}
