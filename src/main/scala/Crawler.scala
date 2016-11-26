package com.polysoft

import scala.collection.JavaConverters._
import org.openqa.selenium.htmlunit.HtmlUnitDriver
import org.openqa.selenium.{ WebElement, By }

object Crawler {
  def main(args: Array[String]) = {
    val url = "https://sep-ori-mokumoku-day.connpass.com/event/44613/"
    crawl(url)
  }

  private def crawl(url: String): Unit = {
    val driver = new HtmlUnitDriver()
    driver.get(url)
    println(s"title: ${driver.getTitle}")

    val content = driver
      .findElement(By.xpath("//div[contains(@class, 'event_detail_area')]"))
      .getText
    println(s"content: ${content}")

    driver.findElements(By.xpath("//div[contains(@class, 'event_p_area')]/div"))
      .asScala
      .foreach{ we: WebElement =>
        val member = we.findElement(By.xpath("p[@class='name']/a")).getText
        println(s"member: ${member}")
      }
  }
}
