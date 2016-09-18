package com.example.yin.mymvptest.base;

/**
 * Created by yin on 2016/9/18.
 */
public interface BasePresenter<T extends BaseView> {
    void attachView(T view);
    void detachView();
}
