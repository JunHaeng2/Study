package hello.typeconverter.converter;

import hello.typeconverter.coverter.IntegerToStringConverter;
import hello.typeconverter.coverter.IpPortToStringConverter;
import hello.typeconverter.coverter.StringToIntegerConverter;
import hello.typeconverter.coverter.StringToIpPortConverter;
import hello.typeconverter.type.IpPort;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.core.convert.support.DefaultConversionService;

public class ConversionServiceTest {

    @Test
    void conversionService() {
        //등록
        DefaultConversionService conversionService = new DefaultConversionService();
        conversionService.addConverter(new StringToIntegerConverter());
        conversionService.addConverter(new IntegerToStringConverter());
        conversionService.addConverter(new IpPortToStringConverter());
        conversionService.addConverter(new StringToIpPortConverter());

        //사용
        Assertions.assertThat(conversionService.convert("10", Integer.class)).isEqualTo(10);
        Assertions.assertThat(conversionService.convert(10, String.class)).isEqualTo("10");
        IpPort result = conversionService.convert("127.0.0.1:8080", IpPort.class);
        Assertions.assertThat(result).isEqualTo(new IpPort("127.0.0.1", 8080));

        String convert = conversionService.convert(new IpPort("127.0.0.1", 8080), String.class);
        Assertions.assertThat(convert).isEqualTo("127.0.0.1:8080");
    }
}
