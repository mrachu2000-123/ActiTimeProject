package com.actiTime.Screenshot;

import org.testng.ITestContext;
import org.testng.ITestListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CustomListener implements ITestListener {

    @Override
    public void onStart(ITestContext context) {
        // Delete the failed screenshot folder at the start of each test suite
        String screenshotFolderPath = ".//screenshots/"; // Provide the actual path
//        deleteFolder(screenshotFolderPath);
    }

//    private void deleteFolder(String folderPath) {
//        try {
//            Path path = Paths.get(folderPath);
//            Files.walk(path)
//                    .map(Path::toFile)
//                    .forEach(File::delete);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    // Implement other listener methods as needed
}
