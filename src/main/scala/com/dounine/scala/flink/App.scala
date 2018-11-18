package com.dounine.scala.flink

import java.time.format.DateTimeFormatter
import java.time.{Duration, LocalDateTime}
import java.util

import com.dounine.scala.flink.App.LOGGER
import org.apache.flink.streaming.api.scala.{DataStream, OutputTag, _}
import org.apache.flink.api.common.functions.MapFunction
import org.apache.flink.api.java.tuple.Tuple2
import org.apache.flink.cep.PatternSelectFunction
import org.apache.flink.cep.scala.{CEP, PatternStream}
import org.apache.flink.cep.scala.pattern.Pattern
import org.apache.flink.core.fs.FileSystem
import org.apache.flink.streaming.api.datastream.{DataStreamSource, DataStreamUtils}
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment
import org.apache.flink.streaming.api.windowing.time.Time
import org.apache.flink.types.Row
import org.apache.flink.util.Collector
import org.slf4j.LoggerFactory

import scala.collection.Map

object App {


  val LOGGER = LoggerFactory.getLogger(classOf[App])


  def main(args: Array[String]): Unit = {

//    val env = StreamExecutionEnvironment.getExecutionEnvironment
//
//    val input: DataStream[Log] = env.addSource(new LogSource()).asInstanceOf[DataStream[Log]]
//
//    val pattern = Pattern.begin[Log]("start")
//      .subtype(classOf[Log])
//      .where(_.getScene.equals("500"))
//      .next("middle")
//      .subtype(classOf[Log])
//      .where(_.ccode.equals("abc"))
//      .followedBy("end")
//      .where(_.getType.equals("end"))
//      .within(Time.seconds(3))
//
//    val patternStream = CEP.pattern(input, pattern)
//
//    val warnings = patternStream
//      .select((pattern:Map[String,Iterable[Log]])=>{
//
//      })
//
//    //    val warnings: DataStream[List[Log]] = patternStream
//    //      .flatSelect((pattern: Map[String, Iterable[List[Int]]], out: Collector[List[Log]]) => {
//    //      //verifies input parameter forwarding
//    ////      assertEquals(inParam, pattern)
//    //      out.collect(pattern.get("begin").get.head)
//    //    })
//
//    val result: DataStream[Log] = patternStream
//      .select((pattern: Map[String, Iterable[Log]]) => {
//        //verifies input parameter forwarding
//        //        param.get("begin").get(0)
//        null
//      })
//
//    val result1: DataStream[Log] = patternStream
//      .flatSelect((pattern: Map[String, Iterable[Log]],out:Collector[Log]) => {
//        //verifies input parameter forwarding
//        //        param.get("begin").get(0)
//        null
//      })
//
//    val result2: DataStream[Log] = patternStream
//
//      .flatSelect((pattern: Map[String, Iterable[Log]], out: Collector[Log]) => {
//        //verifies input parameter forwarding
////        assertEquals(inParam, pattern)
//        //        out.collect(pattern.get("begin").get.head)
//      })

//    val result: DataStream[Log] = patternStream
//      .flatSelect((pattern: Map[String, Iterable[Log]], out: Collector[List[Log]]) => {
//        //      //verifies input parameter forwarding
//        ////      assertEquals(inParam, pattern)
//        //      out.collect(pattern.get("begin").get.head)
//      })
    //    patternStream.select((pattern: Map[String, Log]) => {
    //
    //    })
  }

}

