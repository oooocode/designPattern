package com.zzuli.wth.behavior.iterator;

/**
 * @Author: wth
 * @Create: 2023/3/1 - 22:54
 */
public interface Iterator {

    /**
     * 判断是否有值
     * @return
     */
    boolean hasNext();

    /**
     * 获取下一个元素
     * @return
     */
    Object next();
}
