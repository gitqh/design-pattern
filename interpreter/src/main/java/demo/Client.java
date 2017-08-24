package demo;

import com.google.common.collect.Maps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * Created by gitqh on 24/08/2017.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        Map<String, Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println(expStr+":"+calculator.run(var));
    }

    private static Map<String,Integer> getValue(String expStr) throws IOException {
        Map<String, Integer> map = Maps.newHashMap();
        for (char ch: expStr.toCharArray()) {
            if (ch != '+' && ch !='-') {
                if(!map.containsKey(String.valueOf(ch))) {
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch), Integer.valueOf(in));
                }
            }
        }
        return map;
    }

    public static String getExpStr() throws IOException {
        System.out.println("please input expression:");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }
}
