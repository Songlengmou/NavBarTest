package com.anningtex.navbartest.activity;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

import com.anningtex.navbartest.R;
import com.anningtex.navbartest.bottom.utils.BarUtils;

/**
 * @author Administrator
 * desc:第二个
 */
public class IconActivity extends AppCompatActivity {
    private @ColorInt
    int selectedColor;
    private @ColorInt
    int unSelectedColor;
    private ImageView image_unSelected;
    private ImageView image_selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icon);

        initColor();

        image_unSelected = findViewById(R.id.image_unSelected);
        image_selected = findViewById(R.id.image_selected);
        SeekBar seek = findViewById(R.id.seek);

        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                float offset = 1 - progress / 100f;
                image_unSelected.setColorFilter(BarUtils.getIconColor(offset, Color.TRANSPARENT, selectedColor, unSelectedColor, 10), PorterDuff.Mode.SRC_IN);
                image_selected.setColorFilter(BarUtils.getIconColor(offset, selectedColor, Color.TRANSPARENT, Color.TRANSPARENT, 10), PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        image_selected.setColorFilter(Color.TRANSPARENT, PorterDuff.Mode.SRC_IN);
    }

    private void initColor() {
        selectedColor = getResources().getColor(R.color.green);
        unSelectedColor = Color.GRAY;
    }
}
