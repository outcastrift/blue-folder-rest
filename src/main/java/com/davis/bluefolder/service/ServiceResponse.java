package com.davis.bluefolder.service;

/**
 * This software was created for
 * All rights to this software belong to
 * appropriate licenses and restrictions apply.
 * Created by Samuel Davis on 7/5/16.
 * Class Description
 */
public class ServiceResponse {
    private ServiceRequest serviceRequest;
    private Log log;
    private Expenses expenses;
    private CustomFields customFields;
    private Labor labor;

    public ServiceRequest getServiceResponse() {
        return serviceRequest;
    }

    public void setServiceResponse(ServiceRequest serviceResponse) {
        this.serviceRequest = serviceResponse;
    }

    public Log getLog() {
        return log;
    }

    public void setLog(Log log) {
        this.log = log;
    }

    public Expenses getExpenses() {
        return expenses;
    }

    public void setExpenses(Expenses expenses) {
        this.expenses = expenses;
    }

    public CustomFields getCustomFields() {
        return customFields;
    }

    public void setCustomFields(CustomFields customFields) {
        this.customFields = customFields;
    }

    public Labor getLabor() {
        return labor;
    }

    public void setLabor(Labor labor) {
        this.labor = labor;
    }
}
