/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freecargo.classes;

import com.freecargo.bean.BeanTest;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.spi.Bean;

/**
 *
 * @author luis.f.ronquillo
 */
@Named(value = "mBeanCtrl")
@RequestScoped
public class MBeanCtrl implements Serializable {

    List<BeanTest> list;
    int count = 0;

    /**
     * Creates a new instance of MBeanCtrl
     */
    public MBeanCtrl() {
        list = new ArrayList<>();
        listBean();
    }

    private void listBean() {

        String word = new String();
        while (count <= 50) {
            count++;
            BeanTest bean = new BeanTest(wordGenerator(), wordGenerator(), wordGenerator(), wordGenerator(), wordGenerator(), wordGenerator());
            list.add(bean);
                      
        }

        
    }

    private String wordGenerator() {
        char[] word = new char[5];
        Random r = new Random();
        for (int i = 0; i < word.length; i++) {
            word[i] = (char) (r.nextInt(26) + (byte) 'a');
        }
        return new String(word).toUpperCase();
    }

    public List<BeanTest> getList() {
        return list;
    }
    
    

}
