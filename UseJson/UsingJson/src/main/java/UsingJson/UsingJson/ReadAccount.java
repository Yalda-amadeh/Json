package UsingJson.UsingJson;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;


public class ReadAccount {

	public static void main(String[] args) throws Exception {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		File file = new File("Account.json");
		
		Account account = objectMapper.readValue(file, Account.class);
		
		System.out.println(account);

	}

}
