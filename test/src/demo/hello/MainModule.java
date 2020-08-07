package demo.hello;

import org.nutz.mvc.annotation.*;

public class MainModule {

    @At("/hello")
    @Ok("jsp:jsp.hello")
    public String doHello() {
        return "Hello Nutz";
    }

}