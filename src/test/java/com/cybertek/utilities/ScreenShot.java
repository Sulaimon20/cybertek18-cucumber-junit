package com.cybertek.utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ScreenShot {
    /**
     * This method takes a screenshot and saves it with a date&time stamp.
     * @return path to screenshot
     */
    public static void takeScreenshot(){
        TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
        byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);

        String path = System.getProperty("user.dir") + File.separator + "screenshots"+ File.separator + "image.png";
        try(FileOutputStream fileOutputStream = new FileOutputStream(path)){
            fileOutputStream.write(screenshot);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
