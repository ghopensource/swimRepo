package gss.httpclient.test;
import java.io.BufferedInputStream;//InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
public class HttpClientTest {
	
	public static void main(String[] args) throws Exception {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		
		HttpGet httpget = new HttpGet("http://www.usaswimming.org/DesktopDefault.aspx?TabId=1522&Alias=Rainbow&Lang=en");
		
		System.out.println("request: "+httpget.getRequestLine());
		
		CloseableHttpResponse response = httpclient.execute(httpget);
		BufferedReader br =new BufferedReader(new InputStreamReader(response.getEntity().getContent())) ;
		String content;
		//char c;
		while((content=br.readLine())!=null) {
			
			System.out.println(content);
		}
		br.close();
		httpclient.close();
	}

}
