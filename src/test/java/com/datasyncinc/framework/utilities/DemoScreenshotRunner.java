package com.datasyncinc.framework.utilities;

import com.dtasyncinc.framework.helper.BaseClass;

public class DemoScreenshotRunner {

    // Simple runner to demonstrate ScreenShotUtility.takeScreenshot()
    public static void main(String[] args) {
        try {
            // Initialize driver (reads config.properties for browser and url)
            BaseClass.initializeDriver();

            // Let the page load briefly
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // ignore
            }

            // Take screenshot with custom filename (will be placed under target/screenshots)
            String saved = ScreenShotUtility.takeScreenshot("demo_run.png");
            System.out.println("Returned path: " + saved);

        } catch (Exception e) {
            System.out.println("Failed to run demo: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Quit driver if initialized
            BaseClass.quitDriver();
        }
    }

}
