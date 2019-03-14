package com.imooc.utils.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.Date;

/**
 * User: cuiyubao
 * Date: 2019/3/13
 * Time: 下午 09:25
 */
public class Date2LongSerializer extends JsonSerializer<Date> {
    /**
     * 将时间缩小1000倍
     * @param date
     * @param jsonGenerator
     * @param serializerProvider
     * @throws IOException
     * @throws JsonProcessingException
     */
    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        jsonGenerator.writeNumber(date.getTime()/1000);
    }
}
