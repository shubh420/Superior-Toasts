package io.shubh.superiortoast;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import io.shubh.superiortoastlibrary.SuperiorToast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {

    View containerMain;

    public FragmentA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

         containerMain = inflater.inflate(R.layout.fragment_a, container, false);
doUiWork();
        return containerMain;
    }



    public void doUiWork(){
        Button btShowToast1 = (Button) containerMain.findViewById(R.id.btShowToast1);
        btShowToast1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SuperiorToast.makeSuperiorToast(getContext().getApplicationContext(),
                        "hello").show();

            }
        });


        Button btShowToast2 = (Button) containerMain.findViewById(R.id.btShowToast2);
        btShowToast2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SuperiorToast.makeSuperiorToast(getContext().getApplicationContext(),
                        "hello")
                        .setToastIcon(getResources().getDrawable(R.drawable.ic_reddit_icon_svg))
                        .show();

            }
        });

        Button btShowToast5 = (Button) containerMain.findViewById(R.id.btShowToast5);
        btShowToast5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }
        });
        Button btShowToast8 = (Button) containerMain.findViewById(R.id.btShowToast8);
        btShowToast8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SuperiorToast.makeSuperiorToast(getContext().getApplicationContext(),
                        "hello")
                        .setToastIcon(getResources().getDrawable(R.drawable.ic_reddit_icon_svg))
                        .setBackgroundDrawable(getResources().getDrawable(R.drawable.purple_bg))
                        .removeLeftVerticleStrip()
                        .setTextColor("#ffffff")
                        .show();


            }
        });

        Button btShowToast3 = (Button) containerMain.findViewById(R.id.btShowToast3);
        btShowToast3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SuperiorToast.makeSuperiorToast(getContext().getApplicationContext(),
                        "hello")
                        .setToastIcon(getResources().getDrawable(R.drawable.ic_reddit_icon_svg))
                        .showWithSimpleAnimation((ViewGroup) getActivity().getWindow().getDecorView().getRootView() ,SuperiorToast.ANIMATION_SLIDE_BOTTOM_ENTRY_EXIT);

           /*     SuperiorToast.makeSuperiorToast(getApplicationContext(), "hello")
                        .setToastIcon(getResources().getDrawable(R.drawable.ic_reddit_icon_svg))
                        .setDarkMode()
                        .setBackgroundColor("#3700b3")
                        .setBackgroundDrawable(getResources().getDrawable(R.drawable.purple_bg))
                        .setColorToLeftVerticleStrip("#ffffff")
                        .setTextColor("#ffffff")
                      //  .setDurationCustom(ToastMessage.LENGTH_SHORT)
                        .showWithSimpleAnimation((ViewGroup) getWindow().getDecorView().getRootView() ,
                                SuperiorToast.ANIMATION_SLIDE_BOTTOM_ENTRY_EXIT);
*/

                /*SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getApplicationContext(), SuperiorToastWithHeadersPreDesigned.INFORMATION_TOAST)
                        //.setToastHeader("ccas")
                        //  .setToastContent("Lets see what we have got here")
                        //.setDarkMode()
                        .setToastContentText("You got my Attentiomn Now.")
                        // .setContentTextColor("#4CAF50")
                        .show();*/
            }
        });

        Button btShowToast4 = (Button) containerMain.findViewById(R.id.btShowToast4);
        btShowToast4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                SuperiorToast.makeSuperiorToast(getContext().getApplicationContext(),
                        "hello")
                        .setToastIcon(getResources().getDrawable(R.drawable.ic_reddit_icon_svg))
                        .showWithAction((ViewGroup) getActivity().getWindow().getDecorView().getRootView() ,
                                "Click" , new SuperiorToast.SuperiorToastActionCallback() {
                                    @Override
                                    public void onActionButtonClicked() {
                                        Toast.makeText(getContext(), "Clicked..", Toast.LENGTH_SHORT).show();
                                    }
                                });


           /*     SuperiorToast.makeSuperiorToast(getApplicationContext(), "hello")
                        .setToastIcon(getResources().getDrawable(R.drawable.ic_reddit_icon_svg))
                        .setDarkMode()
                        .setBackgroundColor("#3700b3")
                        .setBackgroundDrawable(getResources().getDrawable(R.drawable.purple_bg))
                        .setColorToLeftVerticleStrip("#ffffff")
                        .setTextColor("#ffffff")
                      //  .setDurationCustom(ToastMessage.LENGTH_SHORT)
                        .showWithSimpleAnimation((ViewGroup) getWindow().getDecorView().getRootView() ,
                                SuperiorToast.ANIMATION_SLIDE_BOTTOM_ENTRY_EXIT);
*/

/*                SuperiorToastWithHeadersPreDesigned.makeSuperiorToast(getApplicationContext(), SuperiorToastWithHeadersPreDesigned.INFORMATION_TOAST)
                        //.setToastHeader("ccas")
                        //  .setToastContent("Lets see what we have got here")
                        .setDarkMode()
                        *//*.setColorToLeftVerticleStrip("#FFEB3B")
                        .setToastIconTintColor("#FFEB3B")
                        .setHeaderTextColor("#FFEB3B")
*//*

                        .setToastContentText("dssVSD")
                        .showWithSimpleAnimation((ViewGroup) getWindow().getDecorView().getRootView(), SuperiorToastWithHeadersPreDesigned.ANIMATION_SLIDE_BOTTOM_ENTRY_EXIT);

          */
            }
        });

        Button btShowToast6 = (Button) containerMain.findViewById(R.id.btShowToast6);
        btShowToast6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                SuperiorToast.makeSuperiorToast(getContext().getApplicationContext(),
                        "hello")
                        .setToastIcon(getResources().getDrawable(R.drawable.ic_reddit_icon_svg))
                        .showWithActionAndAnimation((ViewGroup) getActivity().getWindow().getDecorView().getRootView()
                                ,SuperiorToast.ANIMATION_SLIDE_LEFT_RIGHT_ENTRY_EXIT
                                ,"Click" , new SuperiorToast.SuperiorToastActionCallback() {
                                    @Override
                                    public void onActionButtonClicked() {
                                        Toast.makeText(getContext(), "clicked..", Toast.LENGTH_SHORT).show();
                                    }
                                });


            }
        });


        Button btShowToast7 = (Button) containerMain.findViewById(R.id.btShowToast7);
        btShowToast7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                final SuperiorToast toast = SuperiorToast.makeSuperiorToast(getContext().getApplicationContext(),
                        "hello")
                       // .setDarkMode()
                        .setToastIcon(getResources().getDrawable(R.drawable.ic_reddit_icon_svg));

                toast .showWithActionAndAnimation((ViewGroup) getActivity().getWindow().getDecorView().getRootView()
                                ,SuperiorToast.ANIMATION_SLIDE_LEFT_RIGHT_ENTRY_EXIT
                                ,"Dissmiss toast" , new SuperiorToast.SuperiorToastActionCallback() {
                                    @Override
                                    public void onActionButtonClicked() {
                                   //     Toast.makeText(getContext(), "clicked..", Toast.LENGTH_SHORT).show();
                               SuperiorToast.hideToast(toast);
                                    }
                                });


            }
        });


    }

}
