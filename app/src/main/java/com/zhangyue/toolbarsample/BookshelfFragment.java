package com.zhangyue.toolbarsample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by sanwe_000 on 2016/2/16.
 */
public class BookshelfFragment extends Fragment {
    private TextView mTextView;
    private int mIndex;

    public static BookshelfFragment  getInstance(int index){
        BookshelfFragment fragment = new BookshelfFragment();
        fragment.mIndex = index;
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mTextView = new TextView(getActivity());
        mTextView.setGravity(Gravity.CENTER);
        mTextView.setTextSize(20 * getResources().getDisplayMetrics().density);
        mTextView.setPadding(20, 20, 20, 20);
        mTextView.setText("Fragment:"+mIndex);

        LinearLayout layout = new LinearLayout(getActivity());
        layout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.FILL_PARENT));
        layout.setGravity(Gravity.CENTER);
        layout.addView(mTextView);

        return layout;
    }

}
