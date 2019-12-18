package com.anningtex.navbartest.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.anningtex.navbartest.R;
import com.anningtex.navbartest.activity.IconActivity;

/**
 * @author Administrator
 */
public class WeChatContactFragment extends Fragment {
    private Button btn_icon;

    public WeChatContactFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_we_chatc_contact, container, false);

        btn_icon = view.findViewById(R.id.btn_icon);
        btn_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), IconActivity.class));
            }
        });
        return view;
    }
}
