package com.davis.bluefolder.service;

import java.util.ArrayList;
import java.util.Date;

/**
 * This software was created for
 * All rights to this software belong to
 * appropriate licenses and restrictions apply.
 * Created by Samuel Davis on 7/5/16.
 * Class Description
 */
public class ServiceRequest {

    private int assignedToUserID;
    private String assignedToUser;
    private int createdByUserID;
    private String notes;
    private double taxableExpensesAmount;
    private double timeOpen_hours;
    private String requestDetails;
    private int requestVerified;
    private int billToPostalCode;
    private String billToState;
    private String externalID;
    private int taxCodeID;
    private String billToAddressName;
    private double billableTotal;
    private String billToCity;
    private int purchaseOrderNo;
    private double taxableLaborAmount;
    private Date dateTimeCreated;
    private int customerLocationID;
    private String closingComments;
    private String customerLocationName;
    private double billableMaterialsPrice;
    private String invoiceNo;
    private String timeOpen;
    private double costMaterials;
    private String billToStreetAddress;
    private String customerContactName;
    private double nonBillableLaborPrice;
    private String customerContactEmail;
    private String customerLocationState;
    private double taxableMaterialsAmount;
    private String priority;
    private String customerName;

    private String customerLocationZone;
    private double taxRate;
    private String customerContactPhone;
    private String customerAction;
    private int customerLocationPostalCode;
    private String billToCountry;
    private double costLabor;
    private int customerID;
    private String closingReason;
    private double costTotal;
    private Date dateTimeClosed;
    private double taxAmount;
    private double nonBillableTotal;
    private String status;
    private String customerLocationNotes;

    private double nonBillableExpensesPrice;
    private int customerContactID;
    private String createdByUser;

    private String nonBillableMaterialsPrice;
    private String description;
    private double costExpenses;
    private String customerLocationStreetAddress;
    private double billableLaborPrice;
    private double taxableAmount;
    private int serviceRequestID;
    private String referenceNo;
    private String requestType;
    private int billToAddressID;
    private String billToName;
    private int billable;
    private String customerContactPhoneMobile;
    private String invoiceSystem;
    private String billingStatus;
    private int serviceManagerID;
    private double billableExpensesPrice;
    private double billableLaborHours;
    private String customerLocationCountry;
    private String invoiceURL;
    private String customerLocationCity;
    private int billToID;
    private String category;
    private Date dateTimeExportedForBilling;
    private double nonBillableLaborHours;
    private String serviceManager;
    private Log log;
    private CustomFields customFields;
    private Expenses expenses;
    private Labor labor;

    public int getAssignedToUserID() {
        return assignedToUserID;
    }

    public void setAssignedToUserID(int assignedToUserID) {
        this.assignedToUserID = assignedToUserID;
    }

    public String getAssignedToUser() {
        return assignedToUser;
    }

    public void setAssignedToUser(String assignedToUser) {
        this.assignedToUser = assignedToUser;
    }

    public int getCreatedByUserID() {
        return createdByUserID;
    }

