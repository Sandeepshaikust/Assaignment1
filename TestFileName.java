package WebDriver;

//import UtilsPackage.FileNameMaker;

public class TestFileName {
public static void main(String [] args) {
	
fileNameMaker fn= new fileNameMaker();

String currfilename= fn.fileNameForLogin("abc","def");
System.out.println(currfilename);
}
}
