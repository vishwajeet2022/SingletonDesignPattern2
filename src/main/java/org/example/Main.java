package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for(int i=0; i<10; i++){
            String taskNo=String.valueOf(i);
            executorService.submit(()->{
                SingletonImpl singleton = SingletonImpl.getINSTANCE("Instance"+taskNo);
                System.out.println(singleton.value);
            });
        }
        executorService.shutdown();
    }
}