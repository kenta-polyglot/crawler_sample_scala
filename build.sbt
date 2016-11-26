name := "crawler_sample_scala"

version := "1.0"

scalaVersion := "2.12.0"

libraryDependencies ++= Seq(
//  "org.seleniumhq.webdriver" % "webdriver-htmlunit" % "0.9.7376"
  "org.seleniumhq.selenium" % "htmlunit-driver" % "2.23.2",
  "org.seleniumhq.selenium" % "selenium-support" % "3.0.1",
  "net.sourceforge.htmlunit" % "htmlunit" % "2.23"
)