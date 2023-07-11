package wy.streaminput.msg;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @Author:王艺
 * @Project:learn
 * @File:MQSink
 * @Date:2023/7/11 13:12
 */
public interface MQSink {
    String INPUT="wy-topic";
    @Input(MQSink.INPUT)
    SubscribableChannel input();
}
