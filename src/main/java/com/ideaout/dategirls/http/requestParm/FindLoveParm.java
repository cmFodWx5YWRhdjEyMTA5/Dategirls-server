package com.ideaout.dategirls.http.requestParm;

public class FindLoveParm {
    public String userid;  //必传
    public int sex;
    public int ageMax;
    public int ageMin;
    public String city;
    public int pageIndex;//设置分页开始
    public int pageSize;//设置分页的每页的数量
}
