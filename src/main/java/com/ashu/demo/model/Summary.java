package com.ashu.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



    @Entity
    public class Summary {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id;


        @NotNull
        @Size(min=5,message = "please enter summary")
        private String summarytext;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getSummarytext() {
            return summarytext;
        }

        public void setSummarytext(String summarytext) {
            this.summarytext = summarytext;
        }
    }


