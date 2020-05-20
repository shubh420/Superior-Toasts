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

public class SuperiorToast extends Toast {


    Context context;


    public static String messageLocal;
    public static LayoutInflater inflater;

    public static SuperiorToast staticToast;
    public static View staticToastContainer;
    public static View staticToastView;
    public static ImageView staticToastImageView;
    public static TextView staticToastTextView;
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


    private static boolean ifToastIsAreadyHidedManually;
    public ViewGroup parentOrRootView;
    public View inflated;
    public int toastDuration;


    public SuperiorToast(Context context) {
        super(context);
        this.context = context;
    }


    //todo set elevation function and duration functions with duratoin variables
    //todo make set gravity  fn for custom made toasts in gfuture versions

    public static SuperiorToast makeSuperiorToast(Context context, String message) {

        messageLocal = message;

        SuperiorToast toast = new SuperiorToast(context);
        staticToast = toast;
        toast.setDuration(Toast.LENGTH_LONG);

        staticToastDuration = 0;//default is short duration

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.toast_default, null);
        toast.setView(view);
        TextView tvToast = (TextView) view.findViewById(R.id.tvMsg);
        tvToast.setText(message);
        ImageView ivToastIcon = (ImageView) view.findViewById(R.id.ivIcon);
        ivToastIcon.setVisibility(View.GONE);
        View leftVerticleStrip = (View) view.findViewById(R.id.viewColoredLeft);


        staticToastView = (RelativeLayout) view.findViewById(R.id.rl1);
        staticToastImageView = ivToastIcon;

        staticToastTextView = tvToast;
        staticToastLeftVerticleStrip = leftVerticleStrip;
        staticToastContainer = view;
        staticToastCarcViewBox = (CardView) view.findViewById(R.id.cvToastBox);
        staticToastActionButton = (TextView) view.findViewById(R.id.btActionToast);


        return toast;

    }


    public SuperiorToast setToastIcon(Drawable drawable) {
        staticToastImageView.setVisibility(View.VISIBLE);
        staticToastImageView.setImageDrawable(drawable);
        return staticToast;
    }

    public SuperiorToast setToastIconTintColor(String HexCodeColorString) {
        staticToastImageView.setColorFilter(Color.parseColor(HexCodeColorString), android.graphics.PorterDuff.Mode.SRC_IN);
        return staticToast;
    }

    public SuperiorToast setDarkMode() {
        staticToastView.setBackgroundColor(Color.parseColor("#121212"));
        staticToastTextView.setTextColor(Color.parseColor("#ffffff"));
        return staticToast;
    }

    public SuperiorToast setElevation(float f) {
        staticToastCarcViewBox.setElevation(f);

        return staticToast;
    }



    public SuperiorToast setTextColor(String HexCodeColorString) {
        staticToastTextView.setTextColor(Color.parseColor(HexCodeColorString));
        return staticToast;
    }

    public SuperiorToast setBackgroundColor(String HexCodeColorString) {
        staticToastView.setBackgroundColor(Color.parseColor(HexCodeColorString));
        return staticToast;
    }

    public SuperiorToast setBackgroundDrawable(Drawable drawable) {
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();

        Drawable scaledDrawable = new BitmapDrawable(context.getResources(), Bitmap.createScaledBitmap(bitmap, 50, 50, true));



        staticToastView.setBackground(scaledDrawable);
        return staticToast;
    }



    public SuperiorToast setColorToLeftVerticleStrip(String HexCodeColorString) {
        staticToastLeftVerticleStrip.setBackgroundColor(Color.parseColor(HexCodeColorString));
        return staticToast;
    }

    public SuperiorToast setDurationCustom(int duration) {
        if (duration == 0) {
            super.setDuration(duration);
        } else if (duration == 1) {
            super.setDuration(duration);
        } else {
            super.setDuration(Toast.LENGTH_LONG);
        }
        staticToastDuration = duration;
        toastDuration = duration;

        return staticToast;
    }


    public SuperiorToast removeLeftVerticleStrip() {
        staticToastLeftVerticleStrip.setVisibility(View.GONE);
        return staticToast;
    }


    public SuperiorToast showWithSimpleAnimation(final ViewGroup parentOrRootView, int animationType) {
        staticAnimationType = animationType;


        final View inflated = inflater.inflate(R.layout.toast_default, parentOrRootView, false);
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




        this.parentOrRootView = parentOrRootView;
        this.inflated = inflated;
        ifToastIsAreadyHidedManually = false;

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
                noAnimationShow(parentOrRootView, inflated, toastDuration);//using loacl toast duration not static ones
        }

        return staticToast;
    }

    public static void hideToast(SuperiorToast toast) {

        ifToastIsAreadyHidedManually = true;
        switch (staticAnimationType) {
            case 1:
                slideLeftRightAnimationHide(toast.parentOrRootView, toast.inflated);
                break;
            case 2:
                fadeInOutAnimationHide(toast.parentOrRootView, toast.inflated);
                break;
            case 3:
                slideBottomAnimationHide(toast.parentOrRootView, toast.inflated);
                break;

            default:
                toast.parentOrRootView.removeView(toast.inflated);
        }

    }


    private void noAnimationShow(final ViewGroup parentOrRootView, final View inflated, int toastDuration) {
        if (toastDuration == 0) {
            toastDuration = 2000;
        } else if (toastDuration == 1) {
            toastDuration = 3500;
        }

        if (toastDuration != SuperiorToast.LENGTH_INDEFINITE) {
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
               if (finalToastDuration != SuperiorToast.LENGTH_INDEFINITE) {
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            if (ifToastIsAreadyHidedManually != true) {
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
        transition.addListener(new Transition.TransitionListener() {
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
        transition.setDuration(400);
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
        transition.addListener(new Transition.TransitionListener() {
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
        transition.setDuration(300);
        transition.addTarget(inflated);

        TransitionManager.beginDelayedTransition(parentOrRootView, transition);
        inflated.setVisibility(View.GONE);
    }


    public static int dpToPx(int dp) {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }


   public SuperiorToast showWithAction(ViewGroup parentOrRootView, String actionName, final SuperiorToastActionCallback callback) {
        staticToastActionButton.setText(actionName);
        staticToastActionButton.setVisibility(View.VISIBLE);
        staticToastActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callback.onActionButtonClicked();
            }
        });

        staticToast.showWithSimpleAnimation(parentOrRootView, ANIMATION_NO_ANIMATION);

        return staticToast;
    }

    public SuperiorToast showWithActionAndAnimation(ViewGroup parentOrRootView, int animationTypeString, String actionName, final SuperiorToastActionCallback callback) {
        staticToastActionButton.setText(actionName);
        staticToastActionButton.setVisibility(View.VISIBLE);
        staticToastActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                callback.onActionButtonClicked();
            }
        });

        staticToast.showWithSimpleAnimation(parentOrRootView, animationTypeString);

        return staticToast;
    }

    public SuperiorToast setBackgroundColorToActionButton(String HexCodeColorString) {
        staticToastActionButton.setBackgroundColor(Color.parseColor(HexCodeColorString));
        return staticToast;
    }


    public SuperiorToast setTextColorToActionButton(String HexCodeColorString) {
        staticToastActionButton.setTextColor(Color.parseColor(HexCodeColorString));
        return staticToast;
    }


    public interface SuperiorToastActionCallback {

        void onActionButtonClicked();
    }

}
