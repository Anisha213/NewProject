package org.step;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
public static void generateJVMReport(String json) {
	File f= new File("C:\\Users\\R SABRINATHAN\\eclipse1-workspace\\Cucumberjava\\src\\test\\resources\\Reports\\JVM");
	Configuration con=new Configuration(f,"Cucumberjava");
	con.addClassifications("platform", "window");
	con.addClassifications("version", "10");
	con.addClassifications("browser", "Chrome");
	con.addClassifications("sprint", "4");
	List<String>li=new LinkedList<String>();
	li.add(json);
	ReportBuilder rb=new ReportBuilder(li,con);
	rb.generateReports();
}
}
