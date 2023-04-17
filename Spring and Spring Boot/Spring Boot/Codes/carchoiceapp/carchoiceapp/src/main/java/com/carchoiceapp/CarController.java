package com.carchoiceapp;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CarController {

	@Autowired
	CarRepo carRepo;

	@PostConstruct
	public void init() {

		Car car1 = new Car("Hundai", "l10", 2019, 10000, 300000, "Petrol");
		Car car2 = new Car("Hundai", "l20", 2018, 20000, 200000, "Diesel");
		Car car3 = new Car("Hundai", "Verna", 2019, 15000, 250000, "Petrol");
		Car car4 = new Car("Tata", "Bolt", 2019, 15000, 250000, "Petrol");
		Car car5 = new Car("Maruthi Suzuki", "Ciaz", 2019, 5000, 600000, "Petrol");
		Car car6 = new Car("Honda", "jazz", 2018, 20000, 200000, "Diesel");
		Car car7 = new Car("Honda", "City", 2019, 15000, 400000, "petrol");
		Car car8 = new Car("Maruthi Suzuki", "Ertiga", 2018, 10000, 550000, "Petrol");
		Car car9 = new Car("Tata", "Nexon", 2019, 5000, 600000, "Petrol");

		List<Car> list = List.of(car1, car2, car3, car4, car5, car6, car7, car8, car9);

		carRepo.saveAll(list);
	}

	@GetMapping("/show")
	public String show() {
		System.out.println("show");
		return "index.html";
	}

	@PostMapping(value = "/getCarByName")
	public String getByName(@ModelAttribute("cars") String brand, Model model) {
		List<Car> findByBrand = carRepo.findByBrand(brand);
		model.addAttribute("cars", findByBrand);
		return "choosedCar";
	}

	@PostMapping(value = "/getByPrice")
	public String getByPrice(@ModelAttribute(name = "price") int price, Model model) {
		System.out.println(price);
		List<Car> c = new ArrayList<>(); 
		List<Car> d = new ArrayList<>(); 
		List<Car> cars = (List<Car>) carRepo.findAll();
		Car car = new Car();
		for (int i = 0; i < cars.size(); i++) {
			car = cars.get(i);
			if (car.getPrice() > 500000) c.add(car);
			else  d.add(car);
		}
		if (price >= 500000) model.addAttribute("cars", c);
		else if(price < 500000) model.addAttribute("cars", d);
		
		return "choosedCarP.html";
	}
	
	@PostMapping(value = "/bookedCar")
	public String getbookedCar(@ModelAttribute(name = "model") String car, Model model) {
		List<Car> findByModel = carRepo.findByModel(car);
		System.out.println(findByModel.stream().map(f -> f.getBrand()).toList().get(0));
		model.addAttribute("model", findByModel.stream().map(f -> f.getModel()).toList().get(0));
		model.addAttribute("brand", findByModel.stream().map(f -> f.getBrand()).toList().get(0));
		return "bookedCar";
	}
}
