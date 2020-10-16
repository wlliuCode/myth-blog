package com.myth.common.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * 字符串操作工具类
 *
 * @author qy
 * @since 1.0
 */
public class FormUtils {

    /**
     * 手机号码验证
     * @param mobile
     * @return
     */
    public static boolean isMobile(String mobile) {
        if (mobile == null) {
            return false;
        }
        String rule = "^[1][0-9][0-9]{9}$";

        Pattern pattern = compile(rule);
        Matcher matcher = pattern.matcher(mobile);
        return matcher.matches();
    }

    /**
     * 邮箱验证
     * @param email
     * @return
     */
    public static boolean isEmail(String email) {
        if (email == null && email.length()!= 11) {
            return false;
        }
        String rule = "^([a-z0-9A-Z]+[-|.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";

        Pattern pattern = compile(rule);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}
