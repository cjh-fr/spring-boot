package myApp.time;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.joda.time.LocalTime;

@RestController
public class TimeController {

    private final AtomicLong counter = new AtomicLong();
    private final LocalTime currentTime = null;

    @RequestMapping("/time")
    public Time time() {
        return new Time(counter.incrementAndGet(),
                            currentTime);
    }
}
