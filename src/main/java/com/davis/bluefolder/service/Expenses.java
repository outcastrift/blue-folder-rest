package com.davis.bluefolder.service;

import java.util.Date;

public class Expenses{
        private ExpenseItem expenseItem ;

        public ExpenseItem getExpenseItem() {
            return expenseItem;
        }

        public void setExpenseItem(ExpenseItem expenseItem) {
            this.expenseItem = expenseItem;
        }
        private class ExpenseItem{

            private int createdByUserID;
            private double itemUnitPrice;
            private double itemQuantity;
            private String notes;
            private int serviceRequestID;
            private int taxable;
            private double totalprice;
            private int apptID;
            private int billable;
            private int userID;
            private String billingStatus;
            private Date dateUsed;
            private double totalPriceBillable;
            private int itemID;
            private Date dateTimeCreated;
            private int id;
            private String itemDescription;
            private int taskID;
            private double totalCost;
            private double itemUnitCost;

            public int getCreatedByUserID() {
                return createdByUserID;
            }

            public void setCreatedByUserID(int createdByUserID) {
                this.createdByUserID = createdByUserID;
            }

            public double getItemUnitPrice() {
                return itemUnitPrice;
            }

            public void setItemUnitPrice(double itemUnitPrice) {
                this.itemUnitPrice = itemUnitPrice;
            }

            public double getItemQuantity() {
                return itemQuantity;
            }

            public void setItemQuantity(double itemQuantity) {
                this.itemQuantity = itemQuantity;
            }

            public String getNotes() {
                return notes;
            }

            public void setNotes(String notes) {
                this.notes = notes;
            }

            public int getServiceRequestID() {
                return serviceRequestID;
            }

            public void setServiceRequestID(int serviceRequestID) {
                this.serviceRequestID = serviceRequestID;
            }

            public int getTaxable() {
                return taxable;
            }

            public void setTaxable(int taxable) {
                this.taxable = taxable;
            }

            public double getTotalprice() {
                return totalprice;
            }

            public void setTotalprice(double totalprice) {
                this.totalprice = totalprice;
            }

            public int getApptID() {
                return apptID;
            }

            public void setApptID(int apptID) {
                this.apptID = apptID;
            }

            public int getBillable() {
                return billable;
            }

            public void setBillable(int billable) {
                this.billable = billable;
            }

            public int getUserID() {
                return userID;
            }

            public void setUserID(int userID) {
                this.userID = userID;
            }

            public String getBillingStatus() {
                return billingStatus;
            }

            public void setBillingStatus(String billingStatus) {
                this.billingStatus = billingStatus;
            }

            public Date getDateUsed() {
                return dateUsed;
            }

            public void setDateUsed(Date dateUsed) {
                this.dateUsed = dateUsed;
            }

            public double getTotalPriceBillable() {
                return totalPriceBillable;
            }

            public void setTotalPriceBillable(double totalPriceBillable) {
                this.totalPriceBillable = totalPriceBillable;
            }

            public int getItemID() {
                return itemID;
            }

            public void setItemID(int itemID) {
                this.itemID = itemID;
            }

            public Date getDateTimeCreated() {
                return dateTimeCreated;
            }

            public void setDateTimeCreated(Date dateTimeCreated) {
                this.dateTimeCreated = dateTimeCreated;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getItemDescription() {
                return itemDescription;
            }

            public void setItemDescription(String itemDescription) {
                this.itemDescription = itemDescription;
            }

            public int getTaskID() {
                return taskID;
            }

            public void setTaskID(int taskID) {
                this.taskID = taskID;
            }

            public double getTotalCost() {
                return totalCost;
            }

            public void setTotalCost(double totalCost) {
                this.totalCost = totalCost;
            }

            public double getItemUnitCost() {
                return itemUnitCost;
            }

            public void setItemUnitCost(double itemUnitCost) {
                this.itemUnitCost = itemUnitCost;
            }
        }
    }