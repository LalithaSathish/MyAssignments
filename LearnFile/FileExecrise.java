package LearnFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileExecrise {

	public static void main(String[] args) throws IOException {

		File f=new File(/*"D:\\Greens Technologies");*/
				"D:\\Greens Technologies\\Outputs\\LearnFile\\newfile.txt");
		
		//Make Directory done successfully so commentout this snippet
//		boolean makedirectory=f.mkdir();
//		System.out.println("Return result of makedirectory is: "+makedirectory);
		
//		//File Create
//		boolean newfile=f.createNewFile();
//		System.out.println("Return result of createNewFile is: "+newfile);
		//verify whether read
//		System.out.println("Return result for can read is: "+f.canRead());
//		//verify whether write
//		System.out.println("Return result for can write is: "+f.canWrite());
		
//		System.out.println("Is Directory: "+f.isDirectory());
//		System.out.println("Is File: "+f.isFile());
//		
//		File[] listFiles = f.listFiles();
//		
//		for (File file : listFiles) {
//			System.out.println(file);
//		}
//		
//		String[] list = f.list();
//		for (String string : list) {
//			System.out.println(string);
//		}
		
		List<String> readLines = FileUtils.readLines(f);
		System.out.println(readLines);
		
		FileUtils.write(f, "File created by lalitha",false);
		
		List<String> readLiness = FileUtils.readLines(f);
		System.out.println(readLiness);
		
	FileUtils.write(f, " File again modified by lalitha",true);
		
		List<String> readLinesss = FileUtils.readLines(f);
		System.out.println(readLinesss);
	}
}
