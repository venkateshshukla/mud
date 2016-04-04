package in.vshukla.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by venkatesh on 5/4/16.
 */
@Controller
@RequestMapping("default")
public class DefaultController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String getPerson() {
        return "Deadpool";
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public String postPerson(Model model) {
        return "Deadpool";
    }

    @RequestMapping(method = RequestMethod.PUT)
    @ResponseBody
    public String putPerson(Model model) {
        return "Deadpool";
    }

    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseBody
    public String deletePerson(Model model) {
        return "Deadpool";
    }
}