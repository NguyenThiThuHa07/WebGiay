package com.example.big_projects.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrangChuController {
    @GetMapping("/trangchu")
    public String showHomePage() {
        return "TrangChu/TrangChu";
    }
}
