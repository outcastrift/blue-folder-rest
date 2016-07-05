package com.davis.bluefolder.service;

import java.util.ArrayList;

/**
 * This software was created for
 * All rights to this software belong to
 * appropriate licenses and restrictions apply.
 * Created by Samuel Davis on 7/5/16.
 * Class Description
 */
public class Expenses {
    private ArrayList<ExpenseItem> expenseItem ;

    public ArrayList<ExpenseItem> getExpenseItem() {
        return expenseItem;
    }

    public void setExpenseItem(ArrayList<ExpenseItem> expenseItem) {
        this.expenseItem = expenseItem;
    }
}
