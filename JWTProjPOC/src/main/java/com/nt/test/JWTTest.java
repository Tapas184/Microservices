package com.nt.test;

import java.util.Date;

import com.nt.jwt.JWTToken;

import io.jsonwebtoken.Claims;

public class JWTTest {

	public static void main(String[] args) {

		/*String token = JWTToken.generateToken("545578ER", "TapasRout", "Bani");
		System.out.println(token);*/
		String token="eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI1NDU1NzhFUiIsInN1YiI6IlRhcGFzUm91dCIsImlzcyI6IlRhcGFzIiwiaWF0IjoxNjg2ODg0OTQ3LCJleHAiOjE2ODY4ODUwNjd9.VYJldGcfDg2yqYtJQ5H6aEIMkPPdBWTtaGqR1bpT52I";
		  	System.out.println("=======================");
		 
			/*Claims claim = JWTToken.getClaimObject("Bani", token);
			String subject = claim.getSubject();
			String id = claim.getId();
			Date expiration = claim.getExpiration();
			String issuer = claim.getIssuer();
			Date issuedAt = claim.getIssuedAt();
			System.out.println("Clain Details :\n Username:"+subject+"\n ID: "+id+"\n Expiry Date:"+expiration+"\n IssuedBy:"+issuer+"\n IssuedAT"+issuedAt);
			*/		boolean expire = JWTToken.isExpire("Bani", token);
		System.out.println(expire);
		
	}

}
