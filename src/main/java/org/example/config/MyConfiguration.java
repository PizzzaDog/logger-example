package org.example.config;

import com.opencsv.CSVWriter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.FileWriter;
import java.io.IOException;

@Configuration
public class MyConfiguration {

    @Value("${data.file.path}")
    private String path;

    @Bean
    public CSVWriter getWriter() {
        CSVWriter writer = null;
        try {

            FileWriter outputFile = new FileWriter(path, true);
            writer = new CSVWriter(outputFile, '|',
                    CSVWriter.NO_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return writer;
    }
}
