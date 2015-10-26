package org.dimigo.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class SaveImageFromUrl {

	public static void main(String[] args) {
	
		String ImageUrl = "https://static.dimigo.in/img/logobeta.png";
		try {
			
			URL url = new URL(ImageUrl);
			
			try(InputStream is = url.openStream();
				OutputStream os = new FileOutputStream("files/logo.png")){
				
				int result;
				byte[] buf = new byte[100];
				
				while((result = is.read(buf)) != -1){
					os.write(buf, 0, result);
				}
				System.out.println("파일 생성 완료");
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
