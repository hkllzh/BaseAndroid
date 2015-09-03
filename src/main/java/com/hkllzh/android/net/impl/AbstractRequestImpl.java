package com.hkllzh.android.net.impl;

import android.support.v4.util.ArrayMap;

import com.hkllzh.android.net.RequestInterface;

/**
 * TODO
 * <p/>
 * lizheng -- 2015/09/03
 * <p/>
 * FastWeiB
 */
public abstract class AbstractRequestImpl implements RequestInterface {
    /**
     * 每个请求的默认url参数
     *
     * @return url参数集合
     */
    protected ArrayMap<String, String> getDefaultUrlParams() {
        return null;
    }

    /**
     * 每个请求的默认post参数
     *
     * @return post参数集合
     */
    protected ArrayMap<String, String> getDefaultPostParams() {
        return null;
    }
}
