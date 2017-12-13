package com.lorenzogao.navlibrary;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

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

        findViewById(R.id.back_tv).setVisibility(getBuilder().mLeftVisible);




    }

    /**
     * 导航栏的builder
     */
    public static class Builder extends  AbsNavigationBar.Builder<DefaultNavigationBar.Builder>{

        public int mLeftVisible=View.VISIBLE;

        public Builder(Context context, ViewGroup parent) {
            super(context, R.layout.default_navigation, parent);
        }

        @Override
        public AbsNavigationBar create() {
            return new DefaultNavigationBar(this);
        }


        public Builder setLeftText(String text ){
            setText(R.id.back_tv,text);

            return  this;
        }



        public Builder setLeftClickListener(View.OnClickListener click){
            setOnClickListener(R.id.back_tv, click );
            return  this;
        }


        public Builder hideLeftText(){
            mLeftVisible=View.GONE;
            return  this;
        }


    }

}
