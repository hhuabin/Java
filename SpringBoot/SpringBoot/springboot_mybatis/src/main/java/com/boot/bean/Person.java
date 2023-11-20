package com.boot.bean;

//import org.springframework.beans.factory.annotation.Value;
import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
/**
 * Descriptio
 * @author bin
 * @date 2022-11-18-10:05
 */
@Component
@ConfigurationProperties(prefix = "person")  // 自动加载 yml 文件中的数据， 自动加载的类必须是bean（搭配@Component使用）
@Data
@ToString
@Validated
public class Person {

    private String name;
    @Max(value = 100, message = "最大值不能超过100")
    private int age;
    @DurationUnit(ChronoUnit.HOURS)  // 小时
    private Duration serverTimeOut;
    @DataSizeUnit(DataUnit.KILOBYTES)  // KB
    private DataSize dataSize;
}
