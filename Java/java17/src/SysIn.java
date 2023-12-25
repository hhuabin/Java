import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 
 * @Description
 * @author binn
 * @version
 * @date 2022年4月6日上午11:50:37
 *
 */
public class SysIn {
	public static void main(String[] args) throws IOException {
		// BufferedReader buf;
		// String str;
		// buf = new BufferedReader(new InputStreamReader(System.in));
		// System.out.print("请输入字符串：");
		// str = buf.readLine();
		// System.out.println("您输入的字符串是：" + str);

		Scanner reader = new Scanner(System.in);
		System.out.print("请输入字符串：");
		String s1 = reader.next();
		String s2 = reader.next();
		System.out.println("您输入的字符串s1是：" + s1);
		System.out.println("您输入的字符串s2是：" + s2);
		reader.close();


		// Scanner scanner = new Scanner(System.in);
		// System.out.println("请输入包含空格的文本：");
		// // 读取一行文本
		// String input = scanner.nextLine();
		// System.out.println("输入的文本是：" + input);
		// scanner.close();
	}
}
