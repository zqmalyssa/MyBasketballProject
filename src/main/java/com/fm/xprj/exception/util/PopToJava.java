package com.fm.xprj.exception.util;

import java.io.File;
import java.io.FileWriter;
import java.util.ResourceBundle;
import java.util.Set;

public class PopToJava {
	private String baseName;
	private String className;
	private String resultFileName;
	public PopToJava(String baseName) {
		this.baseName=baseName;
		String[] temp=this.baseName.split("\\.");
		int indexClassName=temp.length-1;
		this.className=temp[indexClassName];
		this.resultFileName="src/main/java/com/fm/xprj/exception/util/"+className+".java";
		System.out.println(resultFileName);
	}

	public static void main(String[] args) throws Exception{
		new PopToJava("com.fm.xprj.exception.util.UserMessages").convertToJava();
	}
	
	public  void convertToJava() throws Exception {
		
		String content=generateContent();
		writeToFile(content);
	}
	
	public  String generateContent() {
		ResourceBundle bundle=ResourceBundle.getBundle(this.baseName);
		StringBuffer result=new StringBuffer();
		StringBuffer line=new StringBuffer();
		result.append("package com.fm.xprj.exception.util;\n");
		result.append("import com.fm.xprj.exception.util.ResourceKey;\n");
		result.append("public abstract interface "+this.className+"\n");
		result.append("{\n");
		Set<String> keys=bundle.keySet();
		for(String key:keys){
			line.append("public static final ResourceKey "+key+ "= ");		
			line.append("new ResourceKey( \""+this.baseName+"\", \""+key+"\");\n");
		}
		result.append(line.toString());
		result.append("}");
		System.out.println(result.toString());	
		return result.toString();
	}
	public  void writeToFile(String content) throws Exception{
		
		FileWriter writer=new FileWriter(this.resultFileName);
		writer.write(content);
		writer.close();
		
	}
	
	
}
