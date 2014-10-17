package com.xinlan.memorycache;

import java.util.Collection;

/**
 * ÄÚ´æ»º´æ½Ó¿Ú
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
