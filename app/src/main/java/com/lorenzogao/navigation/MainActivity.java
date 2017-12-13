package com.lorenzogao.navigation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.lorenzogao.navlibrary.NavigationBar;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewGroup parent=findViewById(R.id.view_root);

        NavigationBar navigationBar= (NavigationBar) new NavigationBar
                .Builder(this,R.layout.ui_navigation,parent)
                .setText(R.id.back_tv,"首页")
                .setOnClickListener(R.id.back_tv, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this,"点击了",Toast.LENGTH_SHORT).show();
                    }
                })
                .create();

//        DefaultNavigationBar navigationBar= (DefaultNavigationBar) new DefaultNavigationBar
//                .Builder(this,parent)
//                .setLeftText("我的")
//                .setLeftClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Toast.makeText(MainActivity.this,"点击了",Toast.LENGTH_SHORT).show();
//                    }
//                })
//                .create();


    }
}
