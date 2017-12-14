package com.lorenzogao.navigation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;

import com.lorenzogao.navlibrary.DefaultNavigationBar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewGroup parent = findViewById(R.id.view_root);

//        NavigationBar navigationBar= (NavigationBar) new NavigationBar
//                .Builder(this,R.layout.ui_navigation,parent)
//                .setText(R.id.back_tv,"首页")
//                .setOnClickListener(R.id.back_tv, new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Toast.makeText(MainActivity.this,"点击了",Toast.LENGTH_SHORT).show();
//                    }
//                })
//                .create();

        DefaultNavigationBar navigationBar = (DefaultNavigationBar) new DefaultNavigationBar
                .Builder(this, parent)
                .setTitle("你好") //设置标题
//                .showRightIcon()//是显示右icon
//                .showRightText()// 是否显示右textview
//                .setRightText("")//设置右textview 文字
//                .setRightIcon(R.mipmap.ic_launcher) //设置右icon的图片
//                .showLeftIcon()//设置右icon隐藏
//                .setLeftIcon(R.mipmap.ic_launcher)
//                // 设置左icon点击事件
//                .setLeftClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Toast.makeText(MainActivity.this, "点击了", Toast.LENGTH_SHORT).show();
//                    }
//                })
                //设置右icon点击事件
//                .setRightClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Toast.makeText(MainActivity.this, "点击了Menu", Toast.LENGTH_SHORT).show();
//                    }
//                })
                //设置右textview 点击事件
//                .setRightTextClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//
//                    }
//                })
                .create();

    }
}
