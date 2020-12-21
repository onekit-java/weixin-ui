package demo.weixin.ui.core;

import cn.onekit.js.core.JsModule;
import cn.onekit.weixin.WX;

public abstract class WeixinModule extends JsModule implements WeixinFile {

    protected WX wx;

    protected WeixinModule() {
        super();
        wx = new WX();
    }
}
