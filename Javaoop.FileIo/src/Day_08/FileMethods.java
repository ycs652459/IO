package Day_08;

import java.io.*;
import java.util.Scanner;

public class FileMethods {

	public static void main(String[] args) {

		File file = new File("D:\\File.txt");
		//判断是否文件或者是目录
		if (file.exists()) {
			//判断是否是文件
			if (file.isFile()) {
				if (file.isDirectory()) {
					System.out.println("此文件是目录文件夹");
				
				}else {
					System.out.println("当前文件存在");
					System.out.println("名称：" + file.getName());
					//自定义的路径
					System.out.println("相对路径：" + file.getPath());
					//绝对路径是项目的路径下的
					System.out.println("绝对路径：" + file.getAbsolutePath());
					System.out.println("文件大小：" + file.length());
				}
				System.out.println("请按1完成删除操作：");
				Scanner input = new Scanner(System.in);
				int delete = input.nextInt();
				if (delete == 1) {
					file.delete();
					System.out.println("文件删除成功！");
				}
				
			}			
		} else {
			System.out.println("当前文件不存在");
			boolean bool = false;
			try {
				//只创建空文件，不创建文件夹
				bool = file.createNewFile();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			if (bool) {
				System.out.println("创建成功");
			}
		}
		// 当文件不存在

	}

}
