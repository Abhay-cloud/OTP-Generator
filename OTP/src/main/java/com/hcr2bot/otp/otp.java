package com.hcr2bot.otp;

public class otp {
    public static int generateOTP(){
        int createOTP = (int) (Math.random()*(999999-100000+1)+100000);
        return createOTP;
    }
}
