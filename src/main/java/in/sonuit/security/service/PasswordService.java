package in.sonuit.security.service;

import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Base64.Decoder;


public class PasswordService {

	public String encode(String password) {

		Encoder encoder=Base64.getEncoder();
		
		String pass=encoder.encodeToString(password.getBytes());
		
		return pass;
		
		
	}
	
	public String decode(String pass) {
		
		Decoder decode=Base64.getDecoder();
		
		byte[] decPassowrd= decode.decode(pass);
		
		return new String(decPassowrd);
	}

}
