package com.example.yin.mymvptest.presenter;

import com.example.yin.mymvptest.base.Presenter;
import com.example.yin.mymvptest.model.Bean;
import com.example.yin.mymvptest.presenter.contract.MainContract;

/**
 * Created by yin on 2016/9/18.
 */
public class MainPresenter extends Presenter<MainContract.View> implements MainContract.Presenter {

    @Override
    public void getData() {
        Bean bean = new Bean();
        bean.setS("MVP");
        view.setContent(bean);
    }
}
