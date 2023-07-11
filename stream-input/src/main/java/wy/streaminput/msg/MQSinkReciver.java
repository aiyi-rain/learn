package wy.streaminput.msg;

import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @Author:王艺
 * @Project:learn
 * @File:MQSinkReciver
 * @Date:2023/7/11 13:21
 */
@EnableBinding(MQSink.class)
public class MQSinkReciver {
    public void MsgListen(String josn){
        System.out.println(josn);
    }
}
