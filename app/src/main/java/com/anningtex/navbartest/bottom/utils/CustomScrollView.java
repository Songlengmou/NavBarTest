package com.anningtex.navbartest.bottom.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/**
 * @author Administrator
 */

public class CustomScrollView extends ScrollView {
    private final int LIMIT = 50;
    private ScrollStateListener mScrollStateListener;

    public interface ScrollStateListener {
        void onScrollUp();

        void onScrollDown();
    }

    public void setScrollStateListener(ScrollStateListener mScrollStateListener) {
        this.mScrollStateListener = mScrollStateListener;
    }

    public CustomScrollView(Context context) {
        super(context);
    }

    public CustomScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        if ((oldt - t > LIMIT) && mScrollStateListener != null) {
            mScrollStateListener.onScrollDown();
        } else if (t - oldt > LIMIT && mScrollStateListener != null) {
            mScrollStateListener.onScrollUp();
        }
    }
}
