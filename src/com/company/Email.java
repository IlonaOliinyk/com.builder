package com.company;

/**
 * Created by ilona.oliinyk_tac on 06.06.2017.
 */
public class Email {
    private String to;
    private String cc;
    private String subject;
    private String body;
    private int priority;
    private boolean attachment;


    public static class Builder{
        private final String to;
        private String cc;
        private String subject;
        private String body;
        private int priority;
        private boolean attachment = false;

        public Builder (String to){
            this.to = to;}

        public Builder cc (String value){
            cc = value;
            return this;
        }
        public Builder subject (String value){
            subject = value;
            return this;
        }

        public Builder body (String value){
            body = value;
            return this;
        }

        public Builder priority (int value){
            priority = value;
            return this;
        }

            public Builder attachment (boolean value){
            attachment = value;
            return this;
        }

        public Email build(){
                return new Email(this);}
        }

        private Email(Builder builder){
        to = builder.to;
        cc = builder.cc;
        subject = builder.subject;
        body = builder.body;
        priority = builder.priority;
        attachment = builder.attachment;

        }


    }

