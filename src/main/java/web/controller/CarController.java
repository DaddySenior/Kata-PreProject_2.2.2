package web.controller;

import org.springframework.core.style.DefaultValueStyler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CarController {

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {

        CarService carService = new CarServiceImp();
        List<Car> result = carService.getAmountOfCars(count);
        model.addAttribute("result", result);
        return "cars";
    }

}
