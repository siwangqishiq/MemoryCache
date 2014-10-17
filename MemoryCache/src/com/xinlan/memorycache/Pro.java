package com.xinlan.memorycache;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Pro
{
    private ReadWriteLock mLock = new ReentrantReadWriteLock();
    private ReentrantLock lock=new ReentrantLock();
    
    public void write()
    {
        mLock.writeLock().lock();
        System.out.println(Thread.currentThread().getName() + " 线程 写操作");
        int index = 1;
        while (index < 100)
        {
            System.out.println(Thread.currentThread().getName() + " 线程 写 sub--->"+index+" of 100");
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            index++;
        }// end while
        System.out.println(Thread.currentThread().getName() + " 线程 写操作结束--end");
        mLock.writeLock().unlock();
    }

    public void read()
    {
        mLock.readLock().lock();
        System.out.println(Thread.currentThread().getName() + " 线程 读操作");
        int index = 1;
        while (index < 100)
        {
            System.out.println(Thread.currentThread().getName() + " 线程 sub--->"+index+" of 100");
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            index++;
        }// end while
        System.out.println(Thread.currentThread().getName() + " 线程 读操作结束--end");
        mLock.readLock().unlock();
    }
    
    public void doSub(){
        lock.lock();
        System.out.println(Thread.currentThread().getName() + " 线程 读操作");
        int index = 1;
        while (index < 100)
        {
            System.out.println(Thread.currentThread().getName() + " 线程 sub--->"+index+" of 100");
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            index++;
        }// end while
        System.out.println(Thread.currentThread().getName() + " 线程 读操作结束--end");
        //mLock.readLock().unlock();
        lock.unlock();
    }
}// end class
