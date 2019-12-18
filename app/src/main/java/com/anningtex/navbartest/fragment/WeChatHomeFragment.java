package com.anningtex.navbartest.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.anningtex.navbartest.bottom.utils.CustomScrollView;
import com.anningtex.navbartest.activity.MainActivity;
import com.anningtex.navbartest.R;
import com.anningtex.navbartest.bottom.manger.BottomNavigationBar;

/**
 * @author Administrator
 */
public class WeChatHomeFragment extends Fragment {
    public WeChatHomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_we_chat_home, container, false);

        CustomScrollView customScrollView = view.findViewById(R.id.scroll);
        final BottomNavigationBar bar = ((MainActivity) getActivity()).getBar();
        customScrollView.setScrollStateListener(new CustomScrollView.ScrollStateListener() {
            @Override
            public void onScrollUp() {
                bar.hideBar();
            }

            @Override
            public void onScrollDown() {
                bar.showBar();
            }
        });
        return view;
    }
}
