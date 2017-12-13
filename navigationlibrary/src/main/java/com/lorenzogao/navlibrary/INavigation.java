package com.lorenzogao.navlibrary;

import android.view.View;
import android.view.ViewGroup;

/**
 * 作者：Lorenzo Gao
 * Date: 2017/12/13
 * Time: 14:37
 * 邮箱：2508719070@qq.com
 * Description: 导航栏的规范
 */

public interface INavigation {

 void createNavigation();

 void attachNavigationParams();

 void  attachParent(View navigationBar, ViewGroup parent);

}
