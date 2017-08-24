package demo;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by gitqh on 24/08/2017.
 */
public class SignInfoFactory {
    private static Map<String, SignInfo> pool = Maps.newHashMap();
    @Deprecated
    public static SignInfo getSignInfo() {
        return new SignInfo();
    }

    public static SignInfo getSignInfo(String key) {
        SignInfo result = null;
        if (!pool.containsKey(key)) {
            System.out.println(key+" created");
            result = new SignInfo4Pool(key);
            pool.put(key,result);
        } else {
            result = pool.get(key);
            System.out.println(key+" got from pool");
        }
        return result;
    }
}
