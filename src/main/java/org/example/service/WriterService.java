package org.example.service;

import com.opencsv.CSVWriter;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class WriterService {
    @Autowired
    CSVWriter writer;

    @SneakyThrows
    public void writelog(String message) {
        String[] data = new String[] {LocalDateTime.now().toString(), message};
            writer.writeNext(data);
            writer.flush();
        }
}
