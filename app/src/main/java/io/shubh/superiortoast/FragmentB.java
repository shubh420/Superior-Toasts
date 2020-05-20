package io.shubh.superiortoast;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import io.shubh.superiortoastlibrary.SuperiorToast;
import io.shubh.superiortoastlibrary.SuperiorToastWithHeadersPreDesigned;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends Fragment {

    View containerMain;

    public FragmentB() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        containerMain = inflater.inflate(R.layout.fragment_fragment_b, container, false);
        doUiWork();
        return containerMain;
    }


    public void doUiWork(){
        Button btShowToast1 = (Button) containerMain.findViewById(R.id.btShowToast1);
        btShowToast1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
                ,SuperiorToastWithHeadersPreDesigned.SUCCESS_TOAST).show();

            }
        });


        Button btShowToast2 = (Button) containerMain.findViewById(R.id.btShowToast2);
        btShowToast2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
                        ,SuperiorToastWithHeadersPreDesigned.ERROR_TOAST).show();

            }
        });

        Button btShowToast5 = (Button) containerMain.findViewById(R.id.btShowToast5);
        btShowToast5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
                        ,SuperiorToastWithHeadersPreDesigned.WARNING_TOAST).show();

            }
        });

        Button btShowToast3 = (Button) containerMain.findViewById(R.id.btShowToast3);
        btShowToast3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
                        ,SuperiorToastWithHeadersPreDesigned.INFORMATION_TOAST).show();
            }
        });

        Button btShowToast4 = (Button) containerMain.findViewById(R.id.btShowToast4);
        btShowToast4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
                        ,SuperiorToastWithHeadersPreDesigned.CUSTOM_TOAST).show();

            }
        });

        Button btShowToast6 = (Button) containerMain.findViewById(R.id.btShowToast6);
        btShowToast6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
                        ,SuperiorToastWithHeadersPreDesigned.SUCCESS_TOAST)
                        .setDarkMode()
                        .show();


            }
        });


        Button btShowToast7 = (Button) containerMain.findViewById(R.id.btShowToast7);
        btShowToast7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
                        ,SuperiorToastWithHeadersPreDesigned.SUCCESS_TOAST)
                        .setToastContentText("Content")
                        .show();

            }
        });

        Button btShowToast8 = (Button) containerMain.findViewById(R.id.btShowToast8);
        btShowToast8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
                        ,SuperiorToastWithHeadersPreDesigned.SUCCESS_TOAST)
                        .showWithSimpleAnimation((ViewGroup) getActivity().getWindow().getDecorView().getRootView()
                                ,SuperiorToastWithHeadersPreDesigned.ANIMATION_SLIDE_BOTTOM_ENTRY_EXIT);


            }
        });

        Button btShowToast9 = (Button) containerMain.findViewById(R.id.btShowToast9);
        btShowToast9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
                        ,SuperiorToastWithHeadersPreDesigned.ERROR_TOAST)
                        .showWithAction((ViewGroup) getActivity().getWindow().getDecorView().getRootView(),
                                "Retry", new SuperiorToastWithHeadersPreDesigned.SuperiorToastActionCallback() {
                                    @Override
                                    public void onActionButtonClicked() {
                                        Toast.makeText(getContext(), "action button clicked", Toast.LENGTH_SHORT).show();
                                    }
                                });


            }
        });


    }

}
