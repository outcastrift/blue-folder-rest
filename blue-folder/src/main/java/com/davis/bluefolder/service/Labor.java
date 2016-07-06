package com.davis.bluefolder.service;

import java.util.Date;

public class Labor{
        private LaborItem laborItem;


        public LaborItem getLaborItem() {
            return laborItem;
        }

        public void setLaborItem(LaborItem laborItem) {
            this.laborItem = laborItem;
        }

        private class LaborItem{

            private String createdByUserID;
            private double itemUnitPrice;
            private String notes;
            private String serviceRequestID;
            private String notesPrivate;
            private int taxable;
            private double totalprice;
            private int itemIsFlatRate;
            private String apptID;
            private int billable;
            private String userID;
            private String billingStatus;
            private double duration;
            private double totalPriceBillable;
            private String itemID;
            private Date dateTimeCreated;
            private String id;
            private String itemDescription;
            private Date dateWorked;
            private String taskID;
            private double totalCost;
            private double itemUnitCost;

            public String getCreatedByUserID() {
                return createdByUserID;
            }

            public void setCreatedByUserID(String createdByUserID) {
                this.createdByUserID = createdByUserID;
            }

            public double getItemUnitPrice() {
                return itemUnitPrice;
            }

            public void setItemUnitPrice(double itemUnitPrice) {
                this.itemUnitPrice = itemUnitPrice;
            }

            public String getNotes() {
                return notes;
            }

            public void setNotes(String notes) {
                this.notes = notes;
            }

            public String getServiceRequestID() {
                return serviceRequestID;
            }

            public void setServiceRequestID(String serviceRequestID) {
                this.serviceRequestID = serviceRequestID;
            }

            public String getNotesPrivate() {
                return notesPrivate;
            }

            public void setNotesPrivate(String notesPrivate) {
                this.notesPrivate = notesPrivate;
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

            public int getItemIsFlatRate() {
                return itemIsFlatRate;
            }

            public void setItemIsFlatRate(int itemIsFlatRate) {
                this.itemIsFlatRate = itemIsFlatRate;
            }

            public String getApptID() {
                return apptID;
            }

            public void setApptID(String apptID) {
                this.apptID = apptID;
            }

            public int getBillable() {
                return billable;
            }

            public void setBillable(int billable) {
                this.billable = billable;
            }

            public String getUserID() {
                return userID;
            }

            public void setUserID(String userID) {
                this.userID = userID;
            }

            public String getBillingStatus() {
                return billingStatus;
            }

            public void setBillingStatus(String billingStatus) {
                this.billingStatus = billingStatus;
            }

            public double getDuration() {
                return duration;
            }

            public void setDuration(double duration) {
                this.duration = duration;
            }

            public double getTotalPriceBillable() {
                return totalPriceBillable;
            }

            public void setTotalPriceBillable(double totalPriceBillable) {
                this.totalPriceBillable = totalPriceBillable;
            }

            public String getItemID() {
                return itemID;
            }

            public void setItemID(String itemID) {
                this.itemID = itemID;
            }

            public Date getDateTimeCreated() {
                return dateTimeCreated;
            }

            public void setDateTimeCreated(Date dateTimeCreated) {
                this.dateTimeCreated = dateTimeCreated;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getItemDescription() {
                return itemDescription;
            }

            public void setItemDescription(String itemDescription) {
                this.itemDescription = itemDescription;
            }

            public Date getDateWorked() {
                return dateWorked;
            }

            public void setDateWorked(Date dateWorked) {
                this.dateWorked = dateWorked;
            }

            public String getTaskID() {
                return taskID;
            }

            public void setTaskID(String taskID) {
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