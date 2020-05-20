package io.shubh.superiortoastlibrary;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;

public class SuperiorToastWithHeadersPreDesigned extends Toast {

    Context context;




    public static String contentToast;
    public static int toastPreLoadedType;


    public static LayoutInflater inflater;

    public static SuperiorToastWithHeadersPreDesigned staticToast;
    public static View staticToastContainer;
    public static View staticToastView;
    public static ImageView staticToastImageView;
    public static TextView staticToastTextViewHeader;
    public static TextView staticToastTextViewContent;
    public static View staticToastLeftVerticleStrip;
    public static CardView staticToastCarcViewBox;
    public static TextView staticToastActionButton;



    public static int staticToastDuration;
    public static int staticAnimationType;

    public static int LENGTH_LONG = 1; // 3.5 seconds
    public static int LENGTH_SHORT = 0;// 2 seconds
    public static int LENGTH_INDEFINITE = 5;//

    public static int ANIMATION_SLIDE_LEFT_RIGHT_ENTRY_EXIT = 1;
    public static int ANIMATION_FADE_IN_OUT_ENTRY_EXIT = 2;
    public static int ANIMATION_SLIDE_BOTTOM_ENTRY_EXIT = 3;
    public static int ANIMATION_NO_ANIMATION = 5;

    public  static  int  INFORMATION_TOAST = 1;
    public static int ERROR_TOAST = 2;
    public static int WARNING_TOAST = 3;
    public static int SUCCESS_TOAST = 4;
    public static int CUSTOM_TOAST = 5;

    private static boolean ifToastIsAreadyHidedManually;
    public  ViewGroup parentOrRootView ;
    public   View inflated;
    public  int toastDuration;

    public SuperiorToastWithHeadersPreDesigned(Context context) {
        super(context);
        this.context = context;
    }


    public static SuperiorToastWithHeadersPreDesigned makeSuperiorToast(Context context, int preMadeToastType) {

        SuperiorToastWithHeadersPreDesigned toast = null;

        switch (preMadeToastType) {
            case 1:
                toast =makeInformationToast( context);
                break;
            case 2:
                toast =makeErrorToast( context);
                break;
            case 3:
                toast =makeWarningToast( context);
                break;
            case 4:
                toast =makeSuccessToast( context);
                break;
            case 5:
                toast =makeCustomToast( context);
                break;
            default:
                toast =makeCustomToast( context);

        }


        return toast;

    }

    private static SuperiorToastWithHeadersPreDesigned makeCustomToast(Context context) {
        toastPreLoadedType = CUSTOM_TOAST ;



        SuperiorToastWithHeadersPreDesigned toast = new SuperiorToastWithHeadersPreDesigned(context);
        staticToast = toast;
        toast.setDuration(Toast.LENGTH_LONG);

        staticToastDuration = 0;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.toast_deafault_with_pre_loaded_formats, null);
        toast.setView(view);
        TextView tvToast = (TextView) view.findViewById(R.id.tvMsgHeader);


