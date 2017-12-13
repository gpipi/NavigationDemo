# NavigationDemo

 使用
 1.扩展

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

2.默认一个头部布局

        DefaultNavigationBar navigationBar= (DefaultNavigationBar) new DefaultNavigationBar
                .Builder(this,parent)
                .setLeftText("我的")
                .setLeftClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this,"点击了",Toast.LENGTH_SHORT).show();
                    }
                })
                .create();
