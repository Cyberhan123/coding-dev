package cn.hselfweb.jsp.coding.controller;

import cn.hselfweb.jsp.coding.unit.GccUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RequestMapping;

//@RepositoryRestController
//@RequestMapping(path = "coding")
public class CodingController {
   private final GccUnit gccUnit;
    @Autowired
    public CodingController(GccUnit gccUnit) {
        this.gccUnit = gccUnit;
    }
    public void getcode(String code,String outDir){
        gccUnit.useInText(code,outDir);
        String url=hashCode()+".cpp";
        gccUnit.useGcc(url,outDir);
    }
}
