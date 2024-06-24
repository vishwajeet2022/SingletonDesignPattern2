package org.example;

public class SingletonImpl {
    private static SingletonImpl INSTANCE;
    public String value;

    private  SingletonImpl(String value){
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
        this.value=value;
    }
    public static SingletonImpl getINSTANCE(String value){
        if(INSTANCE==null){
            synchronized (SingletonImpl.class){
                if(INSTANCE==null){
                    INSTANCE=new SingletonImpl(value);
                }
            }
        }
        return INSTANCE;
    }
}