    public void setCreatedByUserID(int createdByUserID) {
        this.createdByUserID = createdByUserID;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public double getTaxableExpensesAmount() {
        return taxableExpensesAmount;
    }

    public void setTaxableExpensesAmount(double taxableExpensesAmount) {
        this.taxableExpensesAmount = taxableExpensesAmount;
    }

    public double getTimeOpen_hours() {
        return timeOpen_hours;
    }

    public void setTimeOpen_hours(double timeOpen_hours) {
        this.timeOpen_hours = timeOpen_hours;
    }

    public String getRequestDetails() {
        return requestDetails;
    }

    public void setRequestDetails(String requestDetails) {
        this.requestDetails = requestDetails;
    }

    public int getRequestVerified() {
        return requestVerified;
    }

    public void setRequestVerified(int requestVerified) {
        this.requestVerified = requestVerified;
    }

    public int getBillToPostalCode() {
        return billToPostalCode;
    }

    public void setBillToPostalCode(int billToPostalCode) {
        this.billToPostalCode = billToPostalCode;
    }

    public String getBillToState() {
        return billToState;
    }

    public void setBillToState(String billToState) {
        this.billToState = billToState;
    }

    public String getExternalID() {
        return externalID;
    }

    public void setExternalID(String externalID) {
        this.externalID = externalID;
    }

    public int getTaxCodeID() {
        return taxCodeID;
    }

    public void setTaxCodeID(int taxCodeID) {
        this.taxCodeID = taxCodeID;
    }

    public String getBillToAddressName() {
        return billToAddressName;
    }

    public void setBillToAddressName(String billToAddressName) {
        this.billToAddressName = billToAddressName;
    }

    public double getBillableTotal() {
        return billableTotal;
    }

    public void setBillableTotal(double billableTotal) {
        this.billableTotal = billableTotal;
    }

    public String getBillToCity() {
        return billToCity;
    }

    public void setBillToCity(String billToCity) {
        this.billToCity = billToCity;
    }

    public int getPurchaseOrderNo() {
        return purchaseOrderNo;
    }

    public void setPurchaseOrderNo(int purchaseOrderNo) {
        this.purchaseOrderNo = purchaseOrderNo;
    }

    public double getTaxableLaborAmount() {
        return taxableLaborAmount;
    }

    public void setTaxableLaborAmount(double taxableLaborAmount) {
        this.taxableLaborAmount = taxableLaborAmount;
    }

    public Date getDateTimeCreated() {
        return dateTimeCreated;
    }

    public void setDateTimeCreated(Date dateTimeCreated) {
        this.dateTimeCreated = dateTimeCreated;
    }

    public int getCustomerLocationID() {
        return customerLocationID;
    }

    public void setCustomerLocationID(int customerLocationID) {
        this.customerLocationID = customerLocationID;
    }

    public String getClosingComments() {
        return closingComments;
    }

    public void setClosingComments(String closingComments) {
        this.closingComments = closingComments;
    }

    public String getCustomerLocationName() {
        return customerLocationName;
    }

    public void setCustomerLocationName(String customerLocationName) {
        this.customerLocationName = customerLocationName;
    }

    public double getBillableMaterialsPrice() {
        return billableMaterialsPrice;
    }

    public void setBillableMaterialsPrice(double billableMaterialsPrice) {
        this.billableMaterialsPrice = billableMaterialsPrice;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getTimeOpen() {
        return timeOpen;
    }

    public void setTimeOpen(String timeOpen) {
        this.timeOpen = timeOpen;
    }

    public double getCostMaterials() {
        return costMaterials;
    }

    public void setCostMaterials(double costMaterials) {
        this.costMaterials = costMaterials;
    }

    public String getBillToStreetAddress() {
        return billToStreetAddress;
    }

    public void setBillToStreetAddress(String billToStreetAddress) {
        this.billToStreetAddress = billToStreetAddress;
    }

    public String getCustomerContactName() {
        return customerContactName;
    }

    public void setCustomerContactName(String customerContactName) {
        this.customerContactName = customerContactName;
    }

    public double getNonBillableLaborPrice() {
        return nonBillableLaborPrice;
    }

    public void setNonBillableLaborPrice(double nonBillableLaborPrice) {
        this.nonBillableLaborPrice = nonBillableLaborPrice;
    }

    public String getCustomerContactEmail() {
        return customerContactEmail;
    }

    public void setCustomerContactEmail(String customerContactEmail) {
        this.customerContactEmail = customerContactEmail;
    }

    public String getCustomerLocationState() {
        return customerLocationState;
    }

    public void setCustomerLocationState(String customerLocationState) {
        this.customerLocationState = customerLocationState;
    }

    public double getTaxableMaterialsAmount() {
        return taxableMaterialsAmount;
    }

    public void setTaxableMaterialsAmount(double taxableMaterialsAmount) {
        this.taxableMaterialsAmount = taxableMaterialsAmount;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerLocationZone() {
        return customerLocationZone;
    }

    public void setCustomerLocationZone(String customerLocationZone) {
        this.customerLocationZone = customerLocationZone;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public String getCustomerContactPhone() {
        return customerContactPhone;
    }

    public void setCustomerContactPhone(String customerContactPhone) {
        this.customerContactPhone = customerContactPhone;
    }

    public String getCustomerAction() {
        return customerAction;
    }

    public void setCustomerAction(String customerAction) {
        this.customerAction = customerAction;
    }

    public int getCustomerLocationPostalCode() {
        return customerLocationPostalCode;
    }

    public void setCustomerLocationPostalCode(int customerLocationPostalCode) {
        this.customerLocationPostalCode = customerLocationPostalCode;
    }

    public String getBillToCountry() {
        return billToCountry;
    }

    public void setBillToCountry(String billToCountry) {
        this.billToCountry = billToCountry;
    }

    public double getCostLabor() {
        return costLabor;
    }

    public void setCostLabor(double costLabor) {
        this.costLabor = costLabor;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getClosingReason() {
        return closingReason;
    }

    public void setClosingReason(String closingReason) {
        this.closingReason = closingReason;
    }

    public double getCostTotal() {
        return costTotal;
    }

    public void setCostTotal(double costTotal) {
        this.costTotal = costTotal;
    }

    public Date getDateTimeClosed() {
        return dateTimeClosed;
    }

    public void setDateTimeClosed(Date dateTimeClosed) {
        this.dateTimeClosed = dateTimeClosed;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getNonBillableTotal() {
        return nonBillableTotal;
    }

    public void setNonBillableTotal(double nonBillableTotal) {
        this.nonBillableTotal = nonBillableTotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCustomerLocationNotes() {
        return customerLocationNotes;
    }

    public void setCustomerLocationNotes(String customerLocationNotes) {
        this.customerLocationNotes = customerLocationNotes;
    }

    public double getNonBillableExpensesPrice() {
        return nonBillableExpensesPrice;
    }

    public void setNonBillableExpensesPrice(double nonBillableExpensesPrice) {
        this.nonBillableExpensesPrice = nonBillableExpensesPrice;
    }

    public int getCustomerContactID() {
        return customerContactID;
    }

    public void setCustomerContactID(int customerContactID) {
        this.customerContactID = customerContactID;
    }

    public String getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(String createdByUser) {
        this.createdByUser = createdByUser;
    }

    public String getNonBillableMaterialsPrice() {
        return nonBillableMaterialsPrice;
    }

    public void setNonBillableMaterialsPrice(String nonBillableMaterialsPrice) {
        this.nonBillableMaterialsPrice = nonBillableMaterialsPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCostExpenses() {
        return costExpenses;
    }

    public void setCostExpenses(double costExpenses) {
        this.costExpenses = costExpenses;
    }

    public String getCustomerLocationStreetAddress() {
        return customerLocationStreetAddress;
    }

    public void setCustomerLocationStreetAddress(String customerLocationStreetAddress) {
        this.customerLocationStreetAddress = customerLocationStreetAddress;
    }

    public double getBillableLaborPrice() {
        return billableLaborPrice;
    }

    public void setBillableLaborPrice(double billableLaborPrice) {
        this.billableLaborPrice = billableLaborPrice;
    }

    public double getTaxableAmount() {
        return taxableAmount;
    }

    public void setTaxableAmount(double taxableAmount) {
        this.taxableAmount = taxableAmount;
    }

    public int getServiceRequestID() {
        return serviceRequestID;
    }

    public void setServiceRequestID(int serviceRequestID) {
        this.serviceRequestID = serviceRequestID;
    }

    public String getReferenceNo() {
        return referenceNo;
    }

    public void setReferenceNo(String referenceNo) {
        this.referenceNo = referenceNo;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public int getBillToAddressID() {
        return billToAddressID;
    }

    public void setBillToAddressID(int billToAddressID) {
        this.billToAddressID = billToAddressID;
    }

    public String getBillToName() {
        return billToName;
    }

    public void setBillToName(String billToName) {
        this.billToName = billToName;
    }

    public int getBillable() {
        return billable;
    }

    public void setBillable(int billable) {
        this.billable = billable;
    }

    public String getCustomerContactPhoneMobile() {
        return customerContactPhoneMobile;
    }

    public void setCustomerContactPhoneMobile(String customerContactPhoneMobile) {
        this.customerContactPhoneMobile = customerContactPhoneMobile;
    }

    public String getInvoiceSystem() {
        return invoiceSystem;
    }

    public void setInvoiceSystem(String invoiceSystem) {
        this.invoiceSystem = invoiceSystem;
    }

    public String getBillingStatus() {
        return billingStatus;
    }

    public void setBillingStatus(String billingStatus) {
        this.billingStatus = billingStatus;
    }

    public int getServiceManagerID() {
        return serviceManagerID;
    }

    public void setServiceManagerID(int serviceManagerID) {
        this.serviceManagerID = serviceManagerID;
    }

    public double getBillableExpensesPrice() {
        return billableExpensesPrice;
    }

    public void setBillableExpensesPrice(double billableExpensesPrice) {
        this.billableExpensesPrice = billableExpensesPrice;
    }

    public double getBillableLaborHours() {
        return billableLaborHours;
    }

    public void setBillableLaborHours(double billableLaborHours) {
        this.billableLaborHours = billableLaborHours;
    }

    public String getCustomerLocationCountry() {
        return customerLocationCountry;
    }

    public void setCustomerLocationCountry(String customerLocationCountry) {
        this.customerLocationCountry = customerLocationCountry;
    }

    public String getInvoiceURL() {
        return invoiceURL;
    }

    public void setInvoiceURL(String invoiceURL) {
        this.invoiceURL = invoiceURL;
    }

    public String getCustomerLocationCity() {
        return customerLocationCity;
    }

    public void setCustomerLocationCity(String customerLocationCity) {
        this.customerLocationCity = customerLocationCity;
    }

    public int getBillToID() {
        return billToID;
    }

    public void setBillToID(int billToID) {
        this.billToID = billToID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDateTimeExportedForBilling() {
        return dateTimeExportedForBilling;
    }

    public void setDateTimeExportedForBilling(Date dateTimeExportedForBilling) {
        this.dateTimeExportedForBilling = dateTimeExportedForBilling;
    }

    public double getNonBillableLaborHours() {
        return nonBillableLaborHours;
    }

    public void setNonBillableLaborHours(double nonBillableLaborHours) {
        this.nonBillableLaborHours = nonBillableLaborHours;
    }

    public String getServiceManager() {
        return serviceManager;
    }

    public void setServiceManager(String serviceManager) {
        this.serviceManager = serviceManager;
    }

    public Log getLog() {
        return log;
    }

    public void setLog(Log log) {
        this.log = log;
    }

    public CustomFields getCustomFields() {
        return customFields;
    }

    public void setCustomFields(CustomFields customFields) {
        this.customFields = customFields;
    }

    public Expenses getExpenses() {
        return expenses;
    }

    public void setExpenses(Expenses expenses) {
        this.expenses = expenses;
    }

    public Labor getLabor() {
        return labor;
    }

    public void setLabor(Labor labor) {
        this.labor = labor;
    }

    /**
     *
     * Nested Classes
     * ***/
    private class Log{
        private ArrayList<LogEntry> logEntry;

        public ArrayList<LogEntry> getLogEntry() {
            return logEntry;
        }

        public void setLogEntry(ArrayList<LogEntry> logEntry) {
            this.logEntry = logEntry;
        }

        private class LogEntry{

            private int createdByUserID;
            private String entryType;
            private Date dateTimeCreated;
            private int serviceRequestID;
            private String comment_public;
            private String description;
            private int id;
            private String comment_private;


            public int getCreatedByUserID() {
                return createdByUserID;
            }

            public void setCreatedByUserID(int createdByUserID) {
                this.createdByUserID = createdByUserID;
            }

            public String getEntryType() {
                return entryType;
            }

            public void setEntryType(String entryType) {
                this.entryType = entryType;
            }

            public Date getDateTimeCreated() {
                return dateTimeCreated;
            }

            public void setDateTimeCreated(Date dateTimeCreated) {
                this.dateTimeCreated = dateTimeCreated;
            }

            public int getServiceRequestID() {
                return serviceRequestID;
            }

            public void setServiceRequestID(int serviceRequestID) {
                this.serviceRequestID = serviceRequestID;
            }

            public String getComment_public() {
                return comment_public;
            }

            public void setComment_public(String comment_public) {
                this.comment_public = comment_public;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getComment_private() {
                return comment_private;
            }

            public void setComment_private(String comment_private) {
                this.comment_private = comment_private;
            }
        }
    }
    private class Labor{
        private ArrayList<LaborItem> laborItem;


        public ArrayList<LaborItem> getLaborItem() {
            return laborItem;
        }

        public void setLaborItem(ArrayList<LaborItem> laborItem) {
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
    private class CustomFields{
        private ArrayList<CustomField> customField;

        public ArrayList<CustomField> getCustomField() {
            return customField;
        }

        public void setCustomField(ArrayList<CustomField> customField) {
            this.customField = customField;
        }
        private class CustomField{
            private String name;
            private String value;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }
    }
    private class Expenses{
        private ArrayList<ExpenseItem> expenseItem ;

        public ArrayList<ExpenseItem> getExpenseItem() {
            return expenseItem;
        }

        public void setExpenseItem(ArrayList<ExpenseItem> expenseItem) {
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
}
