package Controller;

import Entity.Administrator;
import Service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
@RequestMapping("/Login")
public class LoginController {
    @Autowired
    @Qualifier("AdministratorServiceImpl")
    private AdministratorService administratorService;

    @RequestMapping("/allAdmin")
    public String list(Model model) {
        List<Administrator> list = administratorService.findAll();
        model.addAttribute("list", list);
        return "failure";
    }
}
