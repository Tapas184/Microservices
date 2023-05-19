package com.nt.jwt;

import java.util.Base64;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JWTToken {

	public static String generateToken(String id, String sub, String skey) {
		return Jwts.builder()
				   .setId(id)
				   .setSubject(sub)
				   .setIssuer("Tapas")
				   .setIssuedAt(new Date(System.currentTimeMillis()))
				   .setExpiration(new Date(System.currentTimeMillis()+TimeUnit.MINUTES.toMillis(1)))
				   .signWith(SignatureAlgorithm.HS256, Base64.getEncoder().encode(skey.getBytes()))
				   .compact();
	}
	
	public static Claims getClaimObject(String skey, String token) {
		return Jwts.parser()
				   .setSigningKey(Base64.getEncoder().encode(skey.getBytes()))
				   .parseClaimsJws(token)
				   .getBody();
	}
	public static boolean isExpire(String skey,String token) {
		Claims claim = getClaimObject(skey, token); 
		      Date expiration = claim.getExpiration();
		      Date cdate = new Date();
		      return cdate.after(expiration);
	}
}//end of the class JWTToken 
