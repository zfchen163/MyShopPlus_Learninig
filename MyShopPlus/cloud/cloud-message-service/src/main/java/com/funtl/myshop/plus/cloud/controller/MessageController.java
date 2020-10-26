package com.funtl.myshop.plus.cloud.controller;

import com.funtl.myshop.plus.cloud.dto.UmsAdminLoginLogDTO;
import com.funtl.myshop.plus.cloud.producer.MessageProducer;
import java.util.Date;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "message")
public class MessageController {

  @Resource
  private MessageProducer messageProducer;


  @GetMapping(value = "/demo")
  public void demo() {
    UmsAdminLoginLogDTO dto = new UmsAdminLoginLogDTO();
    dto.setAdminId(1L);
    dto.setAddress("白日依山尽,黄河入海流.欲穷千里目,更上一层楼.");
    dto.setIp("192.168.1.220");
    dto.setCreateTime(new Date());
    dto.setUserAgent("花有重开日人无再少年");
    messageProducer.sendAdminLoginLog(dto);
  }
}
