package per.yan.hystrix.sdk.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author gaoyan
 * @date 2019/1/24 10:47
 */
@RequestMapping
public interface TestApi {

    @PostMapping("/test")
    String test();
}
