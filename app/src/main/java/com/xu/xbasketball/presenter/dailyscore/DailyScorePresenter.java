package com.xu.xbasketball.presenter.dailyscore;

import com.xu.xbasketball.base.RxPresenter;
import com.xu.xbasketball.base.contract.dailyscore.DailyScoreContract;

/**
 * Created by Xu on 2018/3/11.
 */

public class DailyScorePresenter extends RxPresenter<DailyScoreContract.View> implements DailyScoreContract.Presenter {

    public DailyScorePresenter(DailyScoreContract.View view) {
        attach(view);
    }

    @Override
    public void getDailyScore(String startTime, String endTime) {
//        addSubscribe();
    }
}