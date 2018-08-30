package com.ideaout.dategirls.serviceImpl;

import com.ideaout.dategirls.dao.ActivityMapper;
import com.ideaout.dategirls.dao.DynamicsMapper;
import com.ideaout.dategirls.domain.Activity;
import com.ideaout.dategirls.domain.ActivityExample;
import com.ideaout.dategirls.http.requestParm.UploadActivityParm;
import com.ideaout.dategirls.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    ActivityMapper activityMapper;

    @Override
    public Object uploadActivity(Activity activity) {
        return activityMapper.insert(activity);
    }

    @Override
    public Object queryLastActivity() {
        ActivityExample activityExample = new ActivityExample();
        activityExample.setOrderByClause("start_time desc");  //某个字段 降序排序
        activityExample.setLimit(1);
        return activityMapper.selectByExample(activityExample);
    }
}
