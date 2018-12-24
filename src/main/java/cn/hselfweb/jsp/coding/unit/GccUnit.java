package cn.hselfweb.jsp.coding.unit;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

@Component
public class GccUnit {

    public void useGcc(String file,String outDir){
        Runtime run = Runtime.getRuntime();
        Process process = null; //打开记事本
        try {
            process = run.exec("gcc -o test "+file ,null, new File(outDir));
            process.waitFor();
        } catch (IOException|InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void useInText(String code,String url){
        File file =new File(url);
        Writer out = null;
        try {
            out = new FileWriter(file);
            out.write(code);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
