package Crawling;


import java.io.IOException;
import org.jsoup.Jsoup;
import java.text.ParseException;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class Scraping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String URL = "https://finance.naver.com/item/main.nhn?code=005930";
		Document doc;
		
		
		
		try {
			doc = Jsoup.connect(URL).get();
			Elements  elem = doc.select(".date");
			String [] str = elem.text().split(" ");
			
			
			Elements  today_list = doc.select(".new_totalinfo dl>dd");
			
			String juga = today_list.get(3).text().split(" ")[1];
			String DungRakrate = today_list.get(3).text().split(" ")[6];
			String siga = today_list.get(5).text().split(" ")[1];
			String goga = today_list.get(6).text().split(" ")[1];
			String zeoga = today_list.get(8).text().split(" ")[1];
			String volume = today_list.get(10).text().split(" ")[1];
			
			String stype = today_list.get(3).text().split(" ")[3];
			
			String vsyesterday = today_list.get(3).text().split(" ")[4];
			
			
		
			System.out.println("삼성전자 주가------------------");
			System.out.println("주가: "+ juga);
			System.out.println("등락률: "+ DungRakrate);
			System.out.println("시가: "+ siga);
			System.out.println("고가: "+ goga);
			System.out.println("저가: "+ zeoga);
			System.out.println("거래량: "+ volume);
			System.out.println("타입: "+ stype);
			System.out.println("전일대비 :" + vsyesterday);
			System.out.println("가져오는 시간 : " + str[0]+str[1]);		
					
					
			
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
