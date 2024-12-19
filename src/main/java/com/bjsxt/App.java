package com.bjsxt;

/**
 * 电话本项目入口类
 */
public class App {
    /**
     * 启动电话本项目
     */
    public static void main(String[] args) {
        App app = new App();
        app.start();
    }

    /**
     * 控制主菜单
     */
    public void start() {
        Menu menu = new Menu();
        TelNoteRegx regex = new TelNoteRegx();
        Operate Operate = new Operate();
        while(true) {
            menu.mainMenu();
            int item = regex.menuItemValidate(1,6);
            switch (item) {
                case 1 -> Operate.addLogic();
                case 2 -> Operate.searchLogic();
                case 3 -> Operate.modifyLogic();
                case 4 -> Operate.deleteLogic();
                case 5 -> Operate.orderLogic();
                case 6 -> System.exit(0);
            }
        }
    }
}
