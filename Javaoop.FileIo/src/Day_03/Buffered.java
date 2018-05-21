/**
 * @author Mr. Yang  
 *   
 * @date 2018年5月21日  
 */
package Day_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
/**
 * @author Mr. Yang
 * @date 2018年5月21日  
 */
public class Buffered {
	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("D:\\上级联系3.txt");
		BufferedReader br = new BufferedReader(reader);
		
		
		Writer writer = new FileWriter("D:\\上机练习3.txt");
		BufferedWriter bw = new BufferedWriter(writer);
		//bw.write("替换前：你好！我的名字是{name}，我是一只{type}，我的主人是{master}");	
		
		String line = null;
		StringBuffer sbf = new StringBuffer();
		while ((line = br.readLine())!=null) {
			sbf.append(line);		
		}
		System.out.println(sbf);
		String newString = sbf.toString().replace("{name}", "偶偶");
		newString = newString.replace("{type}", "狗狗");
		newString =newString.replace("{master}", "夏明");
		System.out.println("替换后："+newString);
		bw.write(newString);
		br.close();
		reader.close();
		bw.close();
		writer.close();
		System.out.println("已经写好");
	}

}
