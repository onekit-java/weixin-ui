package demo.weixin.ui;

import android.content.Context;
import android.util.AttributeSet;

import cn.onekit.weixin.app.core.WeixinElement;

public class View extends WeixinElement  {
    public View(Context context) {
        super(context);
        _init(context);
    }

    public View(Context context,  AttributeSet attrs) {
        super(context, attrs);
        _init(context);
    }
    protected void _init(Context context){

        //this.setBackgroundColor(Color.GRAY);
    }


}
