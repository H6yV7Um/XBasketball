package com.xu.xbasketball.model;

import com.xu.xbasketball.model.bean.HupuNewsDetailBean;
import com.xu.xbasketball.model.bean.HupuResultBean;
import com.xu.xbasketball.model.bean.ScoreBoardBean;
import com.xu.xbasketball.model.http.HttpHelper;

import io.reactivex.Flowable;

/**
 * Created by Xu on 2018/3/25.
 */

public class DataManager implements HttpHelper {

    HttpHelper mHttpHelper;

    public DataManager(HttpHelper mHttpHelper) {
        this.mHttpHelper = mHttpHelper;
    }

    @Override
    public Flowable<ScoreBoardBean> getDailyScore(String startTime, String endTime) {
        return mHttpHelper.getDailyScore(startTime, endTime);
    }

    @Override
    public Flowable<HupuResultBean> getNews(String client) {
        return mHttpHelper.getNews(client);
    }

    @Override
    public Flowable<HupuNewsDetailBean> getNewsDetail(String client, String nid) {
        return mHttpHelper.getNewsDetail(client, nid);
    }

}
