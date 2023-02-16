package com.shop.exception;

public class OutOfStockException extends RuntimeException{ //클래스

    public OutOfStockException(String message){ //생성자
        super(message); //조상 클래스의 생성자를 호출할떄 사용 this는 같은 클래스의 다른 생성자를 호출할떄 사용
    }
}
