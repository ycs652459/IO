/**
 * @author Mr. Yang  
 *   
 * @date 2018��5��21��  
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
 * @date 2018��5��21��  
 */
public class Buffered {
	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("D:\\�ϼ���ϵ3.txt");
		BufferedReader br = new BufferedReader(reader);
		
		
		Writer writer = new FileWriter("D:\\�ϻ���ϰ3.txt");
		BufferedWriter bw = new BufferedWriter(writer);
		//bw.write("�滻ǰ����ã��ҵ�������{name}������һֻ{type}���ҵ�������{master}");	
		
		String line = null;
		StringBuffer sbf = new StringBuffer();
		while ((line = br.readLine())!=null) {
			sbf.append(line);		
		}
		System.out.println(sbf);
		String newString = sbf.toString().replace("{name}", "żż");
		newString = newString.replace("{type}", "����");
		newString =newString.replace("{master}", "����");
		System.out.println("�滻��"+newString);
		bw.write(newString);
		br.close();
		reader.close();
		bw.close();
		writer.close();
		System.out.println("�Ѿ�д��");
	}

}
