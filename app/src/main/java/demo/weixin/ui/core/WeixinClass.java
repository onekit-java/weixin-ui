package demo.weixin.ui.core;

import cn.onekit.js.core.JsClass;
import cn.onekit.weixin.WX;

public abstract class WeixinClass extends JsClass implements WeixinFile {

    protected WX wx;

    protected WeixinClass() {
        super();
        wx = new WX();
    }
}
