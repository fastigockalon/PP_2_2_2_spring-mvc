package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {
    private final CarServiceImpl carService;

    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printAllCars(@RequestParam(required = false, defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", count < 5 ? carService.getList(count) : carService.getList(5));
        return "cars";
    }

}