        ImageView ivToastIcon = (ImageView) view.findViewById(R.id.ivIcon);
        ivToastIcon.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_reddit_icon_svg));

        View leftVerticleStrip = (View) view.findViewById(R.id.viewColoredLeft);
        leftVerticleStrip.setBackgroundColor(Color.parseColor("#4CAF50"));


        staticToastView = (RelativeLayout) view.findViewById(R.id.rl1);
        staticToastImageView = ivToastIcon;

        staticToastTextViewHeader = tvToast;
        staticToastLeftVerticleStrip = leftVerticleStrip;
        staticToastContainer = view;
        staticToastCarcViewBox = (CardView) view.findViewById(R.id.cvToastBox);
        staticToastTextViewContent = (TextView) view.findViewById(R.id.tvMsgContent);
        staticToastActionButton = (TextView) view.findViewById(R.id.btActionToast);



        return toast;

    }

    private static SuperiorToastWithHeadersPreDesigned makeSuccessToast(Context context) {
        toastPreLoadedType = SUCCESS_TOAST ;

        SuperiorToastWithHeadersPreDesigned toast = new SuperiorToastWithHeadersPreDesigned(context);
        staticToast = toast;
        toast.setDuration(Toast.LENGTH_LONG);

        staticToastDuration = 0;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.toast_deafault_with_pre_loaded_formats, null);
        toast.setView(view);
        TextView tvToast = (TextView) view.findViewById(R.id.tvMsgHeader);
        tvToast.setText("Success");
        tvToast.setTextColor(Color.parseColor("#4CAF50"));

        ImageView ivToastIcon = (ImageView) view.findViewById(R.id.ivIcon);
        ivToastIcon.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_success_svg));
        ivToastIcon.setColorFilter(Color.parseColor("#4CAF50"), android.graphics.PorterDuff.Mode.SRC_IN);

        View leftVerticleStrip = (View) view.findViewById(R.id.viewColoredLeft);
        leftVerticleStrip.setBackgroundColor(Color.parseColor("#4CAF50"));


        staticToastView = (RelativeLayout) view.findViewById(R.id.rl1);
        staticToastImageView = ivToastIcon;

        staticToastTextViewHeader = tvToast;
        staticToastLeftVerticleStrip = leftVerticleStrip;
        staticToastContainer = view;
        staticToastCarcViewBox = (CardView) view.findViewById(R.id.cvToastBox);
        staticToastTextViewContent = (TextView) view.findViewById(R.id.tvMsgContent);
        staticToastTextViewContent.setVisibility(View.GONE);
        staticToastActionButton = (TextView) view.findViewById(R.id.btActionToast);



        return toast;

    }

    private static SuperiorToastWithHeadersPreDesigned makeWarningToast(Context context) {
        toastPreLoadedType = WARNING_TOAST ;

        SuperiorToastWithHeadersPreDesigned toast = new SuperiorToastWithHeadersPreDesigned(context);
        staticToast = toast;
        toast.setDuration(Toast.LENGTH_LONG);

        staticToastDuration = 0;//default is short duration

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.toast_deafault_with_pre_loaded_formats, null);
        toast.setView(view);
        TextView tvToast = (TextView) view.findViewById(R.id.tvMsgHeader);
        tvToast.setText("Warning");
        tvToast.setTextColor(Color.parseColor("#FDD835"));

        ImageView ivToastIcon = (ImageView) view.findViewById(R.id.ivIcon);
        ivToastIcon.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_error_svg));
        ivToastIcon.setColorFilter(Color.parseColor("#FDD835"), android.graphics.PorterDuff.Mode.SRC_IN);

        View leftVerticleStrip = (View) view.findViewById(R.id.viewColoredLeft);
        leftVerticleStrip.setBackgroundColor(Color.parseColor("#FDD835"));


        staticToastView = (RelativeLayout) view.findViewById(R.id.rl1);
        staticToastImageView = ivToastIcon;

        staticToastTextViewHeader = tvToast;
        staticToastLeftVerticleStrip = leftVerticleStrip;
        staticToastContainer = view;
        staticToastCarcViewBox = (CardView) view.findViewById(R.id.cvToastBox);
        staticToastTextViewContent = (TextView) view.findViewById(R.id.tvMsgContent);
        staticToastTextViewContent.setVisibility(View.GONE);
        staticToastActionButton = (TextView) view.findViewById(R.id.btActionToast);


        return toast;

    }

    private static SuperiorToastWithHeadersPreDesigned makeErrorToast(Context context) {

            toastPreLoadedType = ERROR_TOAST ;

            SuperiorToastWithHeadersPreDesigned toast = new SuperiorToastWithHeadersPreDesigned(context);
            staticToast = toast;
            toast.setDuration(Toast.LENGTH_LONG);

            staticToastDuration = 0;//default is short duration

            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.toast_deafault_with_pre_loaded_formats, null);
            toast.setView(view);
            TextView tvToast = (TextView) view.findViewById(R.id.tvMsgHeader);
            tvToast.setText("Error");
            tvToast.setTextColor(Color.parseColor("#f44336"));

            ImageView ivToastIcon = (ImageView) view.findViewById(R.id.ivIcon);
            ivToastIcon.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_error_svg));
            ivToastIcon.setColorFilter(Color.parseColor("#f44336"), android.graphics.PorterDuff.Mode.SRC_IN);

            View leftVerticleStrip = (View) view.findViewById(R.id.viewColoredLeft);
            leftVerticleStrip.setBackgroundColor(Color.parseColor("#f44336"));


            staticToastView = (RelativeLayout) view.findViewById(R.id.rl1);
            staticToastImageView = ivToastIcon;

            staticToastTextViewHeader = tvToast;
            staticToastLeftVerticleStrip = leftVerticleStrip;
            staticToastContainer = view;
            staticToastCarcViewBox = (CardView) view.findViewById(R.id.cvToastBox);
            staticToastTextViewContent = (TextView) view.findViewById(R.id.tvMsgContent);
            staticToastTextViewContent.setVisibility(View.GONE);
        staticToastActionButton = (TextView) view.findViewById(R.id.btActionToast);


            return toast;

    }

    private static SuperiorToastWithHeadersPreDesigned makeInformationToast(Context context) {

        toastPreLoadedType = INFORMATION_TOAST ;

        SuperiorToastWithHeadersPreDesigned toast = new SuperiorToastWithHeadersPreDesigned(context);
        staticToast = toast;
        toast.setDuration(Toast.LENGTH_LONG);

        staticToastDuration = 0;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.toast_deafault_with_pre_loaded_formats, null);
        toast.setView(view);
        TextView tvToast = (TextView) view.findViewById(R.id.tvMsgHeader);
        tvToast.setText("Info");
        tvToast.setTextColor(Color.parseColor("#2196F3"));

        ImageView ivToastIcon = (ImageView) view.findViewById(R.id.ivIcon);
        ivToastIcon.setImageDrawable(context.getResources().getDrawable(R.drawable.ic_info_icon_svg));
        ivToastIcon.setColorFilter(Color.parseColor("#2196F3"), android.graphics.PorterDuff.Mode.SRC_IN);

        View leftVerticleStrip = (View) view.findViewById(R.id.viewColoredLeft);
        leftVerticleStrip.setBackgroundColor(Color.parseColor("#2196F3"));


        staticToastView = (RelativeLayout) view.findViewById(R.id.rl1);
        staticToastImageView = ivToastIcon;

        staticToastTextViewHeader = tvToast;
        staticToastLeftVerticleStrip = leftVerticleStrip;
        staticToastContainer = view;
        staticToastCarcViewBox = (CardView) view.findViewById(R.id.cvToastBox);
        staticToastTextViewContent = (TextView) view.findViewById(R.id.tvMsgContent);
        staticToastTextViewContent.setVisibility(View.GONE);
        staticToastActionButton = (TextView) view.findViewById(R.id.btActionToast);


        return toast;
    }



    public SuperiorToastWithHeadersPreDesigned setToastIcon(Drawable drawable) {
        staticToastImageView.setImageDrawable(drawable);
        return staticToast;
    }

    public SuperiorToastWithHeadersPreDesigned setToastIconTintColor(String HexCodeColorString) {
        staticToastImageView.setColorFilter(Color.parseColor(HexCodeColorString), android.graphics.PorterDuff.Mode.SRC_IN);
        return staticToast;
    }

    public SuperiorToastWithHeadersPreDesigned setDarkMode() {
        staticToastView.setBackgroundColor(Color.parseColor("#121212"));
        staticToastTextViewContent.setTextColor(Color.parseColor("#ffffff"));

        switch (toastPreLoadedType) {
            case 1://81D4FA //blue 200 //Information
            //    staticToastImageView.setColorFilter(Color.parseColor("#81D4FA"), android.graphics.PorterDuff.Mode.SRC_IN);
             //   staticToastLeftVerticleStrip.setBackgroundColor(Color.parseColor("#81D4FA"));
                break;
            case 2://ef9a9a//red 200//Error
            //    staticToastImageView.setColorFilter(Color.parseColor("#ef9a9a"), android.graphics.PorterDuff.Mode.SRC_IN);
            //    staticToastLeftVerticleStrip.setBackgroundColor(Color.parseColor("#ef9a9a"));
                break;
            case 3://FFF59D//yellow 200// warning
            //    staticToastImageView.setColorFilter(Color.parseColor("#FFF59D"), android.graphics.PorterDuff.Mode.SRC_IN);
            //    staticToastLeftVerticleStrip.setBackgroundColor(Color.parseColor("#FFF59D"));
                break;
            case 4://A5D6A7//green 200 //succeess
             //   staticToastImageView.setColorFilter(Color.parseColor("#A5D6A7"), android.graphics.PorterDuff.Mode.SRC_IN);
             //   staticToastLeftVerticleStrip.setBackgroundColor(Color.parseColor("#A5D6A7"));
                break;
            case 5://default toast for custom
                staticToastView.setBackgroundColor(Color.parseColor("#121212"));
                staticToastTextViewHeader.setTextColor(Color.parseColor("#ffffff"));
                staticToastTextViewContent.setTextColor(Color.parseColor("#ffffff"));
                break;
            default:
        }


        return staticToast;
    }

    public SuperiorToastWithHeadersPreDesigned setElevation(float f) {
        staticToastCarcViewBox.setElevation(f);

        return staticToast;
    }


    public SuperiorToastWithHeadersPreDesigned setToastHeaderText(String header) {
        staticToastTextViewHeader.setText(header);
        return staticToast;
    }

    public SuperiorToastWithHeadersPreDesigned setToastContentText(String content) {
        staticToastTextViewContent.setVisibility(View.VISIBLE);
        staticToastTextViewContent.setText(content);
        contentToast=content;
        return staticToast;
    }

    public SuperiorToastWithHeadersPreDesigned setHeaderTextColor(String HexCodeColorString) {
        staticToastTextViewHeader.setTextColor(Color.parseColor(HexCodeColorString));
        return staticToast;
    }

    public SuperiorToastWithHeadersPreDesigned setContentTextColor(String HexCodeColorString) {
        staticToastTextViewContent.setTextColor(Color.parseColor(HexCodeColorString));
        return staticToast;
    }

    public SuperiorToastWithHeadersPreDesigned setBackgroundColor(String HexCodeColorString) {
        staticToastView.setBackgroundColor(Color.parseColor(HexCodeColorString));
        return staticToast;
    }

    public SuperiorToastWithHeadersPreDesigned setBackgroundDrawable(Drawable drawable) {
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        Drawable scaledDrawable = new BitmapDrawable(context.getResources(), Bitmap.createScaledBitmap(bitmap, 50, 50, true));



        staticToastView.setBackground(scaledDrawable);
        return staticToast;
    }

    public SuperiorToastWithHeadersPreDesigned setColorToLeftVerticleStrip(String HexCodeColorString) {
        staticToastLeftVerticleStrip.setBackgroundColor(Color.parseColor(HexCodeColorString));
        return staticToast;
    }

   public SuperiorToastWithHeadersPreDesigned setDurationCustom(int duration) {
        if (duration == 0) {
            super.setDuration(duration);
        } else if (duration == 1) {
            super.setDuration(duration);
        } else {
            super.setDuration(Toast.LENGTH_LONG);//value passed is other than short(0) and long(1) ..so showing for long by default
        }
        staticToastDuration = duration;
        toastDuration =duration;

        return staticToast;
    }


    public SuperiorToastWithHeadersPreDesigned removeLeftVerticleStrip() {
        staticToastLeftVerticleStrip.setVisibility(View.GONE);
        return staticToast;
    }

    public SuperiorToastWithHeadersPreDesigned removeIconImageView() {
        staticToastImageView.setVisibility(View.GONE);
        return staticToast;
    }


    public SuperiorToastWithHeadersPreDesigned showWithSimpleAnimation(final ViewGroup parentOrRootView, int animationType) {
        staticAnimationType = animationType;



        //todo -make this rule in readme of this libarray that to use animations u willl need to pass root view and that root view need to be relative layout

        final View inflated = inflater.inflate(R.layout.toast_default, parentOrRootView, false);
        //getting cardview of this and removing it from root because ..we will insert the custom one done by above functions
        CardView cvToastBox = (CardView) inflated.findViewById(R.id.cvToastBox);
        ((RelativeLayout) inflated).removeView(cvToastBox);

        cvToastBox = staticToastCarcViewBox;
        ((RelativeLayout) staticToastContainer).removeView(cvToastBox);

        RelativeLayout.LayoutParams params = null;

        if (context.getResources().getConfiguration().orientation == 2) {
            params = new RelativeLayout.LayoutParams(dpToPx(500), ViewGroup.LayoutParams.WRAP_CONTENT);
            params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            params.bottomMargin = dpToPx(25);
            params.leftMargin = dpToPx(200);
            params.rightMargin = dpToPx(200);
        } else {
            params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            params.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
            params.bottomMargin = dpToPx(110);
            params.leftMargin = dpToPx(35);
            params.rightMargin = dpToPx(35);
        }


        cvToastBox.setLayoutParams(params);


        ((RelativeLayout) inflated).addView(cvToastBox);
        parentOrRootView.addView(inflated);



        this.parentOrRootView=parentOrRootView ;
        this.inflated =inflated;
        ifToastIsAreadyHidedManually=false;



        switch (animationType) {
            case 1:
                slideLeftRightAnimationShow(parentOrRootView, inflated, staticToastDuration);
                break;
            case 2:
                fadeInOutAnimationShow(parentOrRootView, inflated, staticToastDuration);
                break;
            case 3:
                slideBottomAnimationShow(parentOrRootView, inflated, staticToastDuration);
                break;

            default:
                noAnimationShow(parentOrRootView, inflated, toastDuration);
        }

        return staticToast;
    }


    public static  void  hideToast(SuperiorToastWithHeadersPreDesigned toast){

        ifToastIsAreadyHidedManually=true;
        switch (staticAnimationType) {
            case 1:
                slideLeftRightAnimationHide( toast.parentOrRootView ,toast.inflated);
                break;
            case 2:
                fadeInOutAnimationHide(toast.parentOrRootView ,toast.inflated);
                break;
            case 3:
                slideBottomAnimationHide(toast.parentOrRootView ,toast.inflated);
                break;

            //todo- add more animations in future
            default:// in case other number is passed than the declared ones
                toast.parentOrRootView.removeView(toast.inflated);
        }

    }


    private void noAnimationShow(final ViewGroup parentOrRootView, final View inflated, int toastDuration) {
        if (toastDuration == 0) {
            toastDuration = 2000;
        } else if (toastDuration == 1) {
            toastDuration = 3500;
        }


       if( toastDuration !=SuperiorToast.LENGTH_INDEFINITE) {
            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {

                    if (ifToastIsAreadyHidedManually != true) {
                        parentOrRootView.removeView(inflated);
                    }
                }
            }, toastDuration);
        }
    }


    private void slideLeftRightAnimationShow(final ViewGroup parentOrRootView, final View inflated, int toastDuration) {

        if (toastDuration == 0) {
            toastDuration = 2000;
        } else if (toastDuration == 1) {
            toastDuration = 3500;
        }

        TranslateAnimation animate = new TranslateAnimation(-parentOrRootView.getWidth(), 0, 0, 0);
        animate.setDuration(300);
        inflated.startAnimation(animate);
        final int finalToastDuration = toastDuration;
        animate.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                if( finalToastDuration !=SuperiorToast.LENGTH_INDEFINITE) {
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            if (ifToastIsAreadyHidedManually != true ) {
                                slideLeftRightAnimationHide(parentOrRootView, inflated);
                            }
                        }
                    }, finalToastDuration);
                }
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
    }

    private static void slideLeftRightAnimationHide(final ViewGroup parentOrRootView, final View inflated) {
        // Do something after 5s = 5000ms
        TranslateAnimation animate = new TranslateAnimation(0, parentOrRootView.getWidth(), 0, 0);
        animate.setDuration(300);
        inflated.startAnimation(animate);
        animate.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {

                parentOrRootView.removeView(inflated);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });
    }




    private void fadeInOutAnimationShow(final ViewGroup parentOrRootView, final View inflated, int toastDuration) {
        if (toastDuration == 0) {
            toastDuration = 2000;
        } else if (toastDuration == 1) {
            toastDuration = 3500;
        }

        inflated.setVisibility(View.GONE);

        Transition transition = new Fade();
        transition.setDuration(400);
        transition.addTarget(inflated);

        final int finalToastDuration = toastDuration;
        transition.addListener(new Transition.TransitionListener() {//define the listeners befor starting animation in code
            @Override
            public void onTransitionStart(Transition transition) {
            }
            @Override
            public void onTransitionEnd(Transition transition) {
               if( finalToastDuration !=SuperiorToast.LENGTH_INDEFINITE) {
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            if (ifToastIsAreadyHidedManually != true) {
                                fadeInOutAnimationHide(parentOrRootView, inflated);
                            }
                        }
                    }, finalToastDuration);
                }
            }
            @Override
            public void onTransitionCancel(Transition transition) {
            }
            @Override
            public void onTransitionPause(Transition transition) {
            }
            @Override
            public void onTransitionResume(Transition transition) {
            }
        });


        TransitionManager.beginDelayedTransition(parentOrRootView, transition);
        inflated.setVisibility(View.VISIBLE);




    }

    private static void fadeInOutAnimationHide(ViewGroup parentOrRootView, View inflated) {

        inflated.setVisibility(View.VISIBLE);
        Transition transition = new Fade();
        transition.setDuration(400  );
        transition.addTarget(inflated);

        TransitionManager.beginDelayedTransition(parentOrRootView, transition);
        inflated.setVisibility(View.GONE);


    }



    private void slideBottomAnimationShow(final ViewGroup parentOrRootView, final View inflated, int toastDuration) {
        if (toastDuration == 0) {
            toastDuration = 2000;
        } else if (toastDuration == 1) {
            toastDuration = 3500;
        }

        inflated.setVisibility(View.GONE);

        Transition transition = new Slide(Gravity.BOTTOM);
        transition.setDuration(300);
        transition.addTarget(inflated);

        final int finalToastDuration = toastDuration;
        transition.addListener(new Transition.TransitionListener() {//define the listeners befor starting animation in code
            @Override
            public void onTransitionStart(Transition transition) {
            }
            @Override
            public void onTransitionEnd(Transition transition) {
                if (finalToastDuration != SuperiorToast.LENGTH_INDEFINITE) {
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            if (ifToastIsAreadyHidedManually != true) {
                                slideBottomAnimationHide(parentOrRootView, inflated);
                            }
                        }
                    }, finalToastDuration);
                }
            }

            @Override
            public void onTransitionCancel(Transition transition) {
            }
            @Override
            public void onTransitionPause(Transition transition) {
            }
            @Override
            public void onTransitionResume(Transition transition) {
            }
        });


        TransitionManager.beginDelayedTransition(parentOrRootView, transition);
        inflated.setVisibility(View.VISIBLE);




    }

    private static void slideBottomAnimationHide(ViewGroup parentOrRootView, View inflated) {

        inflated.setVisibility(View.VISIBLE);
        Transition transition = new Slide(Gravity.BOTTOM);
        transition.setDuration(300  );
        transition.addTarget(inflated);

        TransitionManager.beginDelayedTransition(parentOrRootView, transition);
        inflated.setVisibility(View.GONE);
    }







    public static int dpToPx(int dp) {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }




   public SuperiorToastWithHeadersPreDesigned showWithAction(ViewGroup  parentOrRootView , String actionName  , final SuperiorToastWithHeadersPreDesigned.SuperiorToastActionCallback callback) {
        staticToastActionButton.setText(actionName);
        staticToastActionButton.setVisibility(View.VISIBLE);
        staticToastActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callback.onActionButtonClicked();
            }
        });

        staticToast.showWithSimpleAnimation(parentOrRootView ,ANIMATION_NO_ANIMATION);

        return staticToast;
    }

    public SuperiorToastWithHeadersPreDesigned showWithActionAndAnimation(ViewGroup parentOrRootView, int  animationTypeString , String actionName , final SuperiorToast.SuperiorToastActionCallback callback) {
        staticToastActionButton.setText(actionName);
        staticToastActionButton.setVisibility(View.VISIBLE);
        staticToastActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callback.onActionButtonClicked();
            }
        });

        staticToast.showWithSimpleAnimation(parentOrRootView , animationTypeString);

        return staticToast;
    }

    public SuperiorToastWithHeadersPreDesigned setBackgroundColorToActionButton(String HexCodeColorString) {
        staticToastActionButton.setBackgroundColor(Color.parseColor(HexCodeColorString));
        return staticToast;
    }


    public SuperiorToastWithHeadersPreDesigned setTextColorToActionButton(String HexCodeColorString) {
        staticToastActionButton.setTextColor( Color.parseColor(HexCodeColorString));
        return staticToast;
    }




    public interface SuperiorToastActionCallback {

        void onActionButtonClicked();
    }



}
