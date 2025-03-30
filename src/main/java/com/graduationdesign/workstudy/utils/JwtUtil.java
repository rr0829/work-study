package com.graduationdesign.workstudy.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import java.util.Date;
import java.util.Map;

public class JwtUtil {
    private static final String SECRET_KEY = "workStudy";
    //接收数据，生成token并返回
    public static String createToken(Map<String, Object> claims){
        return JWT.create()
                .withClaim("claims", claims)
                .withExpiresAt(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24))
                .sign(Algorithm.HMAC256(SECRET_KEY));

    }
    //解析token并返回数据
    public static Map<String, Object> parseToken(String token){
        return JWT.require(Algorithm.HMAC256(SECRET_KEY))
                .build()
                .verify(token)
                .getClaim("claims")
                .asMap();
    }
}
