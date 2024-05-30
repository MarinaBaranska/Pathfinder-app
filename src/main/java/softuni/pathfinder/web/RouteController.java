package softuni.pathfinder.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import softuni.pathfinder.service.RouteService;
import softuni.pathfinder.service.dto.RouteShortInfoDTO;

@Controller
public class RouteController {

    private RouteService routeService;


    public RouteController(RouteService routeService) {
        this.routeService = routeService;
    }

    @GetMapping("/routes")
    public String routes(Model model){
        RouteShortInfoDTO randomRoute = routeService.getRandomRoute();
        //искам в темплейта който ще се върне до клиента да имам достъп то инф която сме написали в него
        model.addAttribute("route", randomRoute);


        return "routes";
    }

}
