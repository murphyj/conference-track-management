package com.rideways.pairing.presentation;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PresentationConsumer {

    public static final String PRESENTATIONS_FILE_PATH = "presentations.txt";

    public List<Presentation> consume() {
        List<Presentation> presentations = new ArrayList<>();
        Path pathToFile = Paths.get(PRESENTATIONS_FILE_PATH);
        try (
            InputStream in = Files.newInputStream(pathToFile);
            BufferedReader reader
                    = new BufferedReader(new InputStreamReader(in))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                Pattern titlePattern = Pattern.compile("([^0-9]*)([0-9]*min|lightning)");
                Matcher matcher = titlePattern.matcher(line);
                while(matcher.find()) {
                    String title = matcher.group(1).trim();
                    String timeString = matcher.group(2);
                    presentations.add(new Presentation(title, timeString));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return presentations;
    }
}
