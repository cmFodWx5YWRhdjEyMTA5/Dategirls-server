package com.ideaout.dategirls.http;

public class ResponseDataBase<T>{
    public int code;
    public T data;
    public String errorDec;


    @Override
    public String toString() {
        return "ResponseDataBase{" +
                "code=" + code +
                ", data=" + data +
                ", errorDec='" + errorDec + '\'' +
                '}';
    }
}
