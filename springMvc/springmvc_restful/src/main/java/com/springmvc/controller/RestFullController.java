package com.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFullController {

    @RequestMapping("/add1")
    public String add1(int a, int b, Model model) {
        int sum = a + b;

        model.addAttribute("msg", "结果为 " + sum);

        return "add";
    }

    @RequestMapping("/add2/{a}/{b}")
    public String add2(@PathVariable int a, @PathVariable int b, Model model) {
        int sum = a + b;

        model.addAttribute("msg", "结果为 " + sum);

        return "add";
    }

    @RequestMapping(value = "/add3/{a}/{b}", method = RequestMethod.POST)
    public String add3(@PathVariable int a, @PathVariable int b, Model model) {
        int sum = a + b;

        model.addAttribute("msg", "结果为 " + sum);

        return "add";
    }

   @GetMapping("/add4/{a}/{b}")
    public String add4(@PathVariable int a, @PathVariable int b, Model model) {
        int sum = a + b;

        model.addAttribute("msg", "结果为 " + sum);

        return "add";
    }
}
