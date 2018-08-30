package com.ideaout.dategirls.http;

public class RequestParmBase<T>{
    public String requestNo;
    public long requestTimestamp;
    public long userID;
    public String userToken;
    public T requestData;


    @Override
    public String toString() {
        return "RequestParmBase{" +
                "requestNo='" + requestNo + '\'' +
                ", requestTimestamp='" + requestTimestamp + '\'' +
                ", userID='" + userID + '\'' +
                ", userToken='" + userToken + '\'' +
                ", requestData=" + requestData +
                '}';
    }
}
