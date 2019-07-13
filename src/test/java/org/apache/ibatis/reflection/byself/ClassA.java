package org.apache.ibatis.reflection.byself;

import java.util.Map;

/**
 * @author liuhx
 * @desc TODO
 * @date 2019/7/13
 **/
public class ClassA<K, V> {

    protected Map<K, V> map;

    public Map<K, V> getMap() {
        return map;
    }

    public void setMap(Map<K, V> map) {
        this.map = map;
    }
}
