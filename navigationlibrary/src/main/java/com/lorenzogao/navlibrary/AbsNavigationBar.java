package com.lorenzogao.navlibrary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

/**
 * 作者：Lorenzo Gao
 * Date: 2017/12/13
 * Time: 14:40
 * 邮箱：2508719070@qq.com
 * Description:
 */

public class AbsNavigationBar<T extends AbsNavigationBar.Builder> implements INavigation {

    private T mBuilder;

    private View mNavigationBar;


    public AbsNavigationBar(T builder) {
        this.mBuilder = builder;
        createNavigation();
    }


    public T getBuilder() {
        return mBuilder;
    }

    @Override
    public void createNavigation() {
        mNavigationBar = LayoutInflater.from(mBuilder.mContext)
                .inflate(mBuilder.mLayoutid, mBuilder.mParent, false);
        //添加
        attachParent(mNavigationBar, mBuilder.mParent);
        //绑定参数
        attachNavigationParams();


    }


    /**
     * 绑定
     */
    @Override
    public void attachNavigationParams() {

        Map<Integer,CharSequence> textMaps=mBuilder.mTextMaps;
         for (Map.Entry<Integer,CharSequence> entry:textMaps.entrySet()){
             TextView textView=findViewById(entry.getKey());
             textView.setText(entry.getValue());


         }

        Map<Integer,View.OnClickListener> mClickListenerMaps=mBuilder.mClickListenerMaps;
        for (Map.Entry<Integer,View.OnClickListener> entry:mClickListenerMaps.entrySet()){
           View view=findViewById(entry.getKey());
           view.setOnClickListener(entry.getValue());

        }

    }



    public <T extends View> T findViewById(int  viewId){

        return mNavigationBar.findViewById(viewId);
    }
    /**
     * 将mNavigationBar添加父布局
     */
    @Override
    public void attachParent(View navigationBar, ViewGroup parent) {
        parent.addView(navigationBar, 0);

    }

    /**
     * Builder 构建类
     * 构建NavigationBar 还有存储参数
     */
    public static abstract class Builder<T extends Builder> {


        public Context mContext;

        public int mLayoutid;

        public ViewGroup mParent;


        public Map<Integer, CharSequence> mTextMaps;

        public Map<Integer, View.OnClickListener> mClickListenerMaps;

        public Builder(Context context, int layoutId, ViewGroup parent) {
            this.mContext = context;
            this.mLayoutid = layoutId;
            this.mParent = parent;

            mTextMaps = new HashMap<>();
            mClickListenerMaps = new HashMap<>();
        }


        /**
         * 用来创建NavigationBar
         *
         * @return
         */
        public abstract AbsNavigationBar create();



        public T setText(int viewId, String text) {
            mTextMaps.put(viewId, text);
            return (T) this;
        }



        public T setOnClickListener(int viewId, View.OnClickListener onClickListener) {
            mClickListenerMaps.put(viewId, onClickListener);
            return (T) this;
        }


    }





}
