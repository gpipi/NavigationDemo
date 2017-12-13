package com.lorenzogao.navlibrary;

import android.content.Context;
import android.view.ViewGroup;

/**
 * 作者：Lorenzo Gao
 * Date: 2017/12/13
 * Time: 14:50
 * 邮箱：2508719070@qq.com
 * Description:    这个是导航栏 直接用
 */

public class NavigationBar  extends AbsNavigationBar {


    public NavigationBar(Builder builder) {
        super(builder);



    }


    /**
     * 导航栏的builder
     */
    public static class Builder extends  AbsNavigationBar.Builder<NavigationBar.Builder>{

        public Builder(Context context, int layoutId, ViewGroup parent) {
            super(context, layoutId, parent);
        }

        @Override
        public AbsNavigationBar create() {
            return new NavigationBar(this);
        }


    }

}
