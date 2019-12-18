package com.anningtex.navbartest.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.anningtex.navbartest.R;

/**
 * @author Administrator
 */
public class WeChatMineFragment extends Fragment {

    public WeChatMineFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_we_chat_mine, container, false);
    }
}
