package wy.streamoutput.msg;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @Author:王艺
 * @Project:learn
 * @File:MQSource
 * @Date:2023/7/11 13:06
 */
public interface MQSource {
    String OUPUT="wy-topic";
    @Output(MQSource.OUPUT)
    MessageChannel output();
}
