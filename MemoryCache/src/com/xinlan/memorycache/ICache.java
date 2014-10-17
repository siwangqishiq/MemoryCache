package com.xinlan.memorycache;

import java.util.Collection;

/**
 * �ڴ滺��ӿ�
 * @author panyi
 *
 */
public interface ICache<T>
{
    boolean put(String key,T value);
    
    T get(String key);
    
    Collection<String> keys();
    
    boolean remove(String key);
    
    void clear();
}//end class
