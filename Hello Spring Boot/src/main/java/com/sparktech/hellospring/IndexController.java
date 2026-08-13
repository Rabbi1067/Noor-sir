package com.sparktech.hellospring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class IndexController {

    @GetMapping("/")
    public String indexPage() {
        return "index";
    }

    @GetMapping("contact-us")
    public String contactPage() {
        return "contact";
    }

    @PostMapping("submit-form") // contact-us?name=XX&email=YY&message=Hello
    public String submitForm(@ModelAttribute Contact contact) {

        log.info("Contact Form Submitted {}", contact);
        return "redirect:/contact-us";
    }

}
