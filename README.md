# SeleniumChromeDriverBugMacOS

When executing `Test.kt` on MacOS an error comes up:

```dtd
...
Invalid --log-level value.
Unable to initialize logging. Exiting...
...
```

To reproduce, execute `TestKt` on MacOS. The same code on Windows or Ubuntu (using its chromedriver does work)