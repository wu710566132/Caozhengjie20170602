package com.bwie.test.caozhengjie20170602;


import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;
/**
 * Date：2017/6/2
 * author: 曹政杰Administrator.
 * function：首页引导页
 */
public class MainActivity extends AppCompatActivity {
                  private ViewPager vp;
    private ImageView dot1,dot2;
    private MyFragPageAdper adapter;
    private List<Fragment> list;
    private List<ImageView> dotlist=new ArrayList<>();
    private int oldposition = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp=(ViewPager) findViewById(R.id.vp);
        dot1=(ImageView) findViewById(R.id.dot1);
        dot2=(ImageView) findViewById(R.id.dot2);
        initData();
        adapter=new MyFragPageAdper(getSupportFragmentManager(),list);
        vp.setAdapter(adapter);
              vp.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                  @Override
                  public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                  }

                  @Override
                  public void onPageSelected(int position) {
                      dotlist.get(position).setBackgroundResource(R.drawable.presence_online);
                      dotlist.get(oldposition).setBackgroundResource(R.drawable.presence_invisible);
                      oldposition = position;
                  }

                  @Override
                  public void onPageScrollStateChanged(int state) {

                  }
              });
    }

    private void initData() {
        list=new ArrayList<>();
        list.add(new Fragment1());
        list.add(new Fragment2());
        dotlist.add(dot1);
        dotlist.add(dot2);
    }
}
