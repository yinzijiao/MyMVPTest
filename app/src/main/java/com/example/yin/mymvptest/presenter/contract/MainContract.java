package com.example.yin.mymvptest.presenter.contract;

import com.example.yin.mymvptest.base.BasePresenter;
import com.example.yin.mymvptest.base.BaseView;
import com.example.yin.mymvptest.model.Bean;

/**
 * Created by yin on 2016/9/18.
 */
public interface MainContract {
    interface View extends BaseView{
        void setContent(Bean bean);
    }
    interface Presenter extends BasePresenter<View>{
        void getData();
    }
}
