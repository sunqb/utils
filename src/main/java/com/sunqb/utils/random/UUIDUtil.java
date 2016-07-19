package com.sunqb.utils.random;

import java.math.BigDecimal;
import java.util.Random;
import java.util.UUID;

/**
 * UUID生成工具
 * 
 * @author sunqb
 */
public final class UUIDUtil {
    private static final char[] CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e',
            'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
            'V', 'W', 'X', 'Y', 'Z'};
    private static final Random RANDOM = new Random(System.currentTimeMillis());

    private UUIDUtil() {

    }

    /**
     * 获取UUID
     * 
     * @return
     */
    public static String getUUID() {
        return UUID.randomUUID().toString();
    }

    /**
     * 获取随机指定位数的字符串，长度越小，重复几率越大
     * 
     * @param len
     * @return
     */
    public static String getRandomString(int len) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < len; i++) {
            buffer.append(CHARS[RANDOM.nextInt(CHARS.length - 1)]);
        }

        return buffer.toString();
    }
    
    /**
     * 生成n位随机数字
     * 
     * @param bit 位数
     * @return
     */
    public static String getRandom(int bit) {
        String result = "";
        final int post = bit;
        Random rm = new Random();
        double pross = (1 + rm.nextDouble()) * Math.pow(10, post);
        BigDecimal big = new BigDecimal(pross);
        String fix = String.valueOf(big.toString());
        result = fix.substring(1, bit + 1);
        return result;
    }

}
