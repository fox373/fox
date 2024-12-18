package com.bjsxt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * 核心业务类
 */
public class Operate {
    private List<Person> list ;
    public Operate(){
        this.list = new ArrayList<Person>();
    }
    /**
     * 用户添加记录业务逻辑控制
     */
    public void addLogic(){
        Menu menu = new Menu();
        TelNoteRegx telNote = new TelNoteRegx();
        while (true){
            menu.addMenu();
            int item = telNote.menuItemValidate(1,3);
            switch (item){
                case 1 -> this.addOperation();
                case 2 -> this.showAll();
                case 3 -> {
                    return;
                }
            }
        }

    }
    /**
     * 用户查询记录业务逻辑控制
     */
    public void searchLogic(){
        Menu menu = new Menu();
        TelNoteRegx telNote = new TelNoteRegx();
        while (true){
            menu.searchMenu();
            int item = telNote.menuItemValidate(1,7);
            switch(item){
                case 1 -> this.searchByName();
                case 2 -> this.searchByAge();
                case 3 -> this.searchBySex();
                case 4 -> this.searchByTelNum();
                case 5 -> this.searchByAdd();
                case 6 -> this.showAll();
                case 7 ->{
                    return;
                }
            }
        }
    }
    /**
     * 修改记录业务逻辑控制
     */
    public void modifyLogic(){
        Menu menu = new Menu();
        TelNoteRegx telNote = new TelNoteRegx();
        while(true){
            menu.modifyMenu();
            int item = telNote.menuItemValidate(1,3);
            switch (item){
                case 1 -> this.showAll();
                case 2 -> this.modifyOperation();
                case 3 -> {
                    return;
                }
            }
        }
    }
    /**
     * 删除记录业务逻辑控制
     */
    public void deleteLogic(){
        Menu menu = new Menu();
        TelNoteRegx telNote = new TelNoteRegx();
        while (true){
            menu.deleteMenu();
            int item = telNote.menuItemValidate(1,4);
            switch(item){
                case 1 -> this.showAll();
                case 2 -> this.deleteOperation();
                case 3 -> this.deleteAllOperation();
                case 4 -> {
                    return;
                }
            }
        }
    }
    /**
     * 排序记录业务逻辑控制
     */
    public void orderLogic(){
        Menu menu = new Menu();
        TelNoteRegx telNote = new TelNoteRegx();
        while (true){
            menu.orderMenu();
            int item = telNote.menuItemValidate(1,5);
            switch(item){
                case 1 -> this.orderByName();
                case 2 -> this.orderByAge();
                case 3 -> this.orderBySex();
                case 4 -> this.showAll();
                case 5 ->{
                    return;
                }
            }
        }
    }

    /**
     * 添加新记录信息
     */
    public void addOperation(){
        TelNoteRegx telNoteRegx = new TelNoteRegx();
        String name = telNoteRegx.nameValidate();
        String age =telNoteRegx.ageValidate();
        String sex = telNoteRegx.sexValidate();
        String telNum = telNoteRegx.telNumValidate();
        String address = telNoteRegx.addressValidate();
        Person person = new Person(name, age, sex, telNum,address);
        this.list.add(person);
        person.setId(this.list.size());

    }
    /**
     * 查询全部记录
     */
    public void showAll(){
       if(this.list.size()==0){
           System.out.println("There are no records");
           return ;
       }
        for (Person person : list) {
            System.out.println(person);
        }
    }
    /**
     * 按姓名查找记录
     */
    public void searchByName(){
        TelNoteRegx telNoteRegx = new TelNoteRegx();
        String name = telNoteRegx.nameValidate();
        boolean flag = true;                         //标记
        for (Person person : list) {
            if(name.equals(person.getName())){
                System.out.println(person);
                flag = false;
            }
        }
        if(flag){
            System.out.println("There is no record of this person");
        }
    }

