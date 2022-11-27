package com.marcorobregon.multiservicios1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SettingsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SettingsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    RecyclerView recyclerView;
    public SettingsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SettingsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SettingsFragment newInstance(String param1, String param2) {
        SettingsFragment fragment = new SettingsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_settings, container, false);
        recyclerView = v.findViewById(R.id.listRecyclerView);


        //Creamos la lista para las opciones de nuestro settings fragment
        List<ItemsSettings> items = new ArrayList<ItemsSettings>();
        items.add(new ItemsSettings("Notifications",R.drawable.ic_baseline_notifications_24,R.drawable.ic_baseline_arrow_forward_ios_24));
        items.add(new ItemsSettings("Help",R.drawable.ic_baseline_back_hand_24,R.drawable.ic_baseline_arrow_forward_ios_24));
        items.add(new ItemsSettings("Payment",R.drawable.ic_baseline_credit_card_24,R.drawable.ic_baseline_arrow_forward_ios_24));
        items.add(new ItemsSettings("About",R.drawable.ic_baseline_help_outline_24,R.drawable.ic_baseline_arrow_forward_ios_24));
        items.add(new ItemsSettings("Logout",R.drawable.ic_baseline_logout_24,R.drawable.ic_baseline_arrow_forward_ios_24));

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new MyAdapter(getContext(),items));

        return v;

    }
}