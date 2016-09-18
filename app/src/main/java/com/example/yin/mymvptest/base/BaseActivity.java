package com.example.yin.mymvptest.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by yin on 2016/9/18.
 */
public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity implements BaseView{

    protected T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setPresenter();
        mPresenter.attachView(this);
    }

    protected abstract void setPresenter();

    public void setPresenter(T presenter){
        mPresenter = presenter;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }

    @Override
    public void showError(String err) {

    }

    @Override
    public void setNight() {

    }
}
