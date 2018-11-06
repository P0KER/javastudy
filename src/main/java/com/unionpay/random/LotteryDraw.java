package com.unionpay.random;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by puke on 2018/11/6
 */
public class LotteryDraw {
    public static List<String> getNameList(){
        BufferedReader br = null;
        List<String> nameList = new ArrayList<>();
        URL url = LotteryDraw.class.getClassLoader().getResource("namelist");
        File f = new File(url.getFile());
        try {
            br = new BufferedReader(new FileReader(f));
            String tmp = null;
            while((tmp = br.readLine())!= null){
                nameList.add(tmp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return nameList;
    }

    public static void main(String[] args) {
        List<String> nameList = getNameList();
        Random random = new Random();
        for(int i = 0; i < 3; i++){
            System.out.println(nameList.get(random.nextInt(nameList.size())));
        }
    }
}
