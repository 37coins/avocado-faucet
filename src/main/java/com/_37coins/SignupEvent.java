package com._37coins;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class SignupEvent {
    
    public enum Source {
        MOVE,
        REFERRED,
        NEW
    }
    
    private String mobile;
    private PaymentAddress destination;
    private String referrer;
    private String signupCallback;
    private String welcomeMessage;
    private Source source;
    private String digestToken;

    public String getMobile() {
        return mobile;
    }
    public SignupEvent setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public PaymentAddress getDestination() {
        return destination;
    }
    public SignupEvent setDestination(PaymentAddress destination) {
        this.destination = destination;
        return this;
    }
    public String getReferrer() {
        return referrer;
    }
    public SignupEvent setReferrer(String referrer) {
        this.referrer = referrer;
        return this;
    }
    public String getSignupCallback() {
        return signupCallback;
    }
    public SignupEvent setSignupCallback(String signupCallback) {
        this.signupCallback = signupCallback;
        return this;
    }
    public String getWelcomeMessage() {
        return welcomeMessage;
    }
    public SignupEvent setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
        return this;
    }
    public Source getSource() {
        return source;
    }
    public SignupEvent setSource(Source source) {
        this.source = source;
        return this;
    }
    public String getDigestToken() {
        return digestToken;
    }
    public SignupEvent setDigestToken(String digestToken) {
        this.digestToken = digestToken;
        return this;
    }    
    
    
}
