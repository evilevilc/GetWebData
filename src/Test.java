

//funtion 1 
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
 

import java.io.IOException;
import java.util.Iterator;



//funtion 2

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.util.EntityUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.HttpClient;



//抓下來
public class Test {
	public static void main(String[] args ){
		//test  20170427upLoad
//		try{
			//funtion 1  use	Jsoup
			String url = "http://goodinfo.tw/StockInfo/StockDividendPolicy.asp?STOCK_ID=3022";
	       try {
//	    	   File saveFile=new File("Data.txt");
//			FileWriter fw = new FileWriter("D:/input_20170424.html");
			
//			fw
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//			try {
	            Document doc = Jsoup.connect(url).get();
	            System.out.println("1 " + doc.title());
	            System.out.println("2 " + doc.toString());
	            Writer("D:/input_20170424.html", doc.toString());
	            
	            
	            Elements h1s = doc.select("span.titletext");
	 
	            Element thisOne = null;
	            for(Iterator it = h1s.iterator(); it.hasNext();)
	            {
	                thisOne = (Element)it.next();
	                System.out.println(thisOne.html());
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
//	        //test
//	        File input = new File("D:/input.html");
//	        Document docc;
//			try {
//				docc = Jsoup.parse(input, "UTF-8", "http://goodinfo.tw/StockInfo/StockDividendPolicy.asp?STOCK_ID=3022");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

//	        Elements links = docc.select("a[href]"); // a with href
//	        Elements pngs = docc.select("img[src$=.png]");
//	          // img with src ending .png
//
//	        Element masthead = docc.select("div.masthead").first();
//	          // div with class=masthead
//
//	        Elements resultLinks = docc.select("h3.r > a"); // direct a after h3
	        //test
			
			//funtion 2
//			FileWriter fw = new FileWriter("test_20170424.txt");
//			BufferedWriter bw = new BufferedWriter(fw);
//			
//			HttpClient httpClient = new DefaultHttpClient();
//			
//			HttpGet httpGet = new HttpGet("http://goodinfo.tw/StockInfo/StockDividendPolicy.asp?STOCK_ID=3022");
//			
//			HttpResponse response = httpClient.execute(httpGet);
//			
//			String str = EntityUtils.toString(response.getEntity());
//			if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
//				System.out.println(str);
//				bw.write(str);
//			}else{
//				System.out.println(response.getStatusLine());
//			}
//				//close  connection
//			httpGet.releaseConnection();
//			bw.flush();
//			fw.close();
//			bw.close();
//		}catch(Exception e){
//			e.printStackTrace();
//		}
	}
	public static void Writer(String pathName, String data)
            throws java.io.IOException {
        java.io.FileWriter writer = new java.io.FileWriter(pathName);
        // 寫入檔案
        writer.write(data);
        writer.close();
    }
}
