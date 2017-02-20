package tutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by michaelsmith on 2/20/17.
 * Copyright Acceptto Corporation.
 */

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index() {
        return "index.html";
    }

    @RequestMapping(value = "/profilePage")
    public String profile(){
        return "profile.html";
    }
}
