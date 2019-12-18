package com.anningtex.navbartest.activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.anningtex.navbartest.R;
import com.anningtex.navbartest.bottom.manger.BottomNavigationBar;
import com.anningtex.navbartest.bottom.manger.BottomNavigationItemWithDot;

/**
 * @author Administrator
 * desc:第一个   底部导航栏
 * source：https://github.com/WakeHao/NavBar
 */
public class MainActivity extends AppCompatActivity {
    private BottomNavigationBar bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bar = findViewById(R.id.bar);

        //可动态改变item的标题
//        bar.setTitle(0,"home(99)");
        bar.showNum(0, 80);
        bar.showNum(1, 100);
        bar.showNum(2, -2);
        bar.disMissNum(3);

        bar.setOnNavigationItemSelectedListener(new BottomNavigationBar.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull BottomNavigationItemWithDot item, int selectedPosition) {
                if (selectedPosition == 3) {
//                    startActivityForResult(new Intent(MainActivity.this, IconActivity.class), 1);
                    //用户切换item
                    bar.setItemSelected(3, true);
                    //返回false表示不响应点击事件
                    return false;
                } else {
                    return true;
                }
            }

            @Override
            public void onNavigationItemSelectedAgain(@NonNull BottomNavigationItemWithDot item, int reSelectedPosition) {
                //连续点击了同一个reSelectedPosition位置的item
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (resultCode != RESULT_OK || requestCode != 1) {
            return;
        }
        //不带动画的切换item
        bar.setItemSelected(3, false);
        super.onActivityResult(requestCode, resultCode, data);
    }

    public BottomNavigationBar getBar() {
        return bar;
    }
}
