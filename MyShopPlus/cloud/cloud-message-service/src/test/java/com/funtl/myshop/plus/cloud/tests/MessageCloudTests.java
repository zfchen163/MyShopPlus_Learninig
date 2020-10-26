package com.funtl.myshop.plus.cloud.tests;
import com.funtl.myshop.plus.cloud.producer.MessageProducer;
import java.util.Date;

import com.funtl.myshop.plus.cloud.dto.UmsAdminLoginLogDTO;
import com.funtl.myshop.plus.commons.utils.MapperUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.GetMapping;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MessageCloudTests {

    @Autowired
    private MessageProducer messageProducer;

    @Test
    public void testPrintln() throws Exception {
        UmsAdminLoginLogDTO dto = new UmsAdminLoginLogDTO();
        dto.setAdminId(1L);
        dto.setCreateTime(new Date());
        dto.setIp("0.0.0.0");
        dto.setAddress("0.0.0.0");
        dto.setUserAgent("0.0.0.0");
        System.out.println(MapperUtils.obj2json(dto));
    }

    @Test
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
