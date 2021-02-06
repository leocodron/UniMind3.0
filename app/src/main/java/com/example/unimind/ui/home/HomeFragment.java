package com.example.unimind.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.unimind.R;
import com.example.unimind.ui.gethelp.GetHelp;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private Button getHelpButton;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.HomeTitle);
        textView.setText("UniMind");
        textView.setGravity(1);

        System.out.println(R.id.HomeGetHelp);


        View view = inflater.inflate(R.layout.fragment_home, container, false);

        Button getHelpButton = (Button) view.findViewById(R.id.HomeGetHelp);
//        Log.d("MyApp",getHelpButton.toString());

        getHelpButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                textView.setText("LOL");

                System.out.println("test");
                Log.d("Test","I am here");
                moveToGetHelp();

            }
        });


        return root;
    }

    public void moveToGetHelp() {
        this.startActivity(new Intent(this.getActivity(), GetHelp.class));
    }

}