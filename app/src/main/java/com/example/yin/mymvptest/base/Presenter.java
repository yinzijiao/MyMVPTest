package com.example.yin.mymvptest.base;

/**
 * Created by yin on 2016/9/18.
 */
public class Presenter<T extends BaseView> implements BasePresenter<T> {

    protected T view;

    @Override
    public void attachView(T view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        view = null;
    }
}
