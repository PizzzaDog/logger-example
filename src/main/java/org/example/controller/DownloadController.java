package org.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

@Controller
public class DownloadController {

    @GetMapping("/download")
    public @ResponseBody byte[] downloadLog() throws IOException {
        String result = Files.readString(Path.of("src/main/resources/log_data.csv"), StandardCharsets.UTF_8);
        return result.getBytes("UTF-8");
    }
}