    /**
     * 按年龄查找
     */
    public void searchByAge(){
        TelNoteRegx telNoteRegx = new TelNoteRegx();
        String age = telNoteRegx.ageValidate();
        boolean flag = true;
        for (Person person : list) {
            if(age.equals(person.getAge())){
                System.out.println(person);
                flag = false;
            }
        }
        if(flag){
            System.out.println("There is no record of this person");
        }
    }
    /**
     * 按性别查询记录
     */
    public void searchBySex(){
        TelNoteRegx telNoteRegx = new TelNoteRegx();
        String sex = telNoteRegx.sexValidate();
        boolean flag = true;
        for (Person person : list) {
            if(sex.equalsIgnoreCase(person.getSex())){
                System.out.println(person);
                flag = false;
            }
        }
        if(flag){
            System.out.println("There is no record of this person");
        }
    }
    /**
     * 按电话号码查询记录
     */
    public void searchByTelNum(){
        TelNoteRegx telNoteRegx = new TelNoteRegx();
        String telNum = telNoteRegx.telNumValidate();
        boolean flag = true;
        for (Person person : list) {
            if(telNum.equals(person.getTelNum())){
                System.out.println(person);
                flag = false;
            }
        }
        if(flag){
            System.out.println("There is no record of this person");
        }
    }
    /**
     * 按地址查询记录
     */
    public void searchByAdd(){
        TelNoteRegx telNoteRegx = new TelNoteRegx();
        String address = telNoteRegx.addressValidate();
        boolean flag = true;
        for (Person person : list){
            if(address.equals(person.getAddress())){
                System.out.println(person);
                flag = false;
            }
        }
        if(flag){
            System.out.println("There is no record of this person");
        }
    }
    /**
     * 修改指定记录
     */
    public void modifyOperation(){
        TelNoteRegx telNoteRegx = new TelNoteRegx();
        Menu menu = new Menu();
        //对被修改的记录的序号进行验证，可以使用对菜单项验证的方法来完成
        System.out.println("Please enter the id of the record");
        int itemNum = telNoteRegx.menuItemValidate(1,this.list.size());
        menu.subModifyMenu();
        int menuItem = telNoteRegx.menuItemValidate(1,6);
        switch(itemNum){
            case 1: String name = telNoteRegx.nameValidate();this.list.get(itemNum-1).setName(name); break;
            case 2: String age = telNoteRegx.ageValidate();this.list.get(itemNum-1).setAge(age);break;
            case 3: String sex = telNoteRegx.sexValidate();this.list.get(itemNum-1).setSex(sex);break;
            case 4: String telNum = telNoteRegx.telNumValidate();this.list.get(itemNum-1).setTelNum(telNum);break;
            case 5: String address = telNoteRegx.addressValidate();this.list.get(itemNum-1).setAddress(address);break;
            case 6: System.exit(0);
        }
    }
    /**
     * 删除指定记录
     */
    public void deleteOperation(){
        TelNoteRegx telNoteRegx = new TelNoteRegx();
        System.out.println("Please enter the id of the record to be deleted");
        int itemNum = telNoteRegx.menuItemValidate(1,this.list.size());
        this.list.remove(itemNum-1);
        //重新为记录设置新的序号
        for(int i=0;i<this.list.size();i++){
            this.list.get(i).setId(i+1);
        }
        System.out.println("Deleted successfully, please continue");
    }
    /**
     * 删除全部记录
     */
    public void deleteAllOperation(){
        this.list.clear();
        System.out.println("The record in the phone book has been cleared, please continue");
    }
    /**
     * 按用户姓名排序记录
     */
    public void orderByName(){
        Collections.sort(this.list,new OrderByName());
        for(int i=0;i<this.list.size();i++){
            this.list.get(i).setId(i+1);
        }
    }
    /**
     * 按用户年龄排序记录
     */
    public void orderByAge(){
        Collections.sort(this.list,new OrderByAge());
        for(int i=0;i<this.list.size();i++){
            this.list.get(i).setId(i+1);
        }
    }
    /**
     * 按用户性别排序记录
     */
    public void orderBySex(){
        Collections.sort(this.list,new OrderBySex());
        for(int i=0;i<this.list.size();i++){
            this.list.get(i).setId(i+1);
        }
    }
    /**
     * 按用户姓名排序的比较器
     */
    class OrderByName implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    /**
     * 按年龄排序的比较器
     */
    class OrderByAge implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getAge().compareTo(o2.getAge());
        }
    }
    /**
     * 按性别排序的比较器
     */
    class OrderBySex implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getSex().compareTo(o2.getSex());
        }
    }
}
