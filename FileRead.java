import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class FileRead {


	public static void read(int begin, int count, String file)
			throws IOException {
		LineNumberReader str = new LineNumberReader(new FileReader(file));
		String line;
		int i = 1;
		str.setLineNumber(begin);
		System.out.println();
		while ((line = str.readLine()) != null && i <= count) {
			System.out.println(line);
			i++;
		}
		str.close();
	}

	public static void main(String[] args) throws IOException {
		int begin = Integer.parseInt(args[0]);
		int count = Integer.parseInt(args[1]);
		String file = args[2];		
		read(begin, count, file);
	}
}