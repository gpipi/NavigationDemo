package com.lorenzogao.navlibrary;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import navigation.lorenzogao.com.mylibrary.R;

/**
 * 作者：Lorenzo Gao
 * Date: 2017/12/13
 * Time: 14:50
 * 邮箱：2508719070@qq.com
 * Description:   默认导航栏
 */

public class DefaultNavigationBar extends AbsNavigationBar<DefaultNavigationBar.Builder> {


    public DefaultNavigationBar(Builder builder) {
        super(builder);



    }

    @Override
    public void attachNavigationParams() {
        super.attachNavigationParams();

        findViewById(R.id.tv_menutext).setVisibility(getBuilder().mRightVisible);


        ImageView imageView1= findViewById(R.id.iv_menu);
        imageView1.setImageResource(getBuilder().mRightIcon);

        findViewById(R.id.iv_menu).setVisibility(getBuilder().mRightIconVisible);


     ImageView imageView= findViewById(R.id.iv_back);
     imageView.setImageResource(getBuilder().mLeftIcon);

        findViewById(R.id.iv_back).setVisibility(getBuilder().mLeftIconVisible);
    }

    /**
     * 导航栏的builder
     */
    public static class Builder extends  AbsNavigationBar.Builder<DefaultNavigationBar.Builder>{

        public int mRightVisible=View.GONE;

        public int mRightIconVisible=View.GONE;

        public int mLeftIconVisible=View.VISIBLE;

        public int mRightIcon;

        public int mLeftIcon;

        public Builder(Context context, ViewGroup parent) {
            super(context, R.layout.default_navigation, parent);
        }

        @Override
        public AbsNavigationBar create() {
            return new DefaultNavigationBar(this);
        }


        public Builder setTitle(String text ){
            setText(R.id.tv_title,text);
            return  this;
        }

        public Builder setRightText(String text ){
            setText(R.id.tv_menutext,text);
            return  this;
        }

        public Builder setLeftClickListener(View.OnClickListener click){
            setOnClickListener(R.id.iv_back, click );
            return  this;
        }

        public Builder setRightClickListener(View.OnClickListener click){
            setOnClickListener(R.id.iv_menu, click );
            return  this;
        }

        public Builder setRightTextClickListener(View.OnClickListener click){
            setOnClickListener(R.id.tv_menutext, click );
            return  this;
        }

        public Builder showRightText(){
            mRightVisible=View.VISIBLE;
            return  this;
        }

        public Builder showRightIcon(){
            mRightIconVisible=View.VISIBLE;
            return  this;
        }
        public Builder showLeftIcon(){
            mLeftIconVisible=View.GONE;
            return  this;

        }

        public Builder setRightIcon(int icon) {
            mRightIcon=icon;
            return  this;

        }

        public Builder setLeftIcon(int icon) {
            mLeftIcon=icon;
            return  this;

        }



    }

}
