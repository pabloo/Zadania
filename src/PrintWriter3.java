import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class PrintWriter3 {

	public static void main(String[] args) {
		Writer writer = null;
		{

			try {
				writer = new BufferedWriter(new OutputStreamWriter(
						new FileOutputStream("filename.txt"), "utf-8"));
				writer.write("Something... bla bla bla");
			} catch (IOException ex) {
				// report

			} finally {
				try {
					writer.close();
				} catch (Exception ex) {
				}
			}

		}

	}

}
