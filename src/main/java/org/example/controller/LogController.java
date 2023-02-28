package org.example.controller;

import org.example.service.WriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LogController {

    @Autowired
    WriterService writerService;

    @GetMapping
    public String homePage() {
        return "dumb";
    }

    @GetMapping("/log")
    public String getPage() {
        return "log";
    }
    @PostMapping(value = "/log")
    public String writeLog(@RequestParam String message)  {
        writerService.writelog(message);
        return "done";
    }
}
