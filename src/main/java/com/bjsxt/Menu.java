package com.bjsxt;

/**
 * 生成项目中的所有菜单
 */
public class Menu {
    //主界面
    public void mainMenu() {
        System.out.println("***************************");
        System.out.println("**      1 Add Record     **");
        System.out.println("**      2 Find Records   **");
        System.out.println("**      3 Edit Record    **");
        System.out.println("**      4 Delete Record  **");
        System.out.println("**      5 Sort Records   **");
        System.out.println("**      6 Exit           **");
        System.out.println("***************************");
    }

    //添加界面
    public void addMenu () {
        System.out.println("******************************");
        System.out.println("**      1 Add New Record    **");
        System.out.println("**      2 View All Records  **");
        System.out.println("**      3 Previous Menu     **");
        System.out.println("******************************");
    }

    //查找界面
    public void searchMenu () {
        System.out.println("***********************************");
        System.out.println("**      1 Search by Name         **");
        System.out.println("**      2 Search by Age          **");
        System.out.println("**      3 Search by Sex          **");
        System.out.println("**      4 Search by Phone Number **");
        System.out.println("**      5 Search by Address      **");
        System.out.println("**      6 View All Records       **");
        System.out.println("**      7 Previous Menu          **");
        System.out.println("***********************************");
    }

    //修改界面
    public void modifyMenu () {
        System.out.println("*************************************");
        System.out.println("**      1 View All Records         **");
        System.out.println("**      2 Modify Specified Record  **");
        System.out.println("**      3 Previous Menu            **");
        System.out.println("*************************************");
    }
    //修改子界面
    public void subModifyMenu () {
        System.out.println("*********************************");
        System.out.println("**      1 Modify Name          **");
        System.out.println("**      2 Modify Age           **");
        System.out.println("**      3 Modify Sex           **");
        System.out.println("**      4 Modify Phone Number  **");
        System.out.println("**      5 Modify Address       **");
        System.out.println("**      6 Previous Menu        **");
        System.out.println("*********************************");
    }

    //删除界面
    public void deleteMenu () {
        System.out.println("*************************************");
        System.out.println("**      1 View All Records         **");
        System.out.println("**      2 Delete Specified Record  **");
        System.out.println("**      3 Delete All Records       **");
        System.out.println("**      4 Previous Menu            **");
        System.out.println("*************************************");
    }
    //排序界面
    public void orderMenu () {
        System.out.println("******************************");
        System.out.println("**      1 Sort by Name      **");
        System.out.println("**      2 Sort by Age       **");
        System.out.println("**      3 Sort by Sex       **");
        System.out.println("**      4 View All Records  **");
        System.out.println("**      5 Previous Menu     **");
        System.out.println("******************************");
    }
}
