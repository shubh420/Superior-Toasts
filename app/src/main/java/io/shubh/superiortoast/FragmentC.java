package io.shubh.superiortoast;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import io.shubh.superiortoastlibrary.SuperiorToastWithHeadersPreDesigned;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentC extends Fragment {

    View containerMain;

    public FragmentC() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        containerMain = inflater.inflate(R.layout.fragment_fragment_c, container, false);
        doUiWork();
        return containerMain;

    }

    private void doUiWork() {
        Button btShowToast1 = (Button) containerMain.findViewById(R.id.btShowToast1);
        btShowToast1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
                        , SuperiorToastWithHeadersPreDesigned.CUSTOM_TOAST)
                        .setToastHeaderText("Animations")
                        .setToastContentText("Default")
                        .showWithSimpleAnimation((ViewGroup) getActivity().getWindow().getDecorView().getRootView(),SuperiorToastWithHeadersPreDesigned.ANIMATION_NO_ANIMATION);

            }
        });


        Button btShowToast2 = (Button) containerMain.findViewById(R.id.btShowToast2);
        btShowToast2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
                        , SuperiorToastWithHeadersPreDesigned.CUSTOM_TOAST)
                        .setToastHeaderText("Animations")
                        .setToastContentText("slide animation left right entry exit")
                        .showWithSimpleAnimation((ViewGroup) getActivity().getWindow().getDecorView().getRootView(),SuperiorToastWithHeadersPreDesigned.ANIMATION_SLIDE_LEFT_RIGHT_ENTRY_EXIT);


            }
        });

        Button btShowToast3 = (Button) containerMain.findViewById(R.id.btShowToast3);
        btShowToast3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
                        , SuperiorToastWithHeadersPreDesigned.CUSTOM_TOAST)
                        .setToastHeaderText("Animations")
                        .setToastContentText("fade in fade out")
                        .showWithSimpleAnimation((ViewGroup) getActivity().getWindow().getDecorView().getRootView(),SuperiorToastWithHeadersPreDesigned.ANIMATION_FADE_IN_OUT_ENTRY_EXIT);

            }
        });


        Button btShowToast4 = (Button) containerMain.findViewById(R.id.btShowToast4);
        btShowToast4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
                        , SuperiorToastWithHeadersPreDesigned.CUSTOM_TOAST)
                        .setToastHeaderText("Animations")
                        .setToastContentText("slide animation bottom entry exit")
                        .showWithSimpleAnimation((ViewGroup) getActivity().getWindow().getDecorView().getRootView(),SuperiorToastWithHeadersPreDesigned.ANIMATION_SLIDE_BOTTOM_ENTRY_EXIT);

            }
        });

        Button btShowToast5 = (Button) containerMain.findViewById(R.id.btShowToast5);
        btShowToast5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
                        , SuperiorToastWithHeadersPreDesigned.CUSTOM_TOAST)
                        .setToastHeaderText("Duration")
                        .setToastContentText("length Long")
                        .setDurationCustom(SuperiorToastWithHeadersPreDesigned.LENGTH_LONG)
                        .show();
                //    .showWithSimpleAnimation((ViewGroup) getActivity().getWindow().getDecorView().getRootView(),SuperiorToastWithHeadersPreDesigned.ANIMATION_SLIDE_BOTTOM_ENTRY_EXIT);

            }
        });

        Button btShowToast6 = (Button) containerMain.findViewById(R.id.btShowToast6);
        btShowToast6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
                        , SuperiorToastWithHeadersPreDesigned.CUSTOM_TOAST)
                        .setToastHeaderText("Duration")
                        .setToastContentText("length short")
                        .setDurationCustom(SuperiorToastWithHeadersPreDesigned.LENGTH_SHORT)
                        .show();
                //    .showWithSimpleAnimation((ViewGroup) getActivity().getWindow().getDecorView().getRootView(),SuperiorToastWithHeadersPreDesigned.ANIMATION_SLIDE_BOTTOM_ENTRY_EXIT);

            }
        });

        Button btShowToast7 = (Button) containerMain.findViewById(R.id.btShowToast7);
        btShowToast7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
                        , SuperiorToastWithHeadersPreDesigned.CUSTOM_TOAST)
                        .setToastHeaderText("Duration")
                        .setToastContentText("length custom (1000 or 1 ms)")
                        .setDurationCustom(1000)
                      //  .showWithSimpleAnimation();
                    .showWithSimpleAnimation((ViewGroup) getActivity().getWindow().getDecorView().getRootView(),SuperiorToastWithHeadersPreDesigned.ANIMATION_NO_ANIMATION);

            }
        });

        Button btShowToast8 = (Button) containerMain.findViewById(R.id.btShowToast8);
        btShowToast8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final SuperiorToastWithHeadersPreDesigned toast = SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
                        , SuperiorToastWithHeadersPreDesigned.CUSTOM_TOAST)
                        .setToastHeaderText("Duration")
                        .setToastContentText("length Indefinite(manual dissmiss)")
                        .setDurationCustom(SuperiorToastWithHeadersPreDesigned.LENGTH_INDEFINITE);
                     //   .show();
                   toast .showWithAction((ViewGroup) getActivity().getWindow().getDecorView().getRootView()
                    , "Dissmiss"
                    , new SuperiorToastWithHeadersPreDesigned.SuperiorToastActionCallback() {
                                @Override
                                public void onActionButtonClicked() {
                                    SuperiorToastWithHeadersPreDesigned.hideToast(toast);
                                }
                            });

            }
        });

        Button btShowToast9 = (Button) containerMain.findViewById(R.id.btShowToast9);
        btShowToast9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
                        , SuperiorToastWithHeadersPreDesigned.CUSTOM_TOAST)
                        .setToastHeaderText("elevation")
                        .setToastContentText("default")
                        .show();
                //    .showWithSimpleAnimation((ViewGroup) getActivity().getWindow().getDecorView().getRootView(),SuperiorToastWithHeadersPreDesigned.ANIMATION_SLIDE_BOTTOM_ENTRY_EXIT);

            }
        });

        Button btShowToast10 = (Button) containerMain.findViewById(R.id.btShowToast10);
        btShowToast10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getContext().getApplicationContext()
                        , SuperiorToastWithHeadersPreDesigned.CUSTOM_TOAST)
                        .setToastHeaderText("elevation")
                        .setToastContentText("custom")
                        .setElevation(50f)
                    //    .showWithSimpleAnimation();
                    .showWithSimpleAnimation((ViewGroup) getActivity().getWindow().getDecorView().getRootView(),SuperiorToastWithHeadersPreDesigned.ANIMATION_NO_ANIMATION);

            }
        });

    }

}
