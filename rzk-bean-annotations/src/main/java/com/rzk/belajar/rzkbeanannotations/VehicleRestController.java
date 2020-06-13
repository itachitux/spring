package com.rzk.belajar.rzkbeanannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleRestController {

    @Autowired
    ApplicationContext ctx;

    @GetMapping("/bike/color")
    public String bikeColor() {
        Bike bike = (Bike) ctx.getBean("bike");
        return bike.getColor();
    }

    @GetMapping("/engine/fuel")
    public String engineFuel() {
        VehicleFactoryConfig config = ctx.getBean(VehicleFactoryConfig.class);
        Engine engine = config.engine();
        return engine.getFuelType();

    }
}
