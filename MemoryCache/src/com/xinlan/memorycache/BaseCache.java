package com.xinlan.memorycache;

import java.util.Collection;

public class BaseCache<T> implements ICache<T>
{
    
    public BaseCache(int maxSize){
        
    }
    
    @Override
    public boolean put(String key, T value)
    {
        return false;
    }

    @Override
    public T get(String key)
    {
        return null;
    }

    @Override
    public Collection<String> keys()
    {
        return null;
    }

    @Override
    public boolean remove(String key)
    {
        return false;
    }

    @Override
    public void clear()
    {
        
    }
}//end class
