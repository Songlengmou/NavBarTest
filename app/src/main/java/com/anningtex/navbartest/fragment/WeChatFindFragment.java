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
public class WeChatFindFragment extends Fragment {

    public WeChatFindFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_we_chat_find, container, false);
        return view;
    }
}
