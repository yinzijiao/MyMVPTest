package com.example.yin.mymvptest.ui;

import android.os.Bundle;
import android.widget.TextView;

import com.example.yin.mymvptest.R;
import com.example.yin.mymvptest.base.BaseActivity;
import com.example.yin.mymvptest.model.Bean;
import com.example.yin.mymvptest.presenter.MainPresenter;
import com.example.yin.mymvptest.presenter.contract.MainContract;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View {

    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mPresenter.getData();
    }

    protected void initView() {
        mTextView = (TextView) findViewById(R.id.textview);
    }

    @Override
    protected void setPresenter() {
        setPresenter(new MainPresenter());
    }

    @Override
    public void setContent(Bean bean) {
        mTextView.setText(bean.getS());
    }
}
