package com.ideaout.dategirls.service;

import com.ideaout.dategirls.domain.Activity;
import com.ideaout.dategirls.http.requestParm.UploadActivityParm;

public interface ActivityService {

    Object uploadActivity(Activity activity);
    Object queryLastActivity();
}
