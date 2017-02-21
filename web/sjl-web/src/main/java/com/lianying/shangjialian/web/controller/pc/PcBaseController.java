package com.lianying.shangjialian.web.controller.pc;

/**
 * Created by luowen on 2017/2/21.
 */
public class PcBaseController {
    protected final static String topViewPath = "pc/";

    protected String  subViewPath = "";

    /**
     * 获取路径
     * @param viewName
     * @return
     */
    protected String getViewPath(String viewName)  {
        String viewPath =  ((topViewPath.endsWith("/") || topViewPath == "") ? topViewPath : topViewPath + "/") +
                ((getSubViewPath().endsWith("/") || getSubViewPath() == "") ? getSubViewPath() : getSubViewPath() + "/") +
        viewName;
        System.out.println(viewPath);
        return viewPath;
    }

    protected String getSubViewPath() {
        return subViewPath;
    }
}
