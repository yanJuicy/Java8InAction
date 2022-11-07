package chap03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExecuteAround {

	public static void main(String[] args) throws IOException {
		String result = processFileLimited();
		System.out.println(result);

		System.out.println("---");

		String oneLine = processFile((BufferedReader b) -> b.readLine());
		System.out.println(oneLine);

		String twoLines = processFile((BufferedReader b) -> b.readLine() + b.readLine());
		System.out.println(twoLines);
	}

	private static String processFileLimited() throws IOException {
		try (BufferedReader br =
				 new BufferedReader(new FileReader("filepath"))) {
			return br.readLine();
		}
	}

	private static String processFile(BufferedReaderProcessor p) throws IOException {
		try (BufferedReader br =
				 new BufferedReader(new FileReader("filepath"))) {
			return p.process(br);
		}
	}

}
