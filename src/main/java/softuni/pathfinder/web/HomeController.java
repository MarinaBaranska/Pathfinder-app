package softuni.pathfinder.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import softuni.pathfinder.model.Route;
import softuni.pathfinder.service.RouteService;

import java.util.Random;

@Controller//!!!
public class HomeController {

//    private final RouteService routeService;
//    //сонструктор
//    @Autowired
//    public HomeController(RouteService routeService) {
//        this.routeService = routeService;
//    }
//
//    //правим get заявка и прикачаме index html да се показва като натиснем home
//    @GetMapping("/")
//    public String home(Model model){//в модела подаваме данните които искаме да бъдат използвани в нашето View
//        //към модела добавяме нов атрибут - най коментиран път
//        Route route = routeService.getMostCommented();
//
//
//        model.addAttribute("mostCommented", route);
//
//        return "index";//връща този html

   // }

    public String  index (Model model){

        //за да подаваме рандъм ст-ст на температурата всеки път
        //подаваме променливата към темплейта html
        double sofiaTemp = new Random().nextDouble();
        model.addAttribute("sofiaTemperature",sofiaTemp);


        return "index";
    }


}
