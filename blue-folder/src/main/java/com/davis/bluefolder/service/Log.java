package com.davis.bluefolder.service;

import java.util.ArrayList;
import java.util.Date;

public class Log{
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