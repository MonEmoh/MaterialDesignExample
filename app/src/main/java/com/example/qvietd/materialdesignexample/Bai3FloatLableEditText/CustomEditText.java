package com.example.qvietd.materialdesignexample.Bai3FloatLableEditText;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.text.InputType;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.EditText;

import com.example.qvietd.materialdesignexample.R;

/**
 * Created by qvietd on 29-04-17.
 */

@SuppressLint("AppCompatCustomView")
public class CustomEditText extends EditText {
    //co hai drawable,
    Drawable eye,eyeStrike;
    boolean visible=false;
    Boolean useTrike=false;
    Drawable drawable;
    int ALPHA= (int) (255*.7f);
    public CustomEditText(Context context) {
        super(context);
        khoiTao(null);
    }

    public CustomEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        khoiTao(attrs);
    }

    public CustomEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        khoiTao(attrs);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public CustomEditText(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    private void khoiTao(AttributeSet attrs){
        if(attrs!=null){
            TypedArray array=getContext().getTheme().obtainStyledAttributes(attrs,R.styleable.PasswordEditText,0,0);
            this.useTrike=array.getBoolean(R.styleable.PasswordEditText_useStrike,false);
        }
        eye= ContextCompat.getDrawable(getContext(), R.drawable.ic_visibility_black_24dp).mutate();
        eyeStrike=ContextCompat.getDrawable(getContext(),R.drawable.ic_visibility_off_black_24dp).mutate();
        caidat();
    }
    private void caidat(){
        setInputType(InputType.TYPE_CLASS_TEXT|(visible?InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD:InputType.TYPE_TEXT_VARIATION_PASSWORD));
        Drawable[]drawables=getCompoundDrawables();
        drawable=useTrike&&!visible?eyeStrike:eye;
        drawable.setAlpha(ALPHA);
        setCompoundDrawablesWithIntrinsicBounds(drawables[0],drawables[1],drawable,drawables[3]);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction()==MotionEvent.ACTION_UP&&event.getX()>=(getRight()-drawable.getBounds().width())){
            visible=!visible;
            caidat();
            invalidate();//kiem tra lai su kien touch tren man hinh
        }
        return super.onTouchEvent(event);
    }
}
