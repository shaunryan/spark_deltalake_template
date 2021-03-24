package com.demo
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.DataFrame
import org.apache.log4j.{LogManager, Logger}
import scala.util.{Try,Success,Failure}

import com.demo.{Configuration => AppConfig}

object DeltalakeDemo extends App with SparkSessionWrapper{

  val log:Logger = LogManager.getRootLogger()

  val spark: SparkSession = getSparkSession()
  log.warn(AppConfig.toString())

  log.warn("Setup")
  val basePath = AppConfig.getDataRoot()

  spark.stop()



}