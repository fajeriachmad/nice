package com.nice.commerce.controller.page.food;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ahmad Fajri Rahman
 */

@Controller
@RequestMapping("/user")
public class FoodPageController {
    @RequestMapping("/food")
    public String foodPage() {
        return "pages/food/food";
    }
}