package bidpay.fusion.backend;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class controller {
    @GetMapping("/api/health")
    public String health() {
        return "Backend is running ✅";
    }
}
