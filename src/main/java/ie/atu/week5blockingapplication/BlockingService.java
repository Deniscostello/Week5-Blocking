package ie.atu.week5blockingapplication;

import org.springframework.web.client.RestTemplate;

public class BlockingService {
    private final RestTemplate restTemplate;

    public BlockingService(RestTemplate restTemplate){
        this.restTemplate=restTemplate;
    }
}
