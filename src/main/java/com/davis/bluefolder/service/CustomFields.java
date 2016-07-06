package com.davis.bluefolder.service;

import java.util.ArrayList;

public class CustomFields{
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