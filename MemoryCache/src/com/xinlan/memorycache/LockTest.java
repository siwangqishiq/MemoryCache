package com.xinlan.memorycache;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LockTest
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        final Pro pro =new Pro();
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        threadPool.submit(new Runnable()
        {
            @Override
            public void run()
            {
                //线程1
                pro.read();
                pro.write();
            }
        });
        
        threadPool.submit(new Runnable()
        {
            @Override
            public void run()
            {
                //线程2
                pro.write();
                pro.read();
            }
        });
        
        threadPool.shutdown();
    }
    
    
}//end calss
