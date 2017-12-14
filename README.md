# 自定义头部 采用Builder设计模式

### 使用方式

### 1. 扩展使用

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

### 2.默认一个头部布局

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



### 3.更改字体大小颜色设置

#### 改变默认布局的背景颜色
<resources>

    <color name="color_navigation_background">#4d4949</color>

</resources>

#### 改变字体颜色

<resources>


    <color name="color_navigation_titleColor">#FFFFFF</color>
    <color name="color_navigation_menuTextColor">#FFFFFF</color>

</resources>


#### 改变字体大小

<resources>
    <!-- Default screen margins, per the Android Design guidelines. -->

    <dimen name="dimen_navigation_height">44dp</dimen>

    <dimen name="dimen_navigation_menuTextSize">16sp</dimen>

</resources>


#### 改变默认背景的高度

<resources>
    <!-- Default screen margins, per the Android Design guidelines. -->
    <dimen name="dimen_navigation_height">44dp</dimen>
    <dimen name="dimen_navigation_titleSize">16sp</dimen>

    <dimen name="dimen_navigation_menuTextSize">16sp</dimen>

</resources>

#### 设置字体的大小

<resources>


    <dimen name="dimen_navigation_titleSize">16sp</dimen>
    <dimen name="dimen_navigation_menuTextSize">16sp</dimen>
</resources>

#### 设置图片padding 大小

    <dimen name="dimen_navigation_leftpadding">12dp</dimen>
    <dimen name="dimen_navigation_rigthpadding">10dp</dimen>





