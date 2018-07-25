package com.example.android.miwok;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FamilyFragment extends Fragment {


    public FamilyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        //Create ArrayList called words

        ArrayList<Word> words = new ArrayList<Word>();

        words.add (new Word("father","әpә",R.mipmap.ic_launcher));
        words.add(new Word("mother", "әṭa",R.mipmap.ic_launcher));
        words.add(new Word("son", "angsi",R.mipmap.ic_launcher));
        words.add(new Word("daughter", "tune",R.mipmap.ic_launcher));
        words.add(new Word("older brother", "taachi",R.mipmap.ic_launcher));
        words.add(new Word("younger brother", "chalitti",R.mipmap.ic_launcher));
        words.add(new Word("older sister", "teṭe",R.mipmap.ic_launcher));
        words.add(new Word("younger sister", "kolliti",R.mipmap.ic_launcher));
        words.add(new Word("grandmother", "ama",R.mipmap.ic_launcher));
        words.add(new Word("grandfather", "paapa",R.mipmap.ic_launcher));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.

        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_family);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
