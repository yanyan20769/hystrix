package per.yan.hystrix.service.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import per.yan.hystrix.sdk.api.TestApi;

/**
 * @author gaoyan
 * @date 2019/1/24 10:48
 */
@RestController
public class TestController implements TestApi {

    @Override
    @PostMapping("/test")
    public String test() {
        return "service return...";
    }
}
