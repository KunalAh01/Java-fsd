package com.ecommerce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
 
import com.ecommerce.entity.EProductEntity;
import com.ecommerce.service.EProductService;
@Controller
public class EProductController {

        @Autowired
            private EProductService eproductService;
            @RequestMapping(value = "/productList", method = RequestMethod.GET)
            public String listProducts(ModelMap map)
            {
                map.addAttribute("eproduct", new EProductEntity());
                map.addAttribute("productList", eproductService.getAllProducts());
                return "productList";
            }
}



//
//<property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property>
//<property name="hibernate.connection.password">Root@211</property>
//<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/mydb_phase2</property>
//<property name="hibernate.connection.username">root</property>
//<property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>

