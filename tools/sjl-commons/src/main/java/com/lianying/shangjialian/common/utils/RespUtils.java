package com.lianying.shangjialian.common.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by luowen on 2017/2/23.
 */
public final class RespUtils {
    private RespUtils() {}


    /**
     * build success struct for ajax request.
     *
     * @param msg
     * @param data
     * @return
     */
    public static Map<String, Object> success(String msg, Object data) {
        return commonResult(true, msg, data);
    }

    /**
     * build failed struct for ajax request.
     *
     * @param msg
     * @param data
     * @return
     */
    public static Map<String, Object> error(String msg, Object data) {
        return commonResult(false, msg, data);
    }

    /**
     * get default result struct
     * @param ok
     * @return
     */
    private static Map<String, Object> commonResult(Boolean ok, String msg, Object data) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("msg", msg);

        if(ok) result.put("code", 0);
        else result.put("code", 1);

        result.put("data", data);
        return result;
    }
}
