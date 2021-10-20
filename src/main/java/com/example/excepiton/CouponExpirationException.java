package com.example.excepiton;

public class CouponExpirationException extends CustomException {

    private static final long serialVersionUID = -2116671122895194101L;

    public CouponExpirationException() {
        super(ErrorCode.COUPON_EXPIRATION);
    }
}