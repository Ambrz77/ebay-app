package com.example.alireza.onlineshop;

public class NewItem {
    String Name, Description, Date;
    int Size, Weight, Amount = 0;

    NewItem() {
    }

    NewItem(String date) {
        Date = date;
    }

    NewItem(String date, String description) {
        Date = date;
        Description = description;
    }
    /*NewItem(String description){
        Description = description;
    }*/
}
class FoodItem extends NewItem {
    FoodItem() {
        super();
    }

    FoodItem(String ExpirationDate) {
        super(ExpirationDate);
    }
}

class ElectronicalItem extends NewItem {
    ElectronicalItem() {
        super();
    }

    ElectronicalItem(String date, String description) {
        super(date, description);
    }
}

class SensitiveItem extends NewItem {
    SensitiveItem() {
        super();
    }

    SensitiveItem(String maintenance) {
        super(maintenance);
    }
}

class OtherItems extends NewItem {
    OtherItems() {
        super();
    }
}
