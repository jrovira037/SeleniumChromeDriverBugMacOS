package test

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeDriverService
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.service.DriverService
import java.nio.file.Paths
import java.util.logging.Level


fun main() {
    val currentRelativePath = Paths.get("")
    val currentPath: String = currentRelativePath.toAbsolutePath().toString()
    val driverPath = "$currentPath/src/main/resources/chromedriver_mac_87"

    System.setProperty("webdriver.chrome.driver", driverPath)

    val serviceBuilder: DriverService.Builder<*, *> = ChromeDriverService.Builder()
    val chromeDriverService = serviceBuilder.build() as ChromeDriverService

    val options = ChromeOptions()
    options.setBinary(driverPath) // avoid crash on mac

    val driver = ChromeDriver(chromeDriverService, options)

    driver.get("https://google.com")
}